/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revision1;
import java.util.*;
import javax.lang.model.util.Elements;
/*
 *
 * @author ahmed
 */
class Test <T,S>{
    T obj;
    S obj1;

    public Test(T obj, S obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public T getObj() {
        return obj;
    }

    public S getObj1() {
        return obj1;
    }
    public void print(){
        System.out.print(obj);
                System.out.print(obj1);

    }
    public void add(T obj, S obj1){
this.obj=obj;
this.obj1=obj1;
    }
    
    
}

public class Generics {

    public static <E> void printArray(E[]elements){
        for(E element: elements){
            System.out.println(element);
        }
    }
    
    public static <T> void find(List<T>list){
Map<T,Integer>map=new HashMap<>();
for(T elements: list){
    map.put(elements,map.getOrDefault(elements,0)+1);
}
for(Map.Entry<T,Integer>entry:map.entrySet()){
    if(entry.getValue()>1){
        System.out.print(entry.getKey()+" ");
    }
}
System.out.println();
}
    
    public static void main(String[] args) {
List list = new ArrayList<>();
list.add("h");
System.out.println(list);
        
Test <Integer,String>o1=new Test<>(12,"as");

Map <Integer,String>map= new HashMap<>();
map.put(1, "asd");
Set<Map.Entry<Integer,String>>set=map.entrySet();
Iterator<Map.Entry<Integer,String>>itr=set.iterator();
while(itr.hasNext()){
    Map.Entry e = itr.next();
  System.out.println(e.getKey()+" "+e.getValue());
}

List<Integer>list1 = new ArrayList<>();
list1.add(20); list1.add(2);
list1.add(3);list1.add(3);
list1.add(4);list1.add(10);
System.out.println();
find(list1);




    }
}
    

