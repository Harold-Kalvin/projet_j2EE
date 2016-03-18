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
public class ModeleConnexionServlet {
    public ModeleConnexionServlet(){}
        public void verifierIdentifiant(HttpServletRequest request, HttpServletResponse response)
        {
            response.setContentType("text/html;charset=UTF-8");
            String login = request.getParameter("login");
            String mdp = request.getParameter("mdp");
            
            if (login.equals("user") && mdp.equals("user"))
            {
                try {
                    request.setAttribute("login",login);
                    request.setAttribute("mdp",mdp);
                    response.sendRedirect("maths.jsp");
                }catch (IOException e){
                    e.printStackTrace();
        }
            }
            else if (login.equals("admin") && mdp.equals("admin"))
            {
                try {
                    request.setAttribute("login",login);
                    request.setAttribute("mdp",mdp);
                    response.sendRedirect("bd.jsp");
                }catch (IOException e){
                    e.printStackTrace();
            }
            
        }
    }
}
