import java.util.*;
public class task2{

private static final int minimum_value=1;
private static final int maximum_value=10;
private static final int maximum_attempts=5;
private static final int maximum_rounds=3;

public static void main(String[] args){
Random random=new Random();
Scanner sa=new Scanner(System.in);
int high_Score=0;

System.out.printf("***Welcome to number guessing game!!!*** \n");

for(int i=1;i<=maximum_value;i++){
int number=random.nextInt(maximum_value)+minimum_value;
int attempts=0;

System.out.printf("round no.: %d and attempts left are: %d \nguess the number between %d and %d \n",i,maximum_attempts,minimum_value,maximum_value);

while(attempts<maximum_attempts){
System.out.printf("enter your guess:");
int guess_number=sa.nextInt();
attempts=attempts+1;

if(guess_number<number){
System.out.printf("guessed number %d is less than original number \n",guess_number);
System.out.printf("attempts left are %d \n",maximum_attempts-attempts);
}
else if(guess_number==number){
int score=maximum_attempts-attempts;
high_Score=high_Score+score;
System.out.printf("guessed number is correct!!! \n");
System.out.printf("your score is %d and your attempts are %d \n",score,attempts);
break;
}
else if(guess_number>number){
System.out.printf("guessed number %d is greater than original number \n",guess_number);
System.out.printf("attempts left are %d \n",max_attempts-attempts);
}
}

if(attempts==maximum_attempts){
System.out.printf("round= %d \n",i);
System.out.printf("attempts left=0 \n");
System.out.printf("original number is: \n",number);
}

}
System.out.printf("game over!!! \n");
System.out.printf("total score is %d \n",high_Score);
sa.close();
}
}