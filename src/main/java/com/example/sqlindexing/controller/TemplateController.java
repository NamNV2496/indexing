package com.example.sqlindexing.controller;

import com.example.sqlindexing.domain.Indexing;
import com.example.sqlindexing.repository.IndexingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TemplateController {
    private final IndexingRepository indexingRepository;

    @GetMapping("/test")
    public Indexing getIndexing() {
        return indexingRepository.findById(1L).get();
    }
}
