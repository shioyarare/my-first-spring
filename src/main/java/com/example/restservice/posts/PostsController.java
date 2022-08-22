package com.example.restservice.posts;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class PostsController {
    HttpHeaders headers = new HttpHeaders();
    PostsController() {
        headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8));
    }

    // get index
    @GetMapping("/posts")
    @JsonValue
    public ResponseEntity<Map> indexPost() {
        Map<String, Object> map = new LinkedHashMap<>();
        return new ResponseEntity<Map>(map, headers, HttpStatus.OK);
    }

    // get show
    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
    public String showPost(@PathVariable("postId") String postId) {
       return "get /posts id = " + postId;
    }

    // post
    @PostMapping("/posts")
    public String setPost() {
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
