
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class java_itrator_ex2 {
    public static void main(String[] args) {
        HashMap<Integer, String> marks = new HashMap<Integer, String>();
        marks.put(38,"jay");
        marks.put(50,"raj");
        marks.put(60,"sahil");
        marks.put(70,"rahul");
        marks.put(50,"sachin");
        marks.put(80,"kenil");
        marks.put(90,"margi");
        marks.put(96,"jils");
        
        System.out.println("hashmap is="+marks);
        //marks and name both set ... use this method
        Set e = marks.entrySet();
        //chenge somthing in syntex
        
        Iterator t = e.iterator();
        while(t.hasNext()){
            /*access to the entry of the Map we can easily manipulate them. 
            /Map. Entry is a generic and is defined in the java*/
            Map.Entry me = (Map.Entry)t.next();
            Integer p = (Integer) me.getKey();
            if(p<40){
                System.out.println("student is fail name in calss ="+me.getValue());
               
              }
            if(p<51){
                System.out.println("studat only passing marks in class="+me.getValue());
            }
            if(p>69){
                System.out.println("student get 60 to 70 marks="+me.getValue());
            }
            if(p>79){
                System.out.println("Student get 71 to 80 marks="+me.getValue());
                
            }
            if(p>89){
                System.out.println("student get 81 to 90 marks="+me.getValue());
            }
            if(p>91){
                
                System.out.println("student get 90+ marks is class+"+me.getValue());
            }
            
        }
       
        
    }
}
