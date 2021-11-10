package edu.northeastern.ashish;

public class ComplexRunnable implements Runnable {
    private ComplexObject obj;

    public ComplexRunnable(ComplexObject obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        System.out.println(" I am here 2");
    }
}
