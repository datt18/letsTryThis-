package mv.clouds;

//Write a program to display the below given structure as a output.

import java.util.Scanner;

public class day8_task9{
    public static void main(String[] args){
         Scanner t = new Scanner(System.in);
        System.out.println("enter rows if you won't: ");
        int row = t.nextInt();
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                if(j==1 || j==row|| j==i || i+j==row+1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
