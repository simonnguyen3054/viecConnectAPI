package com.viecconnect.viecConnectApi.service;

import com.viecconnect.viecConnectApi.domain.Post;
import com.viecconnect.viecConnectApi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
