package edu.northeastern.ashish;

public class BluetoothFive implements  IBluetooth{

    public  String name = "";
    public BluetoothFive(){
        this.name = "Five";
    }

    @Override
    public void pair(IBluetooth bt) {
        System.out.println("Paired to " + bt.name);
    }

    @Override
    public void unPair(IBluetooth bt) {
        System.out.println("Unpaired with " + bt.name);
    }

    @Override
    public void sendData(IBluetooth bt, String str) {
        System.out.println("Sending data to " + bt.name);
    }

    @Override
    public String receiveData(IBluetooth bt) {
        return "Data from " + bt.name;
    }
}
