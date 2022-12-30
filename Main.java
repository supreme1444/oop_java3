package Iter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(2002, 011, 19), 3.9f));
        listStudents.add(new Student("Сергеев", LocalDate.of(2003, 010, 19), 4.9f));
        listStudents.add(new Student("Дронов", LocalDate.of(2004, 012, 19), 2.9f));
        Studentgroup1 studentgroup = new Studentgroup1(listStudents);
        
        for (Student student : studentgroup) {
            System.out.println(student);
            
        }
            System.out.println("Revers");
        Studentgroup studentgroup1 = new Studentgroup(listStudents);
        for(Student student1 : studentgroup1) {
             
            
            
             System.out.println(student1);
        }
       System.out.println("GroupListIterator");
        Studentgroup2 studentgroup2 = new Studentgroup2(listStudents);
        
        for(Student student2 : studentgroup2) {
       
        System.out.println(student2);

        
    
}
    }
}
