package com.resnidar.aeroCalc.Servlets;

import com.resnidar.aeroCalc.PorteTheoriqueVor;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")

public class porteTheoriqueVorServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.getServletContext().getRequestDispatcher("/WEB-INF/porteTheoriqueVor.jsp").forward(request, response);
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PorteTheoriqueVor porteTheoriqueVor = new PorteTheoriqueVor();
            int altitude = Integer.parseInt(request.getParameter("altitudeEnPied"));
            int resultat = porteTheoriqueVor.porteTheoriqueVor(altitude);
            request.setAttribute("test", resultat);
            this.getServletContext().getRequestDispatcher("/WEB-INF/porteTheoriqueVor.jsp").forward(request, response);
        }
}