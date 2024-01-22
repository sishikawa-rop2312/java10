package java10;

public class Dog extends Animal {
	int age;
	
	public Dog(String name, int age) {
		super(name);
		
		this.age = age;
	}
	
	public void bark() {
		System.out.println("ワンワン");
	}
		
	public void introduce() {
    	System.out.print("私の名前は" + this.name + "です、");
        bark();
        System.out.print("私は" + this.age + "歳です");
    }
}
