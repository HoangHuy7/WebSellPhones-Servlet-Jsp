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
import model.TblBrand;
import model.TblProduct;
import model.TblProductcategory;
import model.TblSupplier;
import org.hibernate.Session;
import service.BrandService;
import service.CategoryService;
import service.ProductService;
import service.SupplierService;
import util.HibernateUtil;
import util.adminSingleton;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "adminController", urlPatterns = {"/admin"})
public class adminController extends HttpServlet {

    private final Session ss = HibernateUtil.openSession();
    private final ProductService prodService = new ProductService(ss);
    private final CategoryService cateService = new CategoryService(ss);
    private final BrandService brandService = new BrandService(ss);
    private final SupplierService supplierService = new SupplierService(ss);
    private adminSingleton dataAdmin = null;

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
            out.println("<title>Servlet adminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adminController at " + request.getContextPath() + "</h1>");
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
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession(true);
            dataAdmin = adminSingleton.getInstance(prodService, cateService, brandService, supplierService);
            session.setAttribute("noo", 0); //vi tri của các phần tử list bên dưới
            session.setAttribute("listProductA", dataAdmin.getListProductA());
            session.setAttribute("listCateA", dataAdmin.getListCateA());
            session.setAttribute("listBrandA", dataAdmin.getListBrandA());
            session.setAttribute("listSupplierA", dataAdmin.getListSupplierA());
            request.getRequestDispatcher("/views/admin/home.jsp").forward(request, response);
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
            if (action != null && action.equals("addProduct")) {
                String nameP = request.getParameter("nameP");
                String priceP = request.getParameter("priceP");
                String inventoryP = request.getParameter("inventoryP");
                String descriptionP = request.getParameter("descriptionP");
                String detailP = request.getParameter("detailP");
                String indexCategoryP = request.getParameter("categoryP");
                String indexBrandP = request.getParameter("brandP");
                String indexSupplierP = request.getParameter("supplierP");
                dataAdmin = adminSingleton.getInstance(prodService, cateService, brandService, supplierService);
                TblProductcategory category = dataAdmin.getListCateA().get(Integer.valueOf(indexCategoryP));
                TblBrand brand = dataAdmin.getListBrandA().get(Integer.valueOf(indexBrandP));
                TblSupplier supplier = dataAdmin.getListSupplierA().get(Integer.valueOf(indexSupplierP));
                TblProduct p = new TblProduct(brand, category, supplier, nameP, nameP, Long.valueOf(priceP),
                         Integer.valueOf(inventoryP), descriptionP, detailP);
                boolean finish = prodService.insert(p);
                dataAdmin.getListProductA().add(p);
                request.getRequestDispatcher("/views/admin/home.jsp").forward(request, response);
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
