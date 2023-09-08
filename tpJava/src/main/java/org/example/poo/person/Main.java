package org.example.poo.person;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setAge(15);
        System.out.println(student1.toString());
        student1.GoToClass();
        student1.DisplayAge();

        Teacher teacher1 = new Teacher();
        teacher1.setAge(40);
        System.out.println(teacher1.toString());
        teacher1.Explain();


    }

}
