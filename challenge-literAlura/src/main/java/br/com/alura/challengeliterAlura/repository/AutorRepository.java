package br.com.alura.challengeliterAlura.repository;

import br.com.alura.challengeliterAlura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository <Autor, Long> {

    Optional<Autor> findByNomeContainingIgnoreCase(String nome);
}
