package com.travel.app.server.Repository;


import com.travel.app.server.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	User save(User user);
	ArrayList<User> findAll();
	User findAllByuserID(String userID);
	
}
