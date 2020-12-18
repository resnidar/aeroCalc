package com.resnidar.aeroCalc;

public class Endurance implements EnduranceInterface{
    @Override
    public String tempsRestant(int carburant, int consommation) {
        //TODO temps restant en heure
        return "fonctionnement ok";
    }

    @Override
    public int distanceRestant(int carburant, int consommation, int vitesse) {
        //TODO distance en NM
        return 100;
    }
}
