package eCommerceBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackend.dataAccess.abstracts.CustomerDao;
import eCommerceBackend.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<Customer>();

	public HibernateCustomerDao() {
		System.out.println("---kullan�c�lar---");
		Customer customer1 = new Customer(1, "Berkay", "Vuran", "berkay@gmail.com", "123456");
		Customer customer2 = new Customer(2, "Engin", "Demiro�", "engin@gmail.com", "123456");

		customers.add(customer1);
		customers.add(customer2);
	}

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " " + "kay�t yapt�.");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + "g�ncellendi.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + "silindi.");

	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer = customers.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		System.out.println("Kullan�c� ad�: " + customer.getFirstName());
		return customer;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Customer customer = customers.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		return customer;
	}

	@Override
	public List<Customer> getAll() {
		for (Customer customer : customers) {

			System.out.println(customer.getFirstName());
		}
		System.out.println("------------------");
		return this.customers;

	}

}