package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerCheckManager implements GamerCheckService {
	

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException, Exception {
		// TODO Auto-generated method stub
		return true;
	}

	
}
