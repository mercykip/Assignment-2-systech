import java.util.Scanner;

public class Question2 {
    public static void voteEligibility(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
         if(age<=18){
             System.out.println("your are  not eligible to vote");

        }
         else{
             System.out.println("You are eligible to vote");
         }
//        System.out.println("Enter your age: " +age);
    }

    public static void main(String[] args) {
        voteEligibility();
    }
}
