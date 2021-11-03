package edu.northeastern.ashish;

public class CalculateSum implements Runnable {
    private int portionNumber;
    @Override
    public void run() {

        long sum = 0;
        for(int i = portionNumber* Main.portionSize ; i <  portionNumber* Main.portionSize  + Main.portionSize; i ++){
            sum += Main.values[i];
        }
        Main.portionSum[portionNumber] = sum;
    }

    public CalculateSum(int portionNumber){
        this.portionNumber = portionNumber;
    }
}
