package org.codegreen.app.movie.api;

/**
 * Created by mishra.ashish@icloud.com
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("movieservice")
@Produces(MediaType.APPLICATION_JSON)
public class MovieService {


    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response findMovies() {

        return Response.ok("{movies:movies}", MediaType.APPLICATION_JSON).build();
    }


    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}/rating")
    @Produces(MediaType.APPLICATION_JSON)
    public Response rateMovie(@PathParam("id") final String id, @PathParam("rating") final String rating) {

        return Response.ok("{}", MediaType.APPLICATION_JSON).build();

    }

}
