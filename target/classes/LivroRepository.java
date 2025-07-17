package com.example.gutendexapiapp.repository;

import com.example.gutendexapiapp.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
