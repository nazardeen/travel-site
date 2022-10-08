package com.travel.app.server.Repository;


import com.travel.app.server.Entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CommentRepo extends CrudRepository<Comment, UUID> {

	Comment save(Comment comment);

	ArrayList<Comment> findAllByPostID(UUID postID);
}
