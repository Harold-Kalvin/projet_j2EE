package notation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dleroy
 */
@WebServlet(urlPatterns = {"/NoteFormServlet"})
public class NoteFormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        if(session.getAttribute("level") == null || session.getAttribute("level").toString() != "1")
        {
            RequestDispatcher rd = request.getRequestDispatcher("/DeconnexionServlet");
            rd.forward(request, response);
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NoteFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NoteFormServlet at " + request.getContextPath() + "</h1>");
            if (request.getParameter("maths") != null)
            {
                session.setAttribute("maths", request.getParameter("maths"));
                response.sendRedirect("physique.jsp");
            }
            else if (request.getParameter("physique") != null)
            {
                session.setAttribute("physique", request.getParameter("physique"));
                response.sendRedirect("chimie.jsp");
            }
            else if (request.getParameter("chimie") != null)
            {
                session.setAttribute("chimie", request.getParameter("chimie"));
                new addNoteToBD().ajouterNote(request, response);
                response.sendRedirect("valide.jsp");
            }
            else
            {
                response.sendRedirect("index.jsp");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
