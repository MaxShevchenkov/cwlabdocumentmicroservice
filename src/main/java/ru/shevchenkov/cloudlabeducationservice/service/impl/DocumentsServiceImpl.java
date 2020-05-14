package ru.shevchenkov.cloudlabeducationservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shevchenkov.cloudlabeducationservice.models.Document;
import ru.shevchenkov.cloudlabeducationservice.repositories.DocumentsRepo;
import ru.shevchenkov.cloudlabeducationservice.service.DocumentsService;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentsServiceImpl implements DocumentsService {

    @Autowired
    private DocumentsRepo documentsRepo;

    @Override
    public List<Document> getAll() {
        return documentsRepo.findAll();
    }

    @Override
    public Optional<Document> getById(Long id) {
        return documentsRepo.findById(id);
    }

    @Override
    public Document create(Document document) {
        documentsRepo.save(document);
        return document;
    }

    @Override
    public void delete(Long id) {
        documentsRepo.deleteById(id);
    }
}
