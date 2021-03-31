package com.selfCarWash.programs;

import com.selfCarWash.WashPrograms;
import com.selfCarWash.WashProgramsSettings;

public class Rins extends WashProgramsSettings implements WashPrograms {
    @Override
    public void preparing() {
        setJetPressure(220);
        setSoapComposition(0);
        setWaterComposition(100);
        System.out.println("Rins option is enabled.");
        display();
    }


}
