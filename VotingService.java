public class VotingService {
	private int qq = 1;				
	private Question question;					
	
	void eee(int ttt, Question newQuestion) {
		qq = ttt;
		question = newQuestion;
	}
	void goo(Student person) {
		
		if(person.sub() == false) {
			question.list(person.getAnswer(), 1);
			person.setSubmitted(true);
		}
		
		else {
			question.list(person.getPrevious(), -1);		
			question.list(person.getAnswer(), 1);			
		}
	}
	void roo() {
		System.out.println();
		System.out.println("********************************************");
		
		if(qq == 1) {
			char boi = 'A';
			for(int i = 0; i < question.getChoicesListSize(); i++) {
				System.out.print(boi + ": ");
				System.out.println(question.yyy(i));
				boi++;
			}
		}
		
		else {
				System.out.println("True: " + question.yyy(0));
				System.out.println("False: " + question.yyy(1));
		}
	}
}