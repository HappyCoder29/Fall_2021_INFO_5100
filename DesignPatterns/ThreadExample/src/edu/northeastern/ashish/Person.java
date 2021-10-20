package edu.northeastern.ashish;

public class Person extends  Thread{
    public String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10; i ++){
            System.out.println(this.name +  " is alive");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Unable to sleep");
            }
        }
        System.out.println(" I am dead");
    }
}
