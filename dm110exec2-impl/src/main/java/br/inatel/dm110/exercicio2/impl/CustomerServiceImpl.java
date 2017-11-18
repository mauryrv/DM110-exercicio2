package br.inatel.dm110.exercicio2.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.exercicio2.api.CustomerService;
import br.inatel.dm110.exercicio2.interfaces.CustomerRemote;

@RequestScoped
public class CustomerServiceImpl implements CustomerService {
	@EJB(lookup="java:app/dm110-ejb-0.1-SNAPSHOT/CustomerBean!br.inatel.dm110.exercicio2.interfaces.CustomerRemote")
	private CustomerRemote customerBean;

	@Override
	public List<String> listAllCustomers() {
		// TODO Auto-generated method stub
		return customerBean.listCustomers();
	}

	@Override
	public void createNewCustomer(String name, String email) {
		customerBean.createNewCustomer(name,email);
		
	}
	

}
