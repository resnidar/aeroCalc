package com.resnidar.aeroCalc;

public class PorteTheoriqueVor implements PorteTheoriqueVorInterface{
    @Override
    public int porteTheoriqueVor(int altitude) {
        int result = (int) (1.23 * Math.sqrt(altitude));
        return result;
    }
}
