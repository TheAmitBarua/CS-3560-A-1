public class Student {
	private String ID;						
	private int Answer;						
	private Boolean submitted = false;		
	private int previous;					
	
	public Student() {
		ID = "";							
		Answer = 0;							
		previous = 0;
	}
	public Student(String newID, int newAnswer) {
		ID = newID;
		Answer = newAnswer;
	}
	
	String getID() {
		return ID;
	}
	void setID(String wee) {
		ID = wee;
	}
	int getAnswer() {
		return Answer;
	}
	void setAnswer(int wee) {
		if(submitted == false)
			Answer = wee;
		else {
			previous = Answer;
			Answer = wee;
		}
	}
	Boolean sub() {
		return submitted;
	}
	void setSubmitted(Boolean wee) {
		submitted = wee;
	}
	public int getPrevious() {
		return previous;
	}

}