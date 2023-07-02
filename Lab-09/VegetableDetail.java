import java.util.Scanner;
abstract class Vegetable{
	Scanner string = new Scanner(System.in);
	String color;

	public abstract String toString();
}

class Potato extends Vegetable{
	@Override
	public String toString(){
		color = "Brown";
		return color;
	}

}

class Brinjal extends Vegetable{
	@Override
	public String toString(){
		color = "Violet";
		return color;
	}
}

class Tomato extends Vegetable{
	@Override
	public String toString(){
		color = "Red";
		return color;
	}
}

public class VegetableDetail{
	public static void main(String[] args) {
		Potato p = new Potato();
		System.out.println(p);
		Brinjal b = new Brinjal();
		System.out.println(b);
		Tomato t = new Tomato();
		System.out.println(t);
	}
}