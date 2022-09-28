
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class exmpleeee {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number:");
        String d = a.nextLine();
        char a[] = d.toCharArray();
        char t;
        int i = 0;
        while (i < a.length) {
            int j=i+1;
            while (j < a.length) {
                if (a[j] < a[i]) {
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                    
                }
                j += 1;
        }
            i += 1;
        
    }
        System.out.println(a);
    
}
