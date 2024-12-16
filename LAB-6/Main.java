import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5];
            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++) 
            {
                internalMarks[j] = sc.nextInt();
            }
            internals[i] = new Internals(usn, name, sem, internalMarks);

            int[] seeMarks = new int[5];
            System.out.println("Enter SEE marks for 5 courses:");
            for (int j = 0; j < 5; j++) 
            {
                seeMarks[j] = sc.nextInt();
            }
            externals[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\nFinal Marks for each student:");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) 
            {
                int finalMarks = internals[i].internalMarks[j] + (externals[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }
    }
}