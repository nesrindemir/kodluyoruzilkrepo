package org.example;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double courseAvarage;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote=0;
        this.courseAvarage=0;

    }
    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            System.out.println("işlem başarılı");
}else{
            System.out.println( "öğretmen ve ders bölümleri uyşmuyor!");
        }



    }

  void printTeacherInfo() {
      this.teacher.print();
    }
}
