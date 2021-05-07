package Abstract;

import java.rmi.RemoteException;

import Entity.Gamer;

public interface GamerService  {
	
	void save(Gamer gamer) throws NumberFormatException,RemoteException,Exception;
	void upDate(Gamer gamer);
	void delete(Gamer gamer);

}
