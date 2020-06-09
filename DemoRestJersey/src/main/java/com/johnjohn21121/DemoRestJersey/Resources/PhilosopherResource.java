package com.johnjohn21121.DemoRestJersey.Resources;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.johnjohn21121.DemoRestJersey.Philosopher;

@Path("philosophers")
public class PhilosopherResource {
	
	PhilosopherRepository repo = new PhilosopherRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Philosopher> getPhilosophers() {
		return repo.getPhilosophers();
	}
	
	@GET
	@Path("philosopher/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Philosopher getPhilosopherByID(@PathParam("id") int id) throws SQLException {
		return repo.getPhilosopherById(id);
	}
	
	@POST
	@Path("philosopher")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Philosopher createPhilosopher(Philosopher ph1) {
		repo.create(ph1);
		return ph1;
	}
	
	@PUT
	@Path("philosopher")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Philosopher updatePhilosopher(Philosopher ph1) {
		if(repo.getPhilosopherById(ph1.getId()).getId()==0) {
			repo.create(ph1);
		}else {
			repo.update(ph1);	
		}
		return ph1;
	}
	
	@DELETE
	@Path("philosopher/{id}")
	public Philosopher deletePhilosopher(@PathParam("id") int id) {
		Philosopher ph1 = repo.getPhilosopherById(id);
		if(ph1.getId()!=0) {
		repo.delete(id);
		}
		return ph1;
	}
	
}
