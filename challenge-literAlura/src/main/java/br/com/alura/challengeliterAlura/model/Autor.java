package br.com.alura.challengeliterAlura.model;

import br.com.alura.challengeliterAlura.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Livro> livros;

    public Autor (AutorDTO autorDTO) {
        this.nome = autorDTO.nome();
        this.dataNascimento = LocalDate.parse(autorDTO.dataNascimento());

        try {
            this.dataFalecimento = LocalDate.parse(autorDTO.dataFalecimento());
        } catch (NullPointerException e) {
            this.dataNascimento = null;
        }
    }

    public void setLivros (List<Livro> livros) {
        livros.forEach(l -> l.setAutor(this));
        this.livros = livros;
    }
}
