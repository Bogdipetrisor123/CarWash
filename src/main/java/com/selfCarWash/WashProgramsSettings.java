package com.selfCarWash;

public class WashProgramsSettings {

    private int jetPressure;
    private int waterComposition;
    private int soapComposition;
    private int waxComposition;

    public void display() {
        System.out.println("Jet pressure : " + getJetPressure() + " bars");
        System.out.println("Water composition : " + getWaterComposition() + "%");
        System.out.println("Soap composition: " + getSoapComposition() + "%");
        System.out.println("Wax composition: " + getWaxComposition() + "%");
        System.out.println();
    }

    public void setJetPressure(int jetPressure) {
        this.jetPressure = jetPressure;
    }

    public void setWaterComposition(int waterComposition) {
        this.waterComposition = waterComposition;
    }

    public void setSoapComposition(int soapComposition) {
        this.soapComposition = soapComposition;
    }

    public void setWaxComposition(int waxComposition) {
        this.waxComposition = waxComposition;
    }

    public int getJetPressure() {
        return jetPressure;
    }

    public int getWaterComposition() {
        return waterComposition;
    }

    public int getSoapComposition() {
        return soapComposition;
    }

    public int getWaxComposition() {
        return waxComposition;
    }
}
