package com.praktikum.controller;

import com.praktikum.model.Author;
import com.praktikum.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    List<Author> authors() {
        log.info("Adding New Authors");

        Author author = Author.builder()
                .name("Nama Author")
                .thumbnail("author.jpg")
                .postId(new Long[]{1L})
                .build();

        authorRepository.save(author);

        return authorRepository.findAll();
    }
}












