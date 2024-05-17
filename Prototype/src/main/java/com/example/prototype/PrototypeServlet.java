package com.example.prototype;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/clone")
public class PrototypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        Prototype prototype = null;

        if ("1".equals(type)) {
            ConcretePrototype1 prototype1 = new ConcretePrototype1("Prototype 1");
            prototype = prototype1.clone();
        } else if ("2".equals(type)) {
            ConcretePrototype2 prototype2 = new ConcretePrototype2("Prototype 2");
            prototype = prototype2.clone();
        }

        request.setAttribute("prototype", prototype);
        request.getRequestDispatcher("/jsp/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
