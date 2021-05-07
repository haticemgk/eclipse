package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager {
	
	private GamerCheckService gamerCheckService;
	public GamerManager(){
		
	}	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		
	}

	@Override
	public void save(Gamer gamer) throws Exception {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			
				super.save(gamer);
			}
		else{
				System.out.println("Not a valid person");
			}
		
	}


}
