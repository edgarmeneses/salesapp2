/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.servlet;

import com.salesapp.logic.controller.BranchController;
import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.controller.SupplierController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.Supplier;
import com.salesapp.logic.services.ConverterObject;
import com.salesapp.logic.services.ReadFiled;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EDGAR MENESES
 */
@WebServlet(name = "suppliers", urlPatterns = {"/suppliers"})
public class ServletLoadSuppliers extends HttpServlet {

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
            out.println("<title>Servlet LoadSuppliers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoadSuppliers at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    protected void processDoGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        ArrayList<Supplier> suppliers = (ArrayList<Supplier>) SupplierController.findAll();
        request.getSession().setAttribute("suppliers", suppliers);
        getServletConfig().getServletContext().getRequestDispatcher("/templates/suppliers/loadSuppliers.jsp").forward(request,response);
        
    }
    
    protected void processLoadFiled(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        ArrayList<String []> datos = ConverterObject.converteData(ReadFiled.read(request.getInputStream()));
        request.getSession().setAttribute("datos", datos);
      getServletConfig().getServletContext().getRequestDispatcher("/templates/suppliers/prevDataSuppliers.jsp").forward(request,response);
        
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
//getServletConfig().getServletContext().getRequestDispatcher("/templates/banches/loadBranches.jsp").forward(request,response);

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
        processLoadFiled(request, response);
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
