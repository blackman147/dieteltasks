/**

Ask user to input scores

if user score greater than equals to 90 grade a
 
else if user score greater than 80 less than 90 grade b

if user score greater than 70  less than 80 grade 
if user score less than 70 you have failed





**/








import java.util.Scanner;

	public class Grade1{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int firstScore;


	System.out.println("Enter firstScore: ");
	firstScore = input.nextInt();


	if(firstScore >= 90){
	System.out.println("You got an A " );
	}

	else if(firstScore >= 80 ){
	System.out.println("You got  B " );
	}
	
	else if (firstScore >= 70){
	System.out.println("You got  C " );
	
	}

	else if (firstScore <= 69){
	System.out.println("You got F " );
	}	

}


}