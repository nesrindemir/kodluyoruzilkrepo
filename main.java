package org.example;

public class Main {
    public static void main(String[] args) {
        
        Teacher t1= new Teacher("nesrin","05055","TRH");
        Teacher t2= new Teacher("ali","05545","FZK");
        Teacher t3=new Teacher("Kül yurmaz","1111","BIO");

        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo= new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("inek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(50,80,70);
        s1.addBulkVerbalExamNote(100,80,70);
        s1.isPass();
    }
}
