package in.ineuron.Abstract;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void sound() {
		System.out.println(name+" sounds bow bow");

	}

}
