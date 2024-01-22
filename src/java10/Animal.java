package java10;

public class Animal {
	String name;

    public Animal(){
    	this.name = "ポチ";
    }
    
    public Animal(String name){
    	this.name = name;
    }
    
    public void introduce() {
    	System.out.println("私の名前は" + this.name + "です");
    }
}
