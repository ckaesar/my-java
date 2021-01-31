package com.kaesar.design_patterns.zen.chp11;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
