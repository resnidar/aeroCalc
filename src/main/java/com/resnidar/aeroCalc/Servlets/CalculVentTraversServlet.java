package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.CalculVentTravers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculVentTraversServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/calculVentTravers.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CalculVentTravers ventTravers = new CalculVentTravers();
        int directionVent = Integer.parseInt(request.getParameter("directionVent"));
        double forceVent = Double.parseDouble(request.getParameter("forceVent"));
        int directionAvion = Integer.parseInt(request.getParameter("directionAvion"));
        double ventAvant = ventTravers.ventAvant(directionVent, forceVent, directionAvion);
        double ventDroit = ventTravers.ventDroit(directionVent, forceVent, directionAvion);
        double ventArriere = ventTravers.ventArriere(directionVent, forceVent,directionAvion);
        double ventGauche = ventTravers.ventGauche(directionVent, forceVent, directionAvion);

        request.setAttribute("ventAvant", ventAvant);
        request.setAttribute("ventDroit", ventDroit);
        request.setAttribute("ventArriere", ventArriere);
        request.setAttribute("ventGauche", ventGauche);
        this.getServletContext().getRequestDispatcher("/WEB-INF/calculVentTravers.jsp").forward(request, response);
    }
}
