package com.example.gutendexapiapp.client;

import com.example.gutendexapiapp.dto.GutendexResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gutendex", url = "https://gutendex.com")
public interface GutendexClient {

    @GetMapping("/books")
    GutendexResponse searchBooks(@RequestParam("search") String searchTerm);
}
