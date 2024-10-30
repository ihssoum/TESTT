package gi2.ensakh.devops.Controller;

import gi2.ensakh.devops.Entities.Book;
import gi2.ensakh.devops.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;


@org.springframework.web.bind.annotation.RestController

public class Controller {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/AjoutLivre")
    public ResponseEntity<Map<String, String>> AjoutLivre(@RequestBody Book book) {
        Map<String, String> response = new HashMap<>();
        try {
            bookRepository.save(book);
            response.put("message", "Book uploaded successfully");
            return ResponseEntity.status(HttpStatus.OK).body(response);  // Return a JSON response
        } catch (Exception e) {
            response.put("message", "Error uploading laktab la yomkin");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

}
