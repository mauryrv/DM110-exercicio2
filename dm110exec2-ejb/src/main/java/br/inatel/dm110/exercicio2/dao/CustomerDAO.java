package br.inatel.dm110.exercicio2.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.exercicio2.entities.Customer;

@Stateless
public class CustomerDAO {
	@PersistenceContext(unitName = "customer")
	private EntityManager em;

	public List<Customer> listAll()
	{
		return em.createQuery("from Customer c",Customer.class).getResultList();
		
	}
	
	public void insert(Customer customer) {
		em.persist(customer);
	}
}