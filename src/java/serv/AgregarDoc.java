/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import Doctor.cDoctor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sonia
 */
public class AgregarDoc extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        
        cDoctor doc = new cDoctor();
        String nombre = request.getParameter("nombreD");
        String usuario = request.getParameter("nusuario");
        String contraseña = request.getParameter("ncontra");
        String genero = request.getParameter("genero");
        String[] dias = request.getParameterValues("dias");
        String mail = request.getParameter("correo");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        int celular = Integer.parseInt(request.getParameter("celular"));
        doc.insertaDoctor(nombre, contraseña, usuario,dias[0],8 ,14 , genero, mail);
//        Conectamos a la base
response.sendRedirect("consulta.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**


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
