/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Cart;
import entity.ProductDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author haida
 */
@WebServlet(name = "UpdateCartController", urlPatterns = {"/UpdateCartController"})
public class UpdateCartController extends HttpServlet {
   private static final String ERROR="cart.jsp";
    private static final String SUCCESS="cart.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String url=ERROR;
        try{
            int productID= Integer.parseInt(request.getParameter("productID"));
            int newQuantity= Integer.parseInt(request.getParameter("quantity"));
            HttpSession session = request.getSession();
            Cart cart= (Cart) session.getAttribute("CART");
            DAO dao = new DAO();
            ProductDTO product;
            if(cart!=null){
                if(cart.getCart().containsKey(productID)){
                    if(dao.checkQuantity(productID, newQuantity)){                        
                        product= cart.getCart().get(productID);
                        product.setQuantity(newQuantity);
                        cart.update(productID, product);
                        session.setAttribute("CART", cart);
                        url=SUCCESS;
                    }
                    else{
                        request.setAttribute("MESSAGE", "Not enough quantity to update product");
                    }

                }
            }
        }catch(Exception e){
            log("Error at EditController: " + e.toString());
        }finally{
            request.getRequestDispatcher(url).forward(request, response);
        }}

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
