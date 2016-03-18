<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%
            Connection conn = null;
            Statement stmt = null;
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                //out.print("ok");
            }catch (Exception e){out.print(e);}
            
            try{
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjees4","root","");  
              stmt=conn.createStatement();
              //out.print(stmt);
              
              String requete="SELECT * from vote";
              ResultSet resultat = stmt.executeQuery(requete);
              out.print("<table border=1 cellapdding=4 cellespacing=4>");
              out.print("<th>vote</th><th>maths</th><th>physique</th><th>chimie</th>");
              int total = 0;
              Double totalMath = 0.0;
              Double totalPhysique = 0.0;
              Double totalChimie = 0.0;
              while (resultat.next()){
                  total++;
                  totalMath += Double.parseDouble(resultat.getString("maths"));
                  totalPhysique += Double.parseDouble(resultat.getString("physique"));
                  totalChimie += Double.parseDouble(resultat.getString("chimie"));
                  out.print("<tr><td>"+resultat.getString("vote")+"</td>");
                  out.print("<td>"+resultat.getString("maths")+"</td>");
                  out.print("<td>"+resultat.getString("physique")+"</td>");
                  out.print("<td>"+resultat.getString("chimie")+"</td></tr>");
              }
              out.print("<tr><td>Moyenne : </td> <td>" + totalMath / total + "</td> <td>" + totalPhysique / total + "</td> <td>" + totalChimie / total + "</td></tr>");
              
              out.print("</table>");
              
            }catch (Exception e){out.print(e);}
            
        %>