abstract class Animal()
{
	abstract void eat();
	abstract void sleep();
}

class Lion extends Animal()
{
	@Override
	void eat()
	{
		System.out.println("Eats other animals");
	}
	@Override
	void sleep()
	{
		System.out.println("Sleeps when not hunting");
	}
}
	
class Deer extends Animal()
{
	@Override
	void eat()
	{
		System.out.println("Eats plants");
	}
	@Override
	void sleep()
	{
		System.out.println("Sleeps at night");
	}
}
	
class Lion extends Animal()
{
	@Override
	void eat()
	{
		System.out.println("Eats meat");
	}
	@Override
	void sleep()
	{
		System.out.println("Sleeps at night");
	}
}
	
class Run
{
	public static void main(String[] args)
	{
		Lion L=new Lion;
		Tiger t=new Tiger;
		Deer d=new Deer;
		L.eat();
		L.sleep();
		T.eat();
		T.sleep();
		D.eat();
		D.sleep();
	}
}