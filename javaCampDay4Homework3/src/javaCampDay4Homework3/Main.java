package javaCampDay4Homework3;

import java.time.LocalDate;

import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSalesManager;
import Concrete.GamerManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) throws  Exception {
		
		Gamer gamer = new Gamer(1,"hatice","ersoy",1987,1234567891);
		Game game = new Game(10,"Dota",(100.8),(50.8));
		Campaign campaign = new Campaign(999, "Ramazana Özel", LocalDate.of(2021,05,17));
		
		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		
		System.out.println("------------------------");
		
		GameManager gameManager= new GameManager();
		gameManager.add(game);
		
		System.out.println("---------------------");
		
		CampaignManager campaingManager = new CampaignManager();
		campaingManager.add(campaign);
		
		System.out.println("-----------------------");
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.campaingSale(game);
		
		System.out.println("-----------------------");
		
	
	}
	

}

