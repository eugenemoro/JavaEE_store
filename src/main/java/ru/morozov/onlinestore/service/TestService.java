package ru.morozov.onlinestore.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/test")
@WebService
public class TestService {

	@GET
	@Path("/date")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public Date getDate() {
		return new Date();
	}
}
