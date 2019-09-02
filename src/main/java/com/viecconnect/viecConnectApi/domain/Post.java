package com.viecconnect.viecConnectApi.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "Post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Phone number cannot be blank")
    @Column(nullable = false)
    private String phone_number;

    @NotBlank(message = "Post content cannot be blank")
    @Column(nullable = false)
    private String post_content;
    
    @NotBlank(message = "Post header cannot be blank")
    @Column(nullable = false)
    private String post_header;

    public Post() {
    }

    public Post(String phone_number, String post_content, String post_header) {
        this.phone_number = phone_number;
        this.post_content = post_content;
        this.post_header = post_header;
    }
}
