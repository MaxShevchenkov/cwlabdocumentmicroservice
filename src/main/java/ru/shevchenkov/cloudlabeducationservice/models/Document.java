package ru.shevchenkov.cloudlabeducationservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 Model "Document" for DocumentationService
 */


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 500)
    private String title;
    @Column(length = 500)
    private String description;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column
    private String body;
    @Column
    private String link;
    @Column
    private String author;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime dateTime;




}
