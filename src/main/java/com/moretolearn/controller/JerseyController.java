package com.moretolearn.controller;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.PathSegment;

@Path("/jersey/{maker}")
public class JerseyController {

	@GET
	@Path("/{model:.+}/year/{year}")
	public String getData(@PathParam("maker") String maker, @PathParam("model") List<PathSegment> model, @PathParam("year") String year) {
		System.out.println(model);
		return "Jersey OK";
	}
}
