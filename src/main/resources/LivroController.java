package com.example.gutendexapiapp.controller;

import com.example.gutendexapiapp.model.Livro;
import com.example.gutendexapiapp.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping("/search")
    public Livro buscarELiberar(@RequestParam String q) {
        return livroService.buscarESalvarLivro(q);
    }

    @GetMapping
    public List<Livro> listarTodos() {
        return livroService.listarLivros();
    }
}
