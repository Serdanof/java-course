package gameBackendHomework;

public class CampaignManager {
	public void add() {
		System.out.println("Kampanya eklendi");
	}
	
	public void delete() {
		System.out.println("Kampanya silindi");
	}
	
	public void update() {
		System.out.println("Kampanya g�ncellendi");
	}
	
	public void work(Campaigns campaign) {
		System.out.println(campaign.details + " i�lemi uyguland�");
	}
}
