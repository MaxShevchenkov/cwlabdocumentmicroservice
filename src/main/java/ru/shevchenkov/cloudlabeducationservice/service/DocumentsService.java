package ru.shevchenkov.cloudlabeducationservice.service;

import org.springframework.stereotype.Service;
import ru.shevchenkov.cloudlabeducationservice.models.Document;

import java.util.List;
import java.util.Optional;

@Service
public interface DocumentsService {

    List<Document> getAll();

    Optional<Document> getById(Long id);

    Document create(Document document);

    void delete(Long id);
}
