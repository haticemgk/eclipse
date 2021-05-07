package Abstract;

import java.rmi.RemoteException;

import Entity.Gamer;

public interface GamerCheckService {

	boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException,RemoteException,Exception;;

}
