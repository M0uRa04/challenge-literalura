package br.com.alura.challengeliterAlura.principal;

import br.com.alura.challengeliterAlura.dto.ResponseDTO;
import br.com.alura.challengeliterAlura.service.ConsumoApi;
import br.com.alura.challengeliterAlura.service.ConverteDados;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books?search=";

    public void exibeMenu () {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                1 - Buscar livro pelo título
                2 - Listar livros registrados
                3 - Listar autores registrados
                4 - Listar autores vivos em determinado ano
                5 - Listar livros em um determinado idioma
                
                
                0 - Sair                                 
                """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivro();
                    break;
//                case 2:
//                    buscarEpisodioPorSerie();
//                    break;
//                case 3:
//                    listarSeriesBuscadas();
//                    break;
//
//                case 4:
//                    buscarSeriesPorTitulo();
//                    break;
//                case 5:
//                    buscarSeriesPorAtor();
//                    break;
//                case 6:
//                    buscarTop5Series();
//                    break;
//                case 7:
//                    buscarSeriesPorCategoria();
//                    break;
//                case 8:
//                    filtrarSeriesPorTemporadaEAvaliacao();
//                    break;
//                case 9:
//                    buscarEpisodioPorTrecho();
//                    break;
//                case 10:
//                    topEpisodiosPorSerie();
//                    break;
//                case 11:
//                    buscarEpisodiosDepoisDeUmaData();
//                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

    private void buscarLivro() {
        System.out.println("Por favor digite o titulo do livro desejado: ");
        var tituloLivro = leitura.nextLine();
        var json = consumoApi.obterDados(ENDERECO + tituloLivro.replaceAll(" ", "%20").trim());
        System.out.println(json);
        var reponse = conversor.converterDados(json, ResponseDTO.class);
        System.out.println(reponse);
    }

}
