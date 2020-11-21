package controllers;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @RequestMapping("/loop-example")
    public String loopExample(Model model) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(0, "Ken", "American"));
        customers.add(new Customer(1, "James", "English"));
        customers.add(new Customer(2, "Bob", "France"));
        customers.add(new Customer(3, "Andy", "Russia"));

        model.addAttribute("customers", customers);
        return "loop-example";
    }
}
