package org.example;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name,stNo;
    String classes;
    double avarage;
    double courseAvarage;
    boolean isPass;

    Student(String name,String stNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stNo=stNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1,int note2,int note3 ){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;

        }
        if(note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
        }


    }
    void addBulkVerbalExamNote(int verbalNote1,int verbalNote2,int verbalNote3){
        if(verbalNote1>=0 && verbalNote1<=100){
            this.c1.verbalNote =verbalNote1;
        }
        if(verbalNote2>=0 && verbalNote2<=100){
            this.c2.verbalNote =verbalNote2;
        }
        if(verbalNote3>=0 && verbalNote3<=100){
            this.c3.verbalNote =verbalNote3;
        }

    }
   public void noteHesapla(){

           this.courseAvarage= (((this.c1.verbalNote*0.20+this.c1.note*0.80))+((this.c2.verbalNote*0.30+this.c2.note*0.70))+((this.c3.verbalNote*0.30+this.c3.note*0.70)))/3.0;



    }

    void isPass(){
        noteHesapla();

        if(this.courseAvarage>55){
            System.out.println("hababam sınıfı uyanıyor!...");

        }else{
            System.out.println("hababam  sınıfı sınıfta kaldı!..");
        }
        printNote();
    }

    void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci :"+this.name);
        System.out.println(c1.name +"Notu :" +c1.courseAvarage);
        System.out.println(c2.name +"Notu :" +c2.courseAvarage);
        System.out.println(c3.name +"Notu :" +c3.courseAvarage);

    }



}
