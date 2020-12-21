package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.AltitudePression;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AltitudePressionServlet")
public class AltitudePressionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/altitudePression.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double temperature = Integer.parseInt(request.getParameter("temperature"));
        int pression = Integer.parseInt(request.getParameter("pression"));

        AltitudePression altPress = new AltitudePression();
        int altitudePression = altPress.altitudeDensite(pression, temperature);
        request.setAttribute("altitude", altitudePression);

        this.getServletContext().getRequestDispatcher("/WEB-INF/altitudePression.jsp").forward(request, response);
    }
}
