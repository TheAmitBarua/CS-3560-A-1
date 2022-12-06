import java.util.Vector;

public class Question {
	private String question = "";								
	private int looo;										
	private Vector<String> choicesList = new Vector<String>(0);		
	private Vector<Integer> answerList = new Vector<Integer>(0);	
	
	public Question() {
		looo = 1;										
												
	}

	void setQuestion(String wee) {
		question = wee;
	}
	String getQuestion() {
		return question;
	}
	void setQuestionType(int ttt) {
		looo = ttt;
	}
	int getQuestionType() {
		return looo;
	}

	void addToChoicesList(String wee) {
		choicesList.add(wee);
		answerList.add(0);
	}
	String getChoicesList(int koi) {
		return choicesList.get(koi);
	}
	int getChoicesListSize() {										
		return choicesList.size();
	}
	void list(int koi, int wee) {
		answerList.set(koi, answerList.get(koi)+wee);
	}
	int yyy(int koi) {
		return answerList.get(koi);
	}
	
}