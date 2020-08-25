import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		String temp ="";
		String word ="";
		String[] wordlst = new String[s];
		int countO = 0;
		int score = 0;
		int[] totalScore = new int[s];
		
		for(int i=0; i<wordlst.length; i++) {
			word = sc.next();
			wordlst[i] = word;
		}
		
		for(int i=0; i<wordlst.length; i++) {
			temp = wordlst[i];
			for(int j =0; j<temp.length(); j++) {
				word = temp.substring(j,j+1);
				if(word.equals("O")) {
					countO ++;
					
				}else if(word.equals("X")) {
					countO = 0;
				}
				score += countO;
			}
			totalScore[i] = score;
			score = 0;
			countO = 0;
		}
		
		for(int i = 0; i<totalScore.length; i++) {
			System.out.println(totalScore[i]);
		}
		sc.close();
	}
}