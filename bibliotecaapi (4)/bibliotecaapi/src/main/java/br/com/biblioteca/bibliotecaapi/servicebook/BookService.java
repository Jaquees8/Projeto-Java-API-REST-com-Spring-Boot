package br.com.biblioteca.bibliotecaapi.servicebook;


import br.com.biblioteca.bibliotecaapi.modelbook.Book;
import br.com.biblioteca.bibliotecaapi.repositorybook.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * retorna todos os livros.
     * @return Lista de livros.
     */
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    /**
     * Busca um livro pelo seu ID.
     *
     * @param id ID do livro.
     * @return Um Optional contendo o livro, se encontrando.
     */
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    /**
     * salva um novo livro ou atyaliza um livro existente.
     *
     * @param book Livro a ser salvo ou atualizado.
     * @return o livro salvo ou atualizado
     */
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Deleta um livro pelo seu ID.
     *
     * @param id ID do livro a ser deletado.
     */

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
