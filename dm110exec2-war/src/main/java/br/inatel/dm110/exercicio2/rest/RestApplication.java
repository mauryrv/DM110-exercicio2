package br.inatel.dm110.exercicio2.rest;

import java.util.Set;
import java.util.HashSet;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.exercicio2.impl.CustomerServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application{
	
@Override
public Set<Class<?>> getClasses() {
	// TODO Auto-generated method stub
	Set<Class<?>> classes = new HashSet<>();
	classes.add(CustomerServiceImpl.class);
	return classes;
}
	
}
