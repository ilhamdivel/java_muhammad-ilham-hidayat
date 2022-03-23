package com.praktikum.controller;

import com.praktikum.repository.PostsRepository;
import com.praktikum.entity.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostsController {
    @Autowired
    private PostsRepository postsRepository;

    @GetMapping("/posts")
    public List<Posts> getAllNames() {
        return postsRepository.findAll();
    }

    @PostMapping("/posts")
    public Posts createNewPost(@RequestBody Posts payload) {
        return postsRepository.save(payload);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        Optional<Posts> postById = postsRepository.findById(id);

            postById.ifPresent(res -> {
                postsRepository.delete(res);
            });
    }

}
