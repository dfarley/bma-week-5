
public class Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[]{
			new Animal(),
			new Cat(),
			new Dog()
		};
		for( Animal animal : animals ) {
			animal.talk();
		}
	}
	
	public void talk() {
	}
}

class Cat extends Animal {
	public void talk() {
		System.out.println("meow");
	}
}


class Dog extends Animal {
	public void talk() {
		System.out.println("woof");
	}
}
