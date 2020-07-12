public class Question5 {

    public static void main(String[] args) {
        String ch;
        int i;
        for(i=1; i<=122; i++)
        {
            ch = Character.toString((char) i);
            System.out.print(i+ " -> " + ch + "\t");
        }
    }
}
