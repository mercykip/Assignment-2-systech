public class Question6 {
    public static void diamondPattern() {
        System.out.println("Diamond Pattern");
        int n, i, j, space = 1;

        n = 5;
        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void invertedPyramid(){
        System.out.println("Inverted Pyramid");
        int rows =5;
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void verticalPyramid(){
        System.out.println("Vertical Pyramid");
        int rows =7;
        int num=1;
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print((num+j)+ " ");

            }
            System.out.println("");
        }
        for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print((num+j)+ " ");

            }
            System.out.println("");
        }
    }

    public static void numberPatter(){
        System.out.println("Number Patten");
        int num=1;
        for (int i = 6; i >= 0; i--)
        {

            for (int j = 0; j <= i; j++)
            {
                System.out.print( (num + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<= 6; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print( (num + j) + " ");
            }
            System.out.println();
        }
    }
//    public static void trianglePattern(){
//        System.out.println("Number Patten");
//        for (int i = 0; i <= 5; i++) { for (int j = 5; j > i; j--)
//        {
//            System.out.print(" ");
//        }
//            for (int k = 0; k <= i; k++)
//            {
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }
//    }
    public static void rightTriangle(){
        System.out.println("right TrianglePatten");
        int i,j,k=9;//k=rows
        for (i=0;i<=k;i+=2){
            for (j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void leftTriangle() {
        System.out.println("left TrianglePatten");
        int i,j,n=5;

        for (i = 1; i <= n; i++) {//iterate from 1 to 5
            for (j = n; j > i; j--) {
                System.out.print(" ");//insert space
            }
            for (j= i; j>= 1; j--){
                System.out.print("*" + "");
            }
            System.out.println();//insert a new line after each row
        }
    }



    public static void main(String[] args) {
        invertedPyramid();
        rightTriangle();
        leftTriangle();
        diamondPattern();
        numberPatter();
        verticalPyramid();


    }
}

