/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.servlet;

import com.salesapp.logic.controller.ModuleQueryController;
import com.salesapp.logic.services.ModuleQuery;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet para redireccionar a la ventana principal del administrador
 * @author EDGAR MENESES
 */
@WebServlet(name = "admin", urlPatterns = {"/admin"})
public class ServletAdmin extends HttpServlet {

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
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAdmin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAdmin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    protected void processQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String query = request.getParameter("query");
        System.out.println("Consulta .. " + query);
       
         List listResult = ModuleQueryController.findData(query);
         if(listResult != null){
                List<String> headres = ModuleQuery.getHeaders(listResult.get(0).toString());
        
                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");           
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<table name="+"table" +" id="+"table " +"class="+"table table-hover table-striped"+">");
                        out.println("<thead>");

                            out.println("<tr>");
                            for(String header: headres){
                                out.println("<th>"+header+"</th>");
                            }
                            out.println("</tr>");

                        out.println("</thead>");
                        out.println("<tbody>");
                        for(Object data: listResult){
                            List<String> rows = ModuleQuery.getRow(data.toString());
                            out.println("<tr>");
                                for(String row : rows){
                                    out.println(" <td>"+row+"</td>");
                                }
                            out.println("</tr>");
                        }
                        out.println("</tbody>");
                    out.println("</table>");
                    out.println("</body>");
                    out.println("</html>");   
                }
         }else{
             try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");           
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<p>No se encontraron resultados.</p>");
                    out.println("</body>");
                    out.println("</html>");   
                }
         }
        
    }
    
    protected void processDoGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         getServletConfig().getServletContext().getRequestDispatcher("/templates/admin/admin.jsp").forward(request,response);
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
        processDoGet(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * Metodo que redirecciona al template o ruta de admin
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          processQuery(request, response);
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
