package com.example.gutendexapiapp.dto;

import lombok.Data;
import java.util.List;

@Data
public class GutendexResponse {
    private List<GutenLivroDto> results;
}

@Data
class GutenLivroDto {
    private String title;
    private List<GutenAutorDto> authors;
    private List<String> languages;
    private Integer download_count;
}

@Data
class GutenAutorDto {
    private String name;
}
