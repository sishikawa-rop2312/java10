package java10;

public class Wii {
	int id;
	
	public Wii (int id) {
		this.id = id;
	}
	
	public void playOnTV(){
		System.out.println("TVで遊びます。");
	}
	
	public void checkId(){
		System.out.println("SerialID:" + this.id);
	}
}
