package br.com.alura.challengeliterAlura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public record LivroDTO (
                        @JsonAlias("title")
                        String titulo,
                        @JsonAlias("authors")
                        List<AutorDTO>autorDTO,
                        @JsonAlias("languages")
                        List<String> idioma,
                        @JsonAlias("download_count")
                        String totalDownloads) {
}
