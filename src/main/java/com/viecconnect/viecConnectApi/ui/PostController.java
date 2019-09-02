package com.viecconnect.viecConnectApi.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/post")
@CrossOrigin
public class PostController {

    @GetMapping("/all")
    public String getPosts() {return "get posts";}

}
