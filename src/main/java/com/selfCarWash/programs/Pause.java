package com.selfCarWash.programs;

import com.selfCarWash.WashPrograms;
import com.selfCarWash.WashProgramsSettings;

public class Pause extends WashProgramsSettings implements WashPrograms {

    @Override
    public void preparing() {
        setJetPressure(0);
        setSoapComposition(0);
        setWaterComposition(0);
       
    }

   
}
