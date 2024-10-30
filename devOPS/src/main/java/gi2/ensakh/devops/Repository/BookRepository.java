package gi2.ensakh.devops.Repository;

import gi2.ensakh.devops.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  BookRepository extends JpaRepository<Book,String> {
}
