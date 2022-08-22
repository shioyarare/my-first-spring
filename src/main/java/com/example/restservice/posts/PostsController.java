package com.example.restservice.posts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    @GetMapping("/posts")
    public String getAllPosts() {
       return "get /posts";
    }

    @PostMapping("/posts")
    public String setPost() {
        return "post /posts";
    }
}
