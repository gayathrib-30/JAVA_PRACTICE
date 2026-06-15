class Animal
{
	void eat()
	{
		System.out.println("can eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}
class Puppy extends Dog
{
	void play()
	{
		System.out.println("puppy is playing");
	}
}
class MultiLevel 
{
	public static void main(String[] args) 
	{
		//here everything is possible
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.play();
		Animal a=new Animal();
		a.eat();
		//a.bark();---not possible
		Dog d=new Dog();
		d.eat();
		d.bark();
		//d.play();---not possible
	}
}
