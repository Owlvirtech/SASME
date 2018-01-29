/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

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
public class agregarPac extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession ses = request.getSession();
            cPacientes pac = new cPacientes();
            String nnombrePaciente = request.getParameter("nnombreP");
            String identificador = request.getParameter("identificador");
            int edad = Integer.parseInt(request.getParameter("edadP"));
            String tipoPaciente = request.getParameter("tipoP");        
            String genero = request.getParameter("generoP");      
            String nnssPaciente = request.getParameter("nss");
            String institucion = request.getParameter("institucion");

            pac.insertaPaciente(nnombrePaciente, institucion, genero, edad, nnssPaciente, tipoPaciente, identificador);
            out.println("<html>");
            out.println("<script>alert('Paciente registrado');location.href = 'consultaExp.jsp' ;</script>");
            out.println("</html>");
        }
        
    }
   



}
