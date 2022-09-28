/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
public class arrays {
    public static void main(String[] args){
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        int c[][] = new int [2][2];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(""+c[i][j]);
            
        }
            
        }
        System.out.println();
    }
    
}
*/
public class arrays {
    public static void main(String[] args){
        int a[][]={{1,2,3},{3,4,5},{4,5,6}};
        int b[][]={{1,2,3},{3,4,5},{4,5,6}};
        int c[][] = new int [3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                     c[i][j]+=a[i][j]*b[i][j];
                }
                
                System.out.println(""+c[i][j]);
            
        }     
        }
        System.out.println();
    }
    
}
