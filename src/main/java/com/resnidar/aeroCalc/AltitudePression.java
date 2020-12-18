package com.resnidar.aeroCalc;

public class AltitudePression implements AltitudePressionInterface {

    @Override
    public int altitudePression(int pression, double temperature) {
        //TODO altitude par apport a la pression atmo et la temperature
        return 100;
    }

    @Override
    public int tempPressionStatic(int altitude) {
        return 100;
    }
}
