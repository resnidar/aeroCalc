package com.resnidar.aeroCalc;

public class Endurance implements EnduranceInterface{
    @Override
    public String tempsRestant(int carburant, int consommation) {
        float time = 60*carburant / consommation;
        int minute = (int)(time % 60);
        int heure = (int)(time - minute)/60;
        return "Temps restant: " + heure +"H et " + minute + "min";
    }

    @Override
    public int distanceRestant(int carburant, int consommation, int vitesse) {
        int dist = (int)(carburant / consommation * vitesse);
        return dist;
    }
}
