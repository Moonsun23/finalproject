package global.moonsun23.finalproject.controller;

import global.moonsun23.finalproject.model.Library;
import global.moonsun23.finalproject.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LibraryController {

    @Autowired private LibraryService libsrv;
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/add")
    public String addok(Library lib) {
        libsrv.newLibrary(lib);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        List<Library> libs= libsrv.readLibrary();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        mv.addObject("libs", libs);

        return mv;
    }

}
