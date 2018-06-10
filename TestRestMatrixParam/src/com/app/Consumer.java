package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/hello")
public class Consumer {
@Path("/msg")
@GET
	public String show(@MatrixParam("eid")int id,
						@MatrixParam("ename")String nm,
						@MatrixParam("esal")double sal
			){
		return "rami reddy"+id+","+nm+""+sal;
	}
}
