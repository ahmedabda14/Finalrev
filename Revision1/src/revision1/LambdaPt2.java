/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    String name;
    int age;
    int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }
    
}
public class LambdaPt2 {
             public static void main(String[] args) {
      List <Student>list=new ArrayList<Student>();
       
      list.add(new Student("jon",22,1001));
            list.add(new Student("jsdon",43,1092));
      list.add(new Student("jonf",24,1032));
System.out.println("Sorted");
      list.forEach((s)->System.out.println(s));
      System.out.println();
      System.out.println("Sorted");

      list.sort((Student s1,Student s2)->s1.getAge()-s2.getAge());
             list.forEach((s)->System.out.println(s));
                System.out.println();
      System.out.println("Sorted by id");
      
      list.sort((Student s3, Student s4)->s3.getId()-s4.getId());
list.forEach((n)->System.out.println(n));
System.out.println("reverse");
System.out.println("age");
list.sort((Student c1, Student c2)->c2.getId()-c1.getId());
list.forEach((s)->System.out.println(s));
System.out.println("name");
list.sort((Student c1, Student c2)->c2.getName().compareTo(c1.getName()));
list.forEach((s)->System.out.println(s));


List<Integer>al = new ArrayList<>();
al.add(100);al.add(103);
al.add(102);al.add(102);
al.add(109);al.add(101);

Collections.sort(al, (o1,o2)-> (o1>o2)?1:(o1<o2)?-1:0);
System.out.println(al);
             
             }
}
