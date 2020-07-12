import java.util.Scanner;

public class Question1 {
public void grade(){
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    //quiz score
    System.out.println("Enter your quiz score");
    int quiz= sc.nextInt();

    //mid-term score
    System.out.println("Enter your mid-term score");
    int  mid_term = sc.nextInt();

    //final score
    System.out.println("Enter your final score ");
    int final_score= sc.nextInt();

    //average grade
    int averageGrade=((quiz+mid_term+final_score)/3);
    //display user score
    System.out.println("Quiz score:" +quiz);
    System.out.println("mid-term score: "+ mid_term);
    System.out.println("final score: "+final_score);
    //check grade
    if(averageGrade>90 && averageGrade<=100){
        System.out.println("your grade is A");
    }
    else if(averageGrade>70 && averageGrade<=90){
        System.out.println("your grade is B");
    }
    else if(averageGrade>50 && averageGrade<=70){
        System.out.println("your grade is C");
    }
    else {
        System.out.println("your grade is F");
    }

}
    public static void main(String[] args) {
        Question1 qn=new Question1();
        qn.grade();
    }
}
