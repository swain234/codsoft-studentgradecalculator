 import java.util.Scanner;
public class StudentGradeCalculator{
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
	System.out.println("Student Grade Calculator"); 
	System.out.print ("Enter the number of subjects: ");
	int numSubjects = s.nextInt();
	int totalMarks = 0; 
	char[] subjectGrades =new char[numSubjects];
    for (int i = 1; i <= numSubjects; i++) {

	System.out.print("Enter marks for Subject" + i + " (out of 100):");
    int marks =s.nextInt();
	totalMarks += marks;
double percentage=(marks/100.0)*100.0;
char grade=calculateGrade(percentage);
subjectGrades[i-1]=grade;
    }
double averagepercentage=(double) totalMarks/numSubjects;
char overallGrade=calculateGrade(averagepercentage);


System.out.println("Total Marks:" +totalMarks);

System.out.println("Average Percentage:"+ averagepercentage + "%");

System.out.println("Subject drades! "+new String(subjectGrades));
System.out.println("overall Grade:"+ overallGrade);

    s.close();
}
public static char calculateGrade(double percentage) {
	if(percentage>=90)
	{
return 'A';
	}
else if (percentage >=80)
{
	return 'B';
}
else if (percentage >=70)
{
return 'C';
}
else if (percentage >=60)
{
return 'D';
}
else
{
	return 'F';
}
}
}