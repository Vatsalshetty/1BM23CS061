class WrongAgeException extends Exception 
{
    public WrongAgeException(String message) 
  {
        super(message);
  }
}

class Father 
{
    protected int age;

    public Father(int age) throws WrongAgeException 
  {
        if (age < 0) 
        {
            throw new WrongAgeException("Father's age is negative.");
        }
        this.age = age;
    }
}

class Son extends Father 
{
    public int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException 
  {
        super(fatherAge);
        if (sonAge < 0) 
        {
            throw new WrongAgeException("Son's age is negative.");
        }
        if (sonAge >= fatherAge) 
        {
            throw new WrongAgeException("Son's age is greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
    }
}

public class Familytree 
{
    public static void main(String[] args) 
  {
        try 
          {
            
            Son son1 = new Son(40, 15);
            System.out.println("Father's age: " + son1.age);
            System.out.println("Son's age: " + son1.sonAge);

        
            Son son2 = new Son(50, 70);
            System.out.println("Father's age: " + son2.age);
            System.out.println("Son's age: " + son2.sonAge);

        } 
        catch (WrongAgeException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("B VATSAL");
        System.out.println("1BM23CS061");
    }
}