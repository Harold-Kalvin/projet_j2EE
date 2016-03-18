package notation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/addNoteToBD"})
public class addNoteToBD {
    
    public addNoteToBD() {
    }
    
    public void ajouterNote(HttpServletRequest request, HttpServletResponse response) {
        Connection conn = null;
        PrintWriter out = null;
        try{
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //out.print("ok");
        }catch (Exception e){out.print(e);}

        try{
          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjees4","root","");  
          PreparedStatement st = conn.prepareStatement("INSERT INTO vote (maths, physique, chimie) VALUES (?, ?, ?)");
          
          HttpSession session = request.getSession();
          
          st.setString(1, session.getAttribute("maths").toString());
          st.setString(2, session.getAttribute("physique").toString());
          st.setString(3, session.getAttribute("chimie").toString());
          
          st.executeUpdate();

        }catch (Exception e){out.print(e);}
    }
    
}