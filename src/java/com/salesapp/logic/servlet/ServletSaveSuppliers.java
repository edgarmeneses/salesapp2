/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.servlet;

import com.salesapp.logic.services.SaveBranches;
import com.salesapp.logic.services.SavePlaces;
import com.salesapp.logic.services.SaveSuppliers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EDGAR MENESES
 */
@WebServlet(name = "savesuppliers", urlPatterns = {"/savesuppliers"})
public class ServletSaveSuppliers extends HttpServlet {

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
            out.println("<title>Servlet ServletSaveBranches</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSaveBranches at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
     protected void processSave(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String [] nits  =  request.getParameter("nits").split(";");
        String [] names  =  request.getParameter("names").split(";");
        String [] address  =  request.getParameter("address").split(";");
        String [] phones  =  request.getParameter("phones").split(";");
        String [] status  =  request.getParameter("status").split(";");
        String [] descriptions  =  request.getParameter("descriptions").split(";");
        //String [] status  =  request.getParameter("status").split(";");
         SaveSuppliers.saveSuppliers(nits, names, address, phones, status, descriptions);
      /*  SavePlaces.savePlace(places, names, types); */
     
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Save</title>");            
            out.println("</head>");
            out.println("<body>");
           /* out.print("<h1> Lugares: "+places.length+"</h1>"); */
            out.print("<h1> Nits: "+nits.length+"</h1>");
            out.print("<h1> Names: "+names.length+"</h1>");
            out.print("<h1> Address: "+address.length+"</h1>");
            out.print("<h1> Phones: "+phones.length+"</h1>");
            out.print("<h1> Status: "+status.length+"</h1>");
            out.print("<h1> Descriptions: "+descriptions.length+"</h1>");
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
        //processRequest(request, response);
        processSave(request, response);
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
