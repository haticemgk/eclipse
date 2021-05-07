package Entity;

import java.time.LocalDate;

public class Campaign {
	
	private int id;
	private String campaingName;
	private LocalDate campaingDate;
	
	public Campaign(int id, String campaingName, LocalDate campaingDate) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.campaingDate = campaingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public LocalDate getCampaingDate() {
		return campaingDate;
	}

	public void setCampaingDate(LocalDate campaingDate) {
		this.campaingDate = campaingDate;
	}

	
	

}
