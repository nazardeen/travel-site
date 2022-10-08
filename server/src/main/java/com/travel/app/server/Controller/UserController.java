package com.travel.app.server.Controller;



import com.travel.app.server.Entity.User;
import com.travel.app.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/userService")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public User saveUserMetaData(@RequestBody User user) {
		return userService.submitMetaDataOfUser(user);
	}
	
	@GetMapping("/getUserDetails")
	public ArrayList<User> getAllUserDetails() {
		return userService.retrieveAllUserDetails();
	}
	
	@GetMapping("/getAllUsers/{userID}")
	public User getUserDetail(@PathVariable("userID") String userID) {
		return userService.getUserData(userID);
	}
	
}
