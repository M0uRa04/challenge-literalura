package br.com.alura.challengeliterAlura.repository;

import br.com.alura.challengeliterAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository <Long, Livro> {

}
