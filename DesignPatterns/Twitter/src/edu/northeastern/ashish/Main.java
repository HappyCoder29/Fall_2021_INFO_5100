package edu.northeastern.ashish;

public class Main {


    public static void main(String[] args) {

        Person Trump = new Person("Trump");
        Person Biden = new Person("Biden");

        Person Ashish = new Person("Ashish");
        Person Peter = new Person("Peter");
        Person Tom = new Person("Tom");
        Person Sara = new Person("Sara");
        Person John = new Person("John");


        Ashish.follow(Trump);
        Tom.follow(Trump);
        Sara.follow(Trump);

        Peter.follow(Trump);
        Peter.follow(Biden);

        John.follow(Biden);

        Trump.tweet("I won the election");
        Trump.tweet("Election was rigged ");

        Biden.tweet("@Trump you are a sore loser");






    }
}
