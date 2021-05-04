package abstracts;

import entities.Customer;
import interfaces.CustomerCheckService;

public abstract class BaseCustomerCheckManager implements CustomerCheckService {
	
		@Override
		public boolean CheckIfRealPerson(Customer customer) {
			// TODO Auto-generated method stub
			return false;
		}
}
