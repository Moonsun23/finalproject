package global.moonsun23.finalproject.service;

import global.moonsun23.finalproject.dao.LibraryDAO;
import global.moonsun23.finalproject.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libsrv")
public class LibraryService {

    @Autowired private LibraryDAO libdao;
    public void newLibrary(Library lib) {
        libdao.insertLibrary(lib);
    }

    public List<Library> readLibrary() {

        return libdao.selectLibrary();
    }
}
