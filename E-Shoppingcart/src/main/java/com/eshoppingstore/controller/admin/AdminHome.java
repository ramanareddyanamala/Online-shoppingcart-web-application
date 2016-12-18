package com.eshoppingstore.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eshoppingstore.model.Customer;
import com.eshoppingstore.model.Product;
import com.eshoppingstore.serv.CustomerService;
import com.eshoppingstore.serv.ProductService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagerment(Model model){

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);

        return "customerManagement";
    }


} // The End of Class;
