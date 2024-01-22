package java10;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("本のページ数を入力してください >");
		int bookPage = scanner.nextInt();
		System.out.print("本の価格を入力してください >");
		int bookPrice = scanner.nextInt();
		Book book = new Book(bookPage, bookPrice);

		System.out.print("ノートのページ数を入力してください >");
		int notePage = scanner.nextInt();
		System.out.print("ノートの価格を入力してください >");
		int notePrice = scanner.nextInt();
		NoteBook note = new NoteBook(notePage, notePrice);

		scanner.nextLine();

		while (true) {
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				book.displayInfo();
				break;
			case 2:
				note.displayInfo();
				break;
			case 3:
				System.out.print("書き込む内容を入力してください >");
				scanner.nextLine();
				String text = scanner.nextLine();
				note.addContent(text);
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				scanner.close();
				return;
			}
		}
	}
}