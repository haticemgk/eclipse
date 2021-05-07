package Concrete;

import Abstract.CampaingService;
import Entity.Campaign;

public class CampaignManager implements CampaingService {

	@Override
	public void add(Campaign campaing) {
		System.out.println("campaing eklendi:" + campaing.getCampaingName());
		
	}

	@Override
	public void upDate(Campaign campaing) {
		System.out.println("campaing güncellendi:" + campaing.getCampaingName());
		
	}

	@Override
	public void delete(Campaign campaing) {
		System.out.println("campaing silindi:" + campaing.getCampaingName());
		
	}

}
