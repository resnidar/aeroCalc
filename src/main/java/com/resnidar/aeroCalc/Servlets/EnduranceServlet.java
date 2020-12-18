package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.Endurance;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EnduranceServlet")
public class EnduranceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/endurance.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int carburant = Integer.parseInt(request.getParameter("quantiteCarburant"));
        int consommation = Integer.parseInt(request.getParameter("consommationHeure"));
        int vitesse = Integer.parseInt(request.getParameter("vitesse"));


        Endurance endurance = new Endurance();
        String tempsCarburantRestant = endurance.tempsRestant(carburant, consommation);
        int distanceRestante = endurance.distanceRestant(carburant, consommation, vitesse);
        request.setAttribute("tempsCarburantRestant", tempsCarburantRestant);
        request.setAttribute("distanceRestante", distanceRestante);
        this.getServletContext().getRequestDispatcher("/WEB-INF/endurance.jsp").forward(request, response);
    }
}
