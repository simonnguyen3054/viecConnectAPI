package com.viecconnect.viecConnectApi.ui;

import com.viecconnect.viecConnectApi.domain.Post;
import com.viecconnect.viecConnectApi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/post")
@CrossOrigin
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public String getPosts() {return "get posts";}

    @PostMapping("")
    public ResponseEntity<?> createPost(@Valid @RequestBody Post post, BindingResult result) {

        if(result.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();

            for(FieldError error : result.getFieldErrors()) {
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
        }

        Post newPost = postService.createPost(post);

        return new ResponseEntity<Post>(newPost, HttpStatus.CREATED);

    }


}

//note:
//BindingResult => is an object so you can test for and retrieve validation errors.
