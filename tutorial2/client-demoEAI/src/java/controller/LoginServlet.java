/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DeltaDivine
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean checkStatus = checkLogin(username, password);
        if(checkStatus){
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }else request.getRequestDispatcher("/fail.jsp").forward(request, response);
    }
    private static boolean checkLogin(java.lang.String name, java.lang.String password) {
        controller.UsersService_Service service = new controller.UsersService_Service();
        controller.UsersService port = service.getUsersServicePort();
        return port.checkLogin(name, password);
    }

}
