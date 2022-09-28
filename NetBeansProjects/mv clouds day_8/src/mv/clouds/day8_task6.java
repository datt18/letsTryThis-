/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.clouds;

public class day8_task6{
public static int fun(int[] a, int total){
int t;
for (int i = 0; i < total; i++) 
        {
            for (int j = i + 1; j < total; j++) 
            {
                if (a[i] > a[j]) 
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
       return a[total-2];
}
public static void main(String args[]){
int x[]={1,2,5,6,3,2};
int y[]={44,66,99,77,33,22,55};
System.out.println("Second Largest:"+fun(x,6));
System.out.println("Second Largest:"+fun(y,7));
}}