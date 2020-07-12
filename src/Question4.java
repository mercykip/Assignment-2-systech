import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("when is today?");
        Scanner sc=new Scanner(System.in);
        char n= sc.next().charAt(0);
        char m='A';
      
       char answer=n;


        switch (answer){
            case 'A':
                System.out.println("Monday");
                break;
            case 'B':
                System.out.println("Tuesday");
                break;
            case 'C':
                System.out.println("Wednesday");
                break;
            case 'D':
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }
}