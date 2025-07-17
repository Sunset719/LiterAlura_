package com.example.gutendexapiapp.service;

import com.example.gutendexapiapp.client.GutendexClient;
import com.example.gutendexapiapp.dto.GutendexResponse;
import com.example.gutendexapiapp.model.Livro;
import com.example.gutendexapiapp.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;
    private final GutendexClient gutendexClient;

    public Livro buscarESalvarLivro(String termo) {
        GutendexResponse resposta = gutendexClient.searchBooks(termo);

        if (resposta.getResults().isEmpty()) {
            return null;
        }

        var dto = resposta.getResults().get(0);

        Livro livro = Livro.builder()
                .titulo(dto.getTitle())
                .autor(dto.getAuthors().isEmpty() ? "Desconhecido" : dto.getAuthors().get(0).getName())
                .idioma(dto.getLanguages().isEmpty() ? "" : dto.getLanguages().get(0))
                .downloadCount(dto.getDownload_count())
                .build();

        return livroRepository.save(livro);
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }
}
