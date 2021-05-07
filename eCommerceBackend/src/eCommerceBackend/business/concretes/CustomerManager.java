package eCommerceBackend.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.business.abstracts.CustomerService;
import eCommerceBackend.business.abstracts.EmailService;
import eCommerceBackend.dataAccess.abstracts.CustomerDao;
import eCommerceBackend.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private AuthService authService;
	private EmailService emailService;
	
	public CustomerManager(CustomerDao customerDao, AuthService authService, EmailService emailService) {
		super();
		this.customerDao = customerDao;
		this.authService = authService;
		this.emailService = emailService;
	}
	
	List<Customer> users=new ArrayList<Customer>();
	public CustomerManager() {
		users.add((Customer) this.getAll());
	}
	
	@Override
	public void add(Customer customer) {
		if (customerCheck(customer.getEmail()) &&authService.validate(customer)) {
			customerDao.add(customer);
			System.out.println("Do�rulama kodunuz e-posta olarak g�nderildi. Do�rulama kodunuz: " + emailService.mailSend());
			System.out.println("Do�rulama kodunu giriniz: ");
			return;
		}
		System.out.println("Kullan�c� bilgilerini kontrol ediniz.");
		
	}

	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
		
	}

	@Override
	public void update(Customer customer) {
		this.customerDao.update(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		Customer result=this.customerDao.getCustomer(id);
		return result;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> result=this.customerDao.getAll();
		return result;
	}

	@Override
	public void customerVerify(Customer customer, int verificationCode) {
		int result=emailService.mailSend();
		if(result==verificationCode) {
			System.out.println("Kullan�c� do�ruland�. �yeli�iniz ba�ar�yla do�ruland�: " + customer.getFirstName());
		}else {
			System.out.println("Do�rulama kodunu hatal� girdiniz.");
		}
		
	}
	
	public boolean customerCheck(String mail) {
		if (customerDao.getCustomerByEmail(mail) != null) {
			System.out.println("Kullan�c� zaten mevcut");
			return false;
		}
		return true;
	}


}
