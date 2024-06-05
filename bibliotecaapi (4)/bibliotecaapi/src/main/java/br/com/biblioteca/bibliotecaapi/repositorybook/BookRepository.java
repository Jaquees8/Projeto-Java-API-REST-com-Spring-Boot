package br.com.biblioteca.bibliotecaapi.repositorybook;

import br.com.biblioteca.bibliotecaapi.modelbook.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
