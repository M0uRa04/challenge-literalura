package br.com.alura.challengeliterAlura.service;

import br.com.alura.challengeliterAlura.model.Autor;
import br.com.alura.challengeliterAlura.model.Livro;
import br.com.alura.challengeliterAlura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;


    public void listarAutoresCadastrados () {
        repository.findAll().forEach(a ->
                System.out.println("Nome: " + a.getNome()));
    }
    public void inserirAutorELivroNoBanco(Autor autor) {
        repository.save(autor);
    }

}
