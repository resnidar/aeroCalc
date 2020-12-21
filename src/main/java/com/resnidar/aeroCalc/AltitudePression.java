package com.resnidar.aeroCalc;

public class AltitudePression  {
    public int altitudePression(int pression, double temperature) {
           int altitudeD = (int)(145442.15627*(1-(Math.pow(0.28438*pression/(temperature+273.15),0.23511))));
       return altitudeD;
    }

    public int pressionSuivantAltitude(int altitude) {
        //TODO : calcul de la pression suivant altitude
        return 100;
    }

    public int temperatureSuivantAltitude(int altitude){
        //TODO : calcul de la temperature suivant l'altitude
        return 100;
    }
}
