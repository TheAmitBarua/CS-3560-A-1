


import java.util.Random;
import java.util.Scanner;


public class SimulationDriver {

	public static void main(String[] args) {

		System.out.println("----- POLLS -----");
		int choice = 0;
		Boolean park = false;
		Question QQ = new Question();
		Scanner sc = new Scanner(System.in);
		
		while(park == false) {
			System.out.println("Type of Question? (Enter 1 or 2)");
			System.out.println("1) Multiple Choice");
			System.out.println("2) True/False");
			choice = Integer.parseInt(sc.nextLine());		
			

			if(choice == 1) {						
				QQ.setQuestionType(choice);
				park = true;
				break;
			}
			
			else if(choice == 2) {					
				QQ.setQuestionType(choice);
				park = true;
				break;
			}
			else {
				System.out.println("Error (1 or 2)");
			}
		}
		System.out.println();

		System.out.print("Question Enter Here : ");
		String askedQuestion = "";
		askedQuestion = sc.nextLine();
		QQ.setQuestion(askedQuestion);
		

		if(choice == 1) {
			System.out.println("Choices?");
			int answerAmount = 0;
			answerAmount = Integer.parseInt(sc.nextLine());
		
			
			char boi = 'A';
			for(int i = 0; i < answerAmount; i++) {
				System.out.print(boi + ") ");
				String input = "";
				input = sc.nextLine();
				QQ.addToChoicesList(input);
				boi++;
			}
		}
		
		else if(choice == 2) {
			
			QQ.addToChoicesList("True");
			QQ.addToChoicesList("False");
		}
		
		System.out.println("~~ Question ~~");
		int max = 20;
		int min = 1;
		Random loco = new Random();
		int numStudents = loco.nextInt((max - min) + 1) + min;				
		Student [] arrayStudents = new Student[numStudents];				

		loco = new Random();												
		for(int i = 0; i < numStudents; i++) {
			arrayStudents[i] = new Student("Student" + i, loco.nextInt(QQ.getChoicesListSize()));
		}

		

		VotingService newVote = new VotingService();
		newVote.eee(choice, QQ);
		for(int i = 0; i < numStudents; i++) {
			newVote.goo(arrayStudents[i]);
		}	
		

		newVote.roo();
		System.out.println("Students = " + numStudents);
		
		sc.close();
		
	}
}
