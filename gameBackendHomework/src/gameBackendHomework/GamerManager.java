package gameBackendHomework;

public class GamerManager implements IIsGamerReal {
	public void add() {
		System.out.println("Oyuncu eklendi");
	}
	
	public void update() {
		System.out.println("Oyuncu kay�tlar� g�ncellendi");
	}
	
	public void delete() {
		System.out.println("Oyuncu silindi");
	}

	@Override
	public void checker() {
		// TODO Auto-generated method stub
		
	}
	
}
