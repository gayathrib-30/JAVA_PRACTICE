class Bird
{
	void fly()
	{
		System.out.println("I can Fly");
	}
}
interface Fish
{
	void swim();
}
interface Animal
{
	void jump();
	
}
//WE SHOULD TAKE EXTENDS FIRST AND THEN ONLY IMPLEMENTS
class SuperHero  extends Bird implements Fish,Animal
{
	@Override
		public void swim()
	{
		System.out.println("I can swim");
	}
	public void jump()
	{
		System.out.println("I can jump");
	}
	//FOR SUPERHERO CLASS--THIS METHOD
	void run()
	{
		System.out.println("I can run");
	}
}
class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		SuperHero s=new SuperHero();
		s.fly();
		s.swim();
		s.jump();
		s.run();
	}
}
