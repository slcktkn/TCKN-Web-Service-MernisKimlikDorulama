import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import entities.Customer;
import services.CustomerCheckManager;
import services.NeroCustomerManager;
import services.StarbucksCustomerManager;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer ();
		customer.setFirstName("Selçuk");
		customer.setLastName("Tekin");
		customer.setNationalityId("17054074536");
		customer.setDateOfBirth(new GregorianCalendar(1987, 4, 1).getTime());
		
		baseCustomerManager.Save(customer);	

	}

}
