package adapters;


import java.rmi.RemoteException;
import java.time.ZoneId;

import interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
		

	@Override
	public boolean CheckIfRealPerson(entities.Customer customer){
			KPSPublicSoap client = new KPSPublicSoapProxy();
			boolean result = true;
			
			try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
			}
			catch (RemoteException e) {
				e.printStackTrace();
			}
			
			if (result) {
				
				System.out.println("saved to db: "+customer.getFirstName());
				return true;
	}else {
		return false;
	}
			}
			

}
