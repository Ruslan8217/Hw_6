package com.company;

public class Skeleton extends Boss{
    private int arrowsQuantity;

    public int getArrowsQuantity() {
        return arrowsQuantity;
    }

    public void setArrowsQuantity(int arrowsQuantity) {
        this.arrowsQuantity = arrowsQuantity;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + "\nКоличество стрел " + arrowsQuantity;
    }
}
