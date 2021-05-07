package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException,RemoteException,Exception {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result= client.TCKimlikNoDogrula(
				
				gamer.getNationalityId(),
				gamer.getFirstName(),
				gamer.getLastName(),
				gamer.getDateOfBirth()
				
				
				);
		
		return result;
	}
	
}
