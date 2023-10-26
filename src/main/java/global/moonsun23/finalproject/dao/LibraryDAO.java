package global.moonsun23.finalproject.dao;

import global.moonsun23.finalproject.model.Library;
import global.moonsun23.finalproject.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("libdao")
public class LibraryDAO {

    @Autowired private LibraryRepository libraryRepository;
    public void insertLibrary(Library lib) {
        libraryRepository.save(lib);

        System.out.println("도서관 정보 저장 완료!");

    }

    public List<Library> selectLibrary() {
        return libraryRepository.findAll();
    }
}
