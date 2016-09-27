package org.herokingsley.chapter2.controller;

import org.herokingsley.chapter2.model.Customer;
import org.herokingsley.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 进入客户列表界面
 * <br/>Author: her0kings1ey
 * <br/>Date: 2016/2/16
 */

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{

    private CustomerService customerService;

    public void init() throws ServletException{
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
    }


}
