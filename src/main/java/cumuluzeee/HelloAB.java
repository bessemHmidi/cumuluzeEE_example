package cumuluzeee;

import javax.enterprise.context.RequestScoped;

import angularBeans.api.AngularBean;

@AngularBean
@RequestScoped
public class HelloAB {

	public String sayHello(){
		
		return "hello ";
	}
	
}
