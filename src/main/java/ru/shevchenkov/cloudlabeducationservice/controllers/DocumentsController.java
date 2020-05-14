package ru.shevchenkov.cloudlabeducationservice.controllers;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.shevchenkov.cloudlabeducationservice.models.Document;
import ru.shevchenkov.cloudlabeducationservice.service.impl.DocumentsServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Controller for model Document {@link Document}
 */

@RestController
@RequestMapping("documents")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DocumentsController {

    @Autowired
    private DocumentsServiceImpl service;


    @GetMapping
    public List<Document> getAllDocuments() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public Optional<Document> getOneDocument(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Document createNewDocument(@RequestBody Document document) {
        document.setDateTime(LocalDateTime.now());
        return service.create(document);
    }

    @PutMapping("{id}")
    public Document updateDocument(@PathVariable("id") Document document,
                                   @RequestBody Document updatedDocument) {
        BeanUtils.copyProperties(updatedDocument, document, "id");
        document.setDateTime(LocalDateTime.now());
        return service.create(document);
    }

    @DeleteMapping("{id}")
    public void deleteDocument(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
