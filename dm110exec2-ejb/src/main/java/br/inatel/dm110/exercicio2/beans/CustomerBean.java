package br.inatel.dm110.exercicio2.beans;


import br.inatel.dm110.exercicio2.dao.CustomerDAO;
import br.inatel.dm110.exercicio2.entities.*;
import br.inatel.dm110.exercicio2.interfaces.CustomerLocal;
import br.inatel.dm110.exercicio2.interfaces.CustomerRemote;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(CustomerRemote.class)
@Local(CustomerLocal.class)
public class CustomerBean implements CustomerLocal, CustomerRemote {

	@EJB
	private CustomerDAO customerDAO;
	
	@Override
	public List<String> listCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.listAll().stream().map(Customer::getName).collect(Collectors.toList());
	}

	@Override
	public void createNewCustomer(String name, String email) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setEmail(email);
		customerDAO.insert(customer);
		
	}



}
