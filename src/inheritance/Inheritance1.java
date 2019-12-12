package inheritance;

public class Inheritance1 {

	public static void main(String[] args) {
		FinalExam exam=new FinalExam();
		exam.setScore(85);
		System.out.println("Score = "  + exam.getScore());
	}		
}


class GradedActivity{
	private double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}
class FinalExam extends GradedActivity{
	
}