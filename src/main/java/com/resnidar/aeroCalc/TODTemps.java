package com.resnidar.aeroCalc;

public class TODTemps {
    public int todtempsMin(int altitudeActuel, int altitudeDesire, int vitesseVertical){
        //TODO: calcul du temps a laquelle il faut commencé la descente
        int min = (altitudeActuel - altitudeDesire) / vitesseVertical;
        return min;
    }
    public int todtempsSec(int altitudeActuel, int altitudeDesire, int vitesseVertical){
        int sec = ((altitudeActuel - altitudeDesire) / (vitesseVertical/60))%60;
        return sec;
    }
}