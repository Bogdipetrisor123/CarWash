package com.selfCarWash.programs;

import com.selfCarWash.WashPrograms;
import com.selfCarWash.WashProgramsSettings;

public class PreWash extends WashProgramsSettings implements WashPrograms {


    @Override
    public void preparing() {
        setJetPressure(200);
        setSoapComposition(10);
        setWaterComposition(100);
        System.out.println("Pre wash option is enabled.");
        display();
    }

   
}
