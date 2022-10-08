package com.travel.app.server.Controller;


import com.travel.app.server.Entity.Post;
import com.travel.app.server.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/postService")
public class PostController {
	
	@Autowired
	PostService postService;

	@PostMapping("/save")
	public ArrayList<Post> submitPost(@RequestBody Post body){
		ArrayList<Post> result=postService.submitPostToDB(body);
		return result;
	}
	
	@GetMapping("/getPost")
	public ArrayList<Post> retrieveAllPost(){
		ArrayList<Post> result=postService.retrivePostFromDB();
		result.sort((e1, e2) -> e2.getDateTime().compareTo(e1.getDateTime()));
		return result;
	}
	
	@DeleteMapping("/delete/{postId}")
	public ArrayList<Post> deleteParticularPost(@PathVariable("postId") UUID postID){
		ArrayList<Post> result=postService.deletePostFromDB(postID);
		return result;
	}
	
	
}
