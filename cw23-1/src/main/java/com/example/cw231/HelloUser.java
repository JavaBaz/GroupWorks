package com.example.cw231;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloUser", value = "/hello-user")
public class HelloUser extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String firstname = request.getParameter("firstName");
        String lastname = request.getParameter("lastName");
        String result = "Hello " + firstname + " " + lastname;

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + result + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
