import java.util.*;

public class Main{
    public static void main(String rgs []){
        Scanner sc = new Scanner(System.in);

        System.out.print("entre the number of rows : ");
        int rows = sc.nextInt();

        System.out.print("entre the number of cols : ");
        int cols = sc.nextInt();

        int [][] number = new int [rows][cols];

        System.out.println("entre the elemnst of array ");

        //input rows
        for (int i = 0 ; i <rows ; i++){
            for (int j = 0 ; j <cols ; j++) {
                System.out.println("entred number [" + i + "]  ["+ j + "]");
                number[i][j]=sc.nextInt();
            }

        }

        System.out.println("your 2d aaray is : ");

        //output
        for (int i =0; i<rows;i++){
            for (int j=0; j<cols; j++){
                System.out.println(number [i][j] + " ");
            }
            System.out.println( " [] ");
        }





















































    }
}