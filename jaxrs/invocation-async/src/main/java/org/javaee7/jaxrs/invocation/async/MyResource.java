package org.javaee7.jaxrs.invocation.async;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Arun Gupta
 */
@Path("resource")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String get() {
        System.out.println("get");
        return "foobar";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String post(@FormParam("name") String name, @FormParam("age") int age) {
        System.out.println("post");
        return name + String.valueOf(age);
    }
}
