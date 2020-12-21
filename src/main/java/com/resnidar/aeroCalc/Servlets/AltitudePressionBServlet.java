package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.AltitudePression;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AltitudePressionBServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/altitudePressionB.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AltitudePression altitudePression = new AltitudePression();

        int altitude = Integer.parseInt(request.getParameter("altitude"));

        int pression = altitudePression.pressionSuivantAltitude(altitude);
        int temperature = altitudePression.temperatureSuivantAltitude(altitude);

        request.setAttribute("pression", pression);
        request.setAttribute("temperature", temperature);

        this.getServletContext().getRequestDispatcher("/WEB-INF/altitudePressionB.jsp").forward(request, response);
    }
}
