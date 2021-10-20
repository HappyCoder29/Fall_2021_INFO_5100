package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        Publisher Ashish = new Publisher("Ashish", "Info 5100");

        Publisher Andre = new Publisher("Andre", "Business Analysis");


        Student Mark = new Student("Mark", 1);
        Student Bill = new Student("Bill", 2);
        Student Peter = new Student("Peter", 3);
        Student John = new Student("John", 4);
        Student Sara = new Student("Sara", 5);

        Ashish.addGrades(1,"A");
        Ashish.addGrades(2,"A-");
        Ashish.addGrades(3,"C");
        Ashish.addGrades(4,"A");
        Ashish.addGrades(5, "B");


        Andre.addGrades(1,"A-");
        Andre.addGrades(2,"B+");
        Andre.addGrades(3,"A");
        Andre.addGrades(4,"B-");
        Andre.addGrades(5, "A");

        Mark.subscribe(Ashish);
        Peter.subscribe(Ashish);
        Sara.subscribe(Ashish);

        Sara.subscribe(Andre);
        Bill.subscribe(Andre);
        John.subscribe(Andre);


        Ashish.NotifyGrades();

        Andre.NotifyGrades();

        Peter.UnSubscribe(Ashish);


        Ashish.NotifyGrades();

    }
}
