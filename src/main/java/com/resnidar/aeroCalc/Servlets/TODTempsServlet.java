package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.TODTemps;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TODTempsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/TODTemps.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int altitudeActuel = Integer.parseInt(request.getParameter("altitudeActuel"));
        int altitudeDesire = Integer.parseInt(request.getParameter("altitudeDesire"));
        int vitesseVertical = Integer.parseInt(request.getParameter("vitesseVertical"));

        TODTemps todTemps = new TODTemps();
        double temps = todTemps.todtemps(altitudeActuel, altitudeDesire, vitesseVertical);
        request.setAttribute("temps", temps);

        this.getServletContext().getRequestDispatcher("/WEB-INF/TODTemps.jsp").forward(request, response);
    }
}
