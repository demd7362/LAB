package ch03.sec11;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 95;
		
		int grade = (score>90)? (int)'A' : ((score>80)? 'B':'C');
		
		System.out.println(score+"점은 "+grade+"등급입니다.");

	}

}