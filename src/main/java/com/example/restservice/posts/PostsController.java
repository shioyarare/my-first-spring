package com.example.restservice.posts;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PostsController {

    @Autowired
    PostService postService = new PostService();
    HttpHeaders headers = new HttpHeaders();
    PostsController() {
        headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8));
    }

    // get index
    @GetMapping("/posts")
    @JsonValue
    public ResponseEntity<List> indexPost() {
        return new ResponseEntity<List>(postService.searchAll(), headers, HttpStatus.OK);
    }

    // get show
    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
    public String showPost(@PathVariable("postId") String postId) {
       return "get /posts id = " + postId;
    }

    // post
    @PostMapping("/posts")
    public String setPost(@RequestParam("name") String name, @RequestParam("body") String body) {
        postService.create(name, body);
        return "post /posts";
    }

    // put
    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.PUT)
    public String updatePost() {
        return "put /posts";
    }

    // delete
    @DeleteMapping("/posts/{postId}")
    public String deletePost(@PathVariable("postId") String postId) {
        return "delete /posts id = " + postId;
    }
}
