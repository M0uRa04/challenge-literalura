package br.com.alura.challengeliterAlura.model;

import br.com.alura.challengeliterAlura.dto.LivroDTO;
import jakarta.persistence.*;
import lombok.*;

import java.text.ParseException;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private List<String> idioma;
    private Integer totalDownloads;

    @ManyToOne
    private Autor autor;

    public Livro (LivroDTO livroDTO) {
        this.titulo = livroDTO.titulo();
        this.idioma = livroDTO.idioma();

        try {
            this.totalDownloads = Integer.parseInt(livroDTO.totalDownloads());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}
