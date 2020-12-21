package com.resnidar.aeroCalc;

public class AltitudePression  {
    public int altitudePression(int pression, double temperature) {
           int altitudeD = (int)(145442.15627*(1-(Math.pow(0.28438*pression/(temperature+273.15),0.23511))));
       return altitudeD;
    }

    public int pressionSuivantAltitude(int altitude) {
        //TODO : calcul de la pression suivant altitude
        int pression = (int)(1013.2*Math.pow(((31-(altitude*0.0003048))/(31+(altitude*0.0003048))),2));
        return pression;
    }

    public int temperatureSuivantAltitude(int altitude){
        //TODO : calcul de la temperature suivant l'altitude
            int temperature = (int)(15-6.5*(altitude*0.0003048));
        return temperature;
    }
}
