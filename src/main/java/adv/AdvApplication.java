package adv;

import adv.controllers.CreativeResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;


public class AdvApplication extends ResourceConfig {

    public AdvApplication() {
        register(RequestContextFilter.class);
        register(JacksonFeature.class);
        register(CreativeResource.class);
    }
}
