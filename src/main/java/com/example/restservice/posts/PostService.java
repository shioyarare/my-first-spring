package com.example.restservice.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> searchAll() {
        return postRepository.findAll();
    }

    public void create(String name, String body) {
        Post post = new Post();

        Date now = new Date();
        post.setName(name);
        post.setBody(body);
        post.setCreated_at(now);
        post.setUpdated_at(now);

        postRepository.save(post);
    }

}
