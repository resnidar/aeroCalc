package com.resnidar.aeroCalc;

public class AltitudePression  {
    public int altitudePression(int pression, double temperature) {
           int altitudeD = (int)(145442.15627*(1-(Math.pow(0.28438*pression/(temperature+273.15),0.23511))));
       return altitudeD;
    }

    @Override
    public int tempPressionStatic(int altitude) {
        return 100;
    }
}
