package com.resnidar.aeroCalc;

public class CalculVentTravers {
    public double ventAvant(int directionVent, double forceVent, int directionAvion){
            int angle = directionVent-directionAvion;
            double result = Math.round((forceVent*Math.cos(Math.toRadians(angle)))*10)/10;
                    result = result * (-1);
        return result;
    }

    public double ventDroit(int directionVent, double forceVent, int directionAvion){
            int angle = directionVent-directionAvion;
            double result = Math.round((forceVent*Math.sin(Math.toRadians(angle)))*10)/10;
            result = result * (-1);
        return result;
    }

    public double ventArriere(int directionVent, double forceVent, int directionAvion){
            int angle = directionVent-directionAvion;
            double result = Math.round((forceVent*Math.cos(Math.toRadians(angle)))*10)/10;
        return result;
    }

    public double ventGauche(int directionVent, double forceVent, int directionAvion){
            int angle = directionVent-directionAvion;
            double result = Math.round((forceVent*Math.sin(Math.toRadians(angle)))*10)/10;
        return result;
    }
}
