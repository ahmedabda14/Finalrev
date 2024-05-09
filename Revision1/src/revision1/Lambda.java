/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
interface intr{
    public String reverse(String n);
}
interface game{
    public void print();
}
interface Sayable{
       String say(String msg);
}

interface addable{
    public int add(int a,int b);
}
public class Lambda {
         public static void main(String[] args) {
        
             game a = new game(){
                 public void print(){
                     System.out.println("GTA6");
                 }
             };
             a.print();
             
             game b=()->{
                 System.out.println("GTA6");
             };
             b.print();
             
           addable c=(o1,o2)->(o1+o2);
           System.out.println(c.add(2, 3));
           
           addable d =(int e,int f)->{
               return (e+f);
           };
                        System.out.println(d.add(4, 3));

         List <Integer>list=new ArrayList<>();
         list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);
             
         list.forEach((n)->System.out.println(n));
         
         Sayable z = (msg)->{
String str1="stfu";
String str2=str1 +msg;
return str2;
         };
        System.out.println( z.say(" l"));
        
        intr myintr = (str)->{
            String result="";
            for(int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.println(myintr.reverse("lambda"));
        
        }
}
