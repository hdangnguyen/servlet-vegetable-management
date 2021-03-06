/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author haida
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String LOGIN_CONTROLLER = "LoginController";
    private static final String LOGIN = "Login";
    private static final String HOME_CONTROLLER = "HomeController";
    private static final String HOME = "Home";
    private static final String SEARCH_CONTROLLER = "SearchController";
    private static final String SEARCH = "Search";
    private static final String PRODUCT_CONTROLLER = "ProductController";
    private static final String PRODUCT = "Product";
    private static final String DELETE_CONTROLLER = "DeleteController";
    private static final String DELETE = "Delete";
    private static final String LOAD_PRODUCT = "LoadProduct";
    private static final String LOAD = "Load";
    private static final String UPDATE_CONTROLLER = "UpdateController";
    private static final String UPDATE = "Update";
    private static final String LOGOUT_CONTROLLER = "LogoutController";
    private static final String LOGOUT = "Logout";
    private static final String CREATE_CONTROLLER = "CreateController";
    private static final String CREATE = "Create";
    private static final String ADD_CONTROLLER = "AddController";
    private static final String ADD = "Add";
    private static final String VIEWCART_CONTROLLER = "ViewCartController";
    private static final String VIEWCART = "ViewCart";
    private static final String REMOVE_CONTROLLER = "RemoveController";
    private static final String REMOVE = "Remove";
    private static final String EDIT_CONTROLLER = "UpdateCartController";
    private static final String EDIT = "Edit";
    private static final String PURCHASE = "Purchase";
    private static final String PURCHASE_CONTROLLER= "checkout.jsp";
    private static final String SUBMIT_CHECKOUT = "SubmitCheckout";
    private static final String SUBMIT_CHECKOUT_CONTROLLER= "SubmitController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if (LOGIN.equals(action)) {
                url = LOGIN_CONTROLLER;
            } else if (SEARCH.equals(action)) {
                url = SEARCH_CONTROLLER;
            } else if (HOME.equals(action)) {
                url = HOME_CONTROLLER;
            } else if (PRODUCT.equals(action)) {
                url = PRODUCT_CONTROLLER;
            } else if (DELETE.equals(action)) {
                url = DELETE_CONTROLLER;
            } else if (LOAD.equals(action)) {
                url = LOAD_PRODUCT;
            } else if (UPDATE.equals(action)) {
                url = UPDATE_CONTROLLER;
            } else if (LOGOUT.equals(action)) {
                url = LOGOUT_CONTROLLER;
            } else if (CREATE.equals(action)) {
                url = CREATE_CONTROLLER;
            } else if (ADD.equals(action)) {
                url = ADD_CONTROLLER;
            } else if (VIEWCART.equals(action)) {
                url = VIEWCART_CONTROLLER;
            } else if (REMOVE.equals(action)) {
                url = REMOVE_CONTROLLER;
            } else if (EDIT.equals(action)) {
                url = EDIT_CONTROLLER;
            } else if (PURCHASE.equals(action)) {
                url = PURCHASE_CONTROLLER;
            } else if (SUBMIT_CHECKOUT.equals(action)) {
                url = SUBMIT_CHECKOUT_CONTROLLER;
            }
        } catch (Exception e) {
            log("Error at MainController" + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
