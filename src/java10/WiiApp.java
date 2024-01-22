package java10;

import java.util.Scanner;

public class WiiApp {

	public static void main(String[] args) {
		Wii wii = new Wii(100);
		WiiU wiiU = new WiiU(100);

		while (true) {
			System.out.print("1.Wiiで遊ぶ,2.WiiUで遊ぶ,3.終わり>");

			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				playWii(wii, scanner);
				break;
			case 2:
				playWiiU(wiiU, scanner);
				break;
			case 3:
				System.out.print("アプリケーション終了");
				scanner.close();
				return;
			}
		}
	}
	
	public static void playWii (Wii wii, Scanner scanner) {
		while(true) {
			System.out.print("1.シリアル確認,2.TVで遊ぶ,3.quit>");
			int wiiSelect = scanner.nextInt();
			switch (wiiSelect) {
			case 1:
				wii.checkId();
				break;
			case 2:
				wii.playOnTV();
				break;
			case 3:
				System.out.println("Wiiを置いた");
				return;
			}
		}
	}
	
	public static void playWiiU (WiiU wiiU, Scanner scanner) {
		while(true) {
			System.out.print("1.シリアル確認,2.TVで遊ぶ,3.Gamepadで遊ぶ,4.quit>");
			int wiiUSelect = scanner.nextInt();
			switch (wiiUSelect) {
			case 1:
				wiiU.checkId();
				break;
			case 2:
				wiiU.playOnTV();
				break;
			case 3:
				wiiU.playOnGamepad();
				break;
			case 4:
				System.out.println("WiiUを置いた。");
				return;
			}
		}
	}

}