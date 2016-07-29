package adv.controllers;

import adv.domains.Creative;
import adv.dtos.AdvRequest;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import adv.services.CreativeManipulationService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/creatives")
@Controller
public class CreativeResource {
    @Autowired
    private CreativeManipulationService creativeManipulationService;

    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getCreatives(AdvRequest request) {
        List<Creative> creatives = creativeManipulationService.getCreatives(request);
        return Response.status(200).entity(creatives).build();
    }
}
