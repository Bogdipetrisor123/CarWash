package com.selfCarWash;

public class Machine {
    public int counterWashes = 0;
    public WashPrograms washPrograms;

    private Machine() {
    }

    static Machine machine;

    public static Machine getInstance() {
        if (machine == null) {
            return new Machine();
        } else return machine;
    }


    public void washingProgramsMenu(WashPrograms washPrograms) {

        if (washPrograms != null) {
            washPrograms.preparing();
        }

    }


}
        


   




