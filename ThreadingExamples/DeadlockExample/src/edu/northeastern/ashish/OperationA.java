package edu.northeastern.ashish;

public class OperationA implements Runnable{
    @Override
    public void run() {

        synchronized (Main.obj1){
            System.out.println("Operation A has got lock to Obj1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (Main.obj2){
                System.out.println("Operation A has got lock to Obj2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Operation A is leaving Obj2");
            }
            System.out.println("Operation A is leaving Obj1");
        }
    }
}
