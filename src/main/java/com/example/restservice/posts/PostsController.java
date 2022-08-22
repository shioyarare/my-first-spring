package com.example.restservice.posts;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostsController {
    @GetMapping("/posts")
    public String indexPost() {
       return "get /posts";
    }

    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
    public String showPost(@PathVariable("postId") String postId) {
       return "get /posts id = " + postId;
    }

    @PostMapping("/posts")
    public String setPost() {
        return "post /posts";
    }

    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.PUT)
    public String updatePost() {
        return "put /posts";
    }

    @DeleteMapping("/posts/{postId}")
    public String deletePost(@PathVariable("postId") String postId) {
        return "delete /posts id = " + postId;
    }
}
