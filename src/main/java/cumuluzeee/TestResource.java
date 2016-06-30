package cumuluzeee;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")      
public class TestResource {  
	
	@Inject Greeter greeter;
	
	
	
  @GET          
  public String  welcome() {              
    return greeter.sayHello();
  }      
  
}