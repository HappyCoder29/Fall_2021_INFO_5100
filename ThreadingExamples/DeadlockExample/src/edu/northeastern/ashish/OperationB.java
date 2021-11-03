package edu.northeastern.ashish;

public class OperationB implements Runnable{
    @Override
    public void run() {
        synchronized (Main.obj2){
            System.out.println("Operation B has got lock to Obj2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Main.obj1){
                System.out.println("Operation B has got lock to Obj1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Operation B is leaving Obj1");
            }
            System.out.println("Operation B is leaving Obj2");
        }
    }
}
