/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hbasa
 */
public class VueConnexionServlet {
    public VueConnexionServlet(){
        
    }
    public void afficherPageConnexion(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            response.getWriter();
            request.getAttribute("login");
            request.getAttribute("mdp");
            response.sendRedirect("maths.jsp");
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

