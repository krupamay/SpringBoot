package com.example;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/test")
public class TestResource {
	
	@Autowired
	private TestService testService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById() {
		List<String> result = testService.getUsers();
		
		return Response.ok(result).build();
	}

}
