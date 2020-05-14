package ru.shevchenkov.cloudlabeducationservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.shevchenkov.cloudlabeducationservice.models.Document;


@Repository
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface DocumentsRepo extends JpaRepository<Document, Long> {
}
