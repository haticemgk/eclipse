package Abstract;

import java.rmi.RemoteException;

import Entity.Gamer;

public abstract class BaseGamerManager implements GamerService {
	
	@Override
	public void save(Gamer gamer) throws NumberFormatException,RemoteException,Exception{
		System.out.println("Oyuncu kaydedildi:" + gamer.getFirstName());
	}
	@Override
	public void upDate(Gamer gamer) {
		System.out.println("Oyuncu güncellendi:" + gamer.getFirstName());
		
	}
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:" + gamer.getFirstName());
		
	}
	
	

}
