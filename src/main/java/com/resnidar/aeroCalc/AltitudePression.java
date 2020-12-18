package com.resnidar.aeroCalc;

public class AltitudePression implements AltitudePressionInterface {
    @Override
    public int altitudePression(int pression, double temperature) {
           int altitudeD = 12;//(int)(145442.15627*(1-(Math.pow(pression/(temperature+273.15),0.23511))));
        return altitudeD;
    }

    @Override
    public int tempPressionStatic(int altitude) {
        return 100;
    }
}
