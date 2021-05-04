package services;

import abstracts.BaseCustomerManager;
import entities.Customer;
import interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
		CustomerCheckService _customerCheckService;
		
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			super();
			_customerCheckService = customerCheckService;
		}

		public void Save(Customer customer) {
			
			if(_customerCheckService.CheckIfRealPerson(customer)) {
				
				super.Save(customer);
			}else {
				System.out.println("Not a valid person");
			}
					
		}
		

		
}
