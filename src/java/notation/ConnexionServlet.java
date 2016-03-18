package notation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dleroy
 */
@WebServlet(urlPatterns = {"/ConnexionServlet"})
public class ConnexionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        ModeleConnexionServlet model = new ModeleConnexionServlet();
        model.verifierIdentifiant(request,response);
        //VueConnexionServlet vue1 = new VueConnexionServlet();
        //vue1.afficherPageConnexion(request,response);
    }   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        service(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        service(request,response);
    }
}
