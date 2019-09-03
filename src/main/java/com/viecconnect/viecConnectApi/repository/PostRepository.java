package com.viecconnect.viecConnectApi.repository;

import com.viecconnect.viecConnectApi.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
