package com.travel.app.server.Service;


import com.travel.app.server.Entity.Status;
import com.travel.app.server.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class StatusService {

	@Autowired
	StatusRepo statusRepo;
	
	public Status saveStatus(Status status) {
		
		Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);
		
		status.setStatusID(UUID.randomUUID());
		status.setUploadTIme(dateTime);
		return statusRepo.save(status);
	}
	
	public ArrayList<Status> getAllStatus(){
		ArrayList<Status> result=new ArrayList<Status>();
		result=statusRepo.findAll();
		result.sort((e1, e2) -> e2.getUploadTIme().compareTo(e1.getUploadTIme()));
		return result;
	}
}

