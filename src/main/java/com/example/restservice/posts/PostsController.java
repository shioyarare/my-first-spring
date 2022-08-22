package com.example.restservice.posts;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostsController {
    @GetMapping("/posts")
    public String indexPost() {
       return "get /posts";
    }

    @RequestMapping("/posts/{postId}")
    public String showPost(@PathVariable("postId") String postId) {
       return "get /posts id = " + postId;
    }

    @PostMapping("/posts")
    public String setPost() {
        return "post /posts";
    }
}
