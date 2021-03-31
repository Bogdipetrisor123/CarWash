package com.selfCarWash.programs;

import com.selfCarWash.WashPrograms;
import com.selfCarWash.WashProgramsSettings;

public class Wax extends WashProgramsSettings implements WashPrograms {


    @Override
    public void preparing() {
        setJetPressure(150);
        setSoapComposition(0);
        setWaterComposition(70);
        setWaxComposition(30);
        System.out.println("Wax option is enabled.");
        display();

    }


}
