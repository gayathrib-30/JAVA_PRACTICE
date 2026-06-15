class Animal
{
	String color;
	String name;
	void eat()
	{
		System.out.println("can eat");
	}
	void sleep()
	{
		System.out.println("can sleep");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("can bark");
	}
}
class Cat extends Animal
{
	void jump()
	{
		System.out.println("can jump");
	}
}
class Hierarchical 
{
	public static void main(String[] args) 
	{
		Cat c=new Cat();
		c.sleep();
		c.eat();
		c.jump();
		//c.bark()--not possible
		System.out.println(c.color);
		System.out.println(c.name);
		System.out.println("---------------------");
		Dog d=new Dog();
		d.sleep();
		d.eat();
		d.bark();
		//d.jump();--not possible
		System.out.println(d.color);
		System.out.println(d.name);
		System.out.println("---------------------");
		Animal a=new Animal();
		a.sleep();
		a.eat();
		System.out.println(a.color);
		System.out.println(a.name);
	}
}
