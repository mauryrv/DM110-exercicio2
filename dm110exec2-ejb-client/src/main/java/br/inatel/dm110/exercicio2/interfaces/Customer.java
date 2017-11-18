package br.inatel.dm110.exercicio2.interfaces;

import java.util.List;
public interface Customer {

	List<String> listCustomers();
	void createNewCustomer(String name, String email);
	
}
