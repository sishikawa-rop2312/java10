package java10;

public class WiiU extends Wii{
	public WiiU (int id) {
		super(id);
	}
	
	public void playOnGamepad(){
		System.out.println("Gamepadで遊びます");
	}
}
