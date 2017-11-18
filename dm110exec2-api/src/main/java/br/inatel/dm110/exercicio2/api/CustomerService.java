package br.inatel.dm110.exercicio2.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public interface CustomerService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<String> listAllCustomers();
	
	@POST
	@Path("/{name}/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	void createNewCustomer(@PathParam("name") String name,@PathParam("email") String email);
}
