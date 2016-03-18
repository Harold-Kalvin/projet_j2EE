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
import javax.servlet.http.HttpSession;

/**
 *
 * @author hbasa
 */
public class ModeleConnexionServlet {
    public ModeleConnexionServlet(){}
        public void verifierIdentifiant(HttpServletRequest request, HttpServletResponse response)
        {
            HttpSession session = request.getSession();
            response.setContentType("text/html;charset=UTF-8");
            String login = request.getParameter("login");
            String mdp = request.getParameter("mdp");
            
            if (login.equals("user") && mdp.equals("user"))
            {
                try {
                    session.setAttribute("level",1);
                    response.sendRedirect("vote1.jsp");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            else if (login.equals("admin") && mdp.equals("admin"))
            {
                try {
                    session.setAttribute("level",0);
                    response.sendRedirect("bd.jsp");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            else
            {
                try {
                    response.sendRedirect("index.jsp");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }  
        }
}
