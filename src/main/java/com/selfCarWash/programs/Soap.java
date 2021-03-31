package com.selfCarWash.programs;

import com.selfCarWash.WashPrograms;
import com.selfCarWash.WashProgramsSettings;

public class Soap extends WashProgramsSettings implements WashPrograms {
    @Override
    public void preparing() {
        setJetPressure(150);
        setWaterComposition(75);
        setSoapComposition(25);
        System.out.println("Soap option is enabled.");
        display();
    }

   
}
