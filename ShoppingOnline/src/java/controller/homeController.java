/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.TblProduct;
import model.TblUser;
import org.hibernate.Session;
import service.ProductService;
import service.UserService;
import util.HibernateUtil;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "homeController", urlPatterns = {"/home", "/product", "/detail", "/cart", "/login", "/checkout"})
public class homeController extends HttpServlet {

    private final Session ss = HibernateUtil.openSession();
    private final ProductService prodService = new ProductService(ss);
    private final UserService userService = new UserService(ss);

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
            out.println("<title>Servlet homeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet homeController at " + request.getContextPath() + "ehehheheh</h1>");
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
    @SuppressWarnings("unchecked")
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            if (action != null && action.equals("loadAllProduct")) {
                HttpSession session = request.getSession(true);
                List<TblProduct> listProduct = (List<TblProduct>) session.getAttribute("listProduct");
                if (listProduct == null) {
                    listProduct = prodService.findAll();
                }
                session.setAttribute("listProduct", listProduct);
                request.getRequestDispatcher("/views/web/product.jsp").forward(request, response);
            } else if (action != null && action.equals("detailProduct")) {
                String id = request.getParameter("id");
                TblProduct product = prodService.findById(Integer.valueOf(id));
                HttpSession session = request.getSession(true);
                session.setAttribute("product", product);
                request.getRequestDispatcher("/views/web/detail.jsp").forward(request, response);
            } else if (action != null && action.equals("login")) {
                request.getRequestDispatcher("/login_register.jsp").forward(request, response);
            } else if (action != null && action.equals("viewCart")) {
                request.getRequestDispatcher("/views/web/cart.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
            }

        } catch (Exception e) {
        }

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
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            if (action != null && action.equals("login")) {
                HttpSession session = request.getSession(true);
                TblUser user = (TblUser) session.getAttribute("user");
                if (user == null) {
                    String userName = request.getParameter("userName");
                    String password = request.getParameter("password");
                    byte status = 1;
                    user = userService.findByUserNameAndPasswordAndStatusAndRole(userName, password, status);
                }
                session.setAttribute("user", user);
                switch (user.getRole()) {
                    case 1: //admin
                        adminController a = new adminController();
                        a.doGet(request, response);
                        break;
                    case 2: // staff
                        break;
                    case 3: // customer
                        request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
                        break;
                }
            } else if (action != null && action.equals("addToCard")) {
                HttpSession session = request.getSession(true);
                String productId = request.getParameter("productId");
                String quantity = request.getParameter("quantity");
                cart crt = (cart) session.getAttribute("cart");
                if (crt == null) {
                    crt = new cart();
                }
                TblProduct product = prodService.findById(Integer.valueOf(productId));
                cartItem crtItem = new cartItem(product, Integer.valueOf(quantity));
                crt.addToCard(crtItem);
                session.setAttribute("cart", crt);
                request.getRequestDispatcher("/views/web/cart.jsp").forward(request, response);
                //khoi tao product và số lượng

            } else if (action != null && action.equals("checkout")) {
                request.getRequestDispatcher("/views/web/infoOrder.jsp").forward(request, response);
            } else {

            }

        } catch (Exception e) {
        }
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
