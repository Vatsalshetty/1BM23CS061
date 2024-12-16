import java.util.Scanner;

public class Student
{
    String usn;
    String name;
    int[] credits = new int[5];
    int[] marks = new int[5];
   
    public void studentInfo(String usn, String name) 
  {
        this.usn = usn;
        this.name = name;
  }

    public void enterCreditsAndMarks() 
  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("Enter credits for 5 subjects: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Subject " + (i + 1) + " credits: ");
            credits[i] = scanner.nextInt();
        }
    }
  
    public void display() 
  {
        System.out.println("\nStudent Information:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Credits: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + credits[i]);
        }

        // Calculate GPA
        int totalCredits = 0;
        int weightedSum = 0;
        for (int i = 0; i < 5; i++) 
        {
            totalCredits += credits[i];
            weightedSum += marks[i] * credits[i];
        }
        float gpa = (float) weightedSum / totalCredits;

        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) 
  {
        Student student = new Student();
        student.studentInfo("1BMACS001", "ABC");
        student.enterCreditsAndMarks();
        student.display();
	System.out.println("B VATSAL");
	System.out.println("1BM23CS061");

    }
}