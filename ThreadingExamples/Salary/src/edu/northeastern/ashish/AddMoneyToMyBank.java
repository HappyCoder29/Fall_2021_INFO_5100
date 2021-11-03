package edu.northeastern.ashish;

public class AddMoneyToMyBank implements Runnable{
    private int money;
    private int time;
    @Override
    public void run() {
        while(true){
            synchronized (Main.obj){
                Main.bankBalance += money;
                System.out.println( Thread.currentThread().getName() + " added money Balance = " + Main.bankBalance);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public AddMoneyToMyBank(int money, int time){
        this.money = money;
        this.time = time;
    }
}
