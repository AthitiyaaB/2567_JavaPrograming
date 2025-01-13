
public class Student {
	private String name;
	private double[] scores;
	
	public void setStudentDetails(String stdName,double[] stdScore) {
		name = stdName;
		scores = stdScore;	
	}
	public double calculateAverageScore() {
		double total = 0;
		for(int i=1;i<scores.length;i++){
			total += scores[i];			
		}
		return total/scores.length;
	}
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>=80) {
			return "A";
		}else if(average>=70) {
			return "B";
		}else if(average>=60) {
			return "c";
		}else if (average>=50) {
			return "D";
		}else {
			return "F";
		}
	}
	public void displayStudentDetails() {
		System.out.println("Name: "+name);
		for(int i=1;i<scores.length;i++) {
			System.out.print(scores[i] +" ");
		}
		System.out.println("\nAverage Score: "+calculateAverageScore());
		System.out.println("Grade: "+getGrade());
	}
}
