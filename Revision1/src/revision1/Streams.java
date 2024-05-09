
package revision1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class product{
    int id,price;
    String name;

    public product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    
}

public class Streams {
           public static void main(String[] args) {
    List <Integer>list= Arrays.asList(1,2,3,4,5,6,7,43,2,1,2,3,4,5);
    
               List<Integer> even = list.stream().filter(i->i%2==0).
                       sorted().
                       collect(Collectors.toList());
List<Integer> sortedEven = even.stream()
       .sorted()
       .collect(Collectors.toList());
System.out.println();
               even.forEach(i->System.out.print(i+" "));
 System.out.println();
               List<String>str=Arrays.asList("cee","asd","ccc","sadd");
               
            str.stream().
                       filter(c->c.startsWith("c")).
                       map(String::toUpperCase)
                       .sorted().
                       forEach(System.out::print);
                      
            str.stream().findFirst().ifPresent(System.out::println);
               //strC.forEach(c->System.out.println(c));
               
               Arrays.stream(new int[]{1,2,3,4}).map(n->2*n+1)
                       .average().ifPresent(System.out::println);
               
               
             List<product>ListP=new ArrayList<>();
             ListP.add(new product(1,1222,"pp"));
                          ListP.add(new product(2,1322,"pp"));
             ListP.add(new product(4,1912,"pp"));
             ListP.add(new product(3,1802,"pp"));
    
             ListP.stream().filter(s->s.price==1222)
                     .forEach(s->System.out.print(s.name+" "));
             
             System.out.println();
    List<Integer>listA = ListP.stream().filter(p-> p.price>1500)
            .map(p->p.price).collect(Collectors.toList());
           
    listA.stream().forEach(s->System.out.print(s+" "));
                 System.out.println();

    Stream.iterate(1, element->element+1)
            .filter(element->element%5==0)
            .limit(5)
            .forEach(System.out::println);
    
    int totalPrice = ListP.stream()
            .map(s->s.price)
            .reduce(0, (sum,price)->sum+price);
    System.out.println(totalPrice);
        System.out.println();
long count=ListP.stream().filter(s->s.price>1500).count();
   System.out.println(count); 
           }
}
