package com.travel.app.server.Repository;


import com.travel.app.server.Entity.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface StatusRepo extends CrudRepository<Status, UUID> {

	Status save(Status status);
	ArrayList<Status> findAll();
}
