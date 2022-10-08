package com.travel.app.server.Repository;


import com.travel.app.server.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface PostRepository extends CrudRepository<Post, UUID> {

	ArrayList<Post> findAll();
	Post save(Post post);
	void deleteById(UUID postID);
	
}
