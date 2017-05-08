/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.servlet;

import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.services.ConverterObject;
import com.salesapp.logic.services.ReadFiled;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que redirecciona a la platilla que permite cargar el archivo.
 * @author EDGAR MENESES
 */
@WebServlet(name = "load", urlPatterns = {"/load"})
public class LoadFiled extends HttpServlet {

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
            out.println("<title>Servlet LoadFiled</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoadFiled at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    protected void processLoadFiled(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        
        ArrayList<String []> datos = ConverterObject.converteData(ReadFiled.read(request.getInputStream()));
        request.getSession().setAttribute("datos", datos);
        getServletConfig().getServletContext().getRequestDispatcher("/templates/admin/prevData.jsp").forward(request,response);   
        
    }
    
    protected void processDoGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        ArrayList<Place> places = (ArrayList<Place>) PlaceController.findAll();
        request.getSession().setAttribute("places", places);
        getServletConfig().getServletContext().getRequestDispatcher("/templates/admin/loadField.jsp").forward(request,response);
        
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

        //processRequest(request, response);
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
        processLoadFiled(request, response);
        //processRequest(request, response);
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
