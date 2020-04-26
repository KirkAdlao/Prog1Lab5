import java.util.*;
/* Java program that identifies and output the names with highest and lowest 
score, the total amount of grades processed, and the average score of all processed
*/

public class Score {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students");
		int numOfStudents = sc.nextInt();
		System.out.println("Enter a student name:");
		String student1 = sc.next();
		System.out.println("Enter a student score:");
		double score1 = sc.nextDouble();

		for(int i = 0; i < numOfStudents - 1; i++) {
			System.out.println("Enter a student name:");
			String student = sc.next();
			System.out.println("Enter a student score:");
			double score = sc.nextDouble();

			if(score > score1) {
				student1 = student;
				score1 = score;
			}
		}

		System.out.println((new StringBuilder("Top student"))
			.append("'s scores is ").append(score1).toString());

		System.out.println("Grades processed:" + numOfStudents);
	}
}