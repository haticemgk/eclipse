package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi:" + game.getName());
		
	}

	@Override
	public void upDate(Game game) {
		System.out.println("Oyun g�ncellendi:" + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi:" + game.getName());
		
	}
	
	@Override
	public void campaingSale(Game game) {
		System.out.println("Oyun sat�n al�nd�:" + game.getName());
		
		
	}


}
