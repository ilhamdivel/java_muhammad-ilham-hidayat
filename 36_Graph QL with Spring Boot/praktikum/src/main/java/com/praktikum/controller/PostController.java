package com.praktikum.controller;

import com.praktikum.model.Post;
import com.praktikum.repository.AuthorRepository;
import com.praktikum.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    List<Post> recentPosts(@Argument int count, @Argument int offset) {
        log.info("Getting All Recent Post");
        Pageable paging = PageRequest.of(count,offset);
        List<Post> postList = new ArrayList<>();
        Page<Post> postPage = postRepository.findAll(paging);

        for (Post post : postPage) {
            postList.add(Post.builder()
                    .id(post.getId())
                    .title(post.getTitle())
                    .text(post.getText())
                    .category(post.getCategory())
                    .author(post.getAuthor())
                    .build());
        }
        return postList;
    }

    @MutationMapping
    Post writePosts(@Argument String title, @Argument String text, @Argument String category) {
        log.info("Creating New Post");
        Post post = Post.builder()
                .title(title)
                .text(text)
                .category(category)
                .author(authorRepository.findById(1L).get())
                .build();

        postRepository.save(post);
        return post;
    }


















}
