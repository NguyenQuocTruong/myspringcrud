package io.github.truong.myspringcrud.controller;

import io.github.truong.myspringcrud.entity.Employee;
import io.github.truong.myspringcrud.service.EmployeeSercive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeSercive employeeSercive;

    @RequestMapping("/")
    public String index(Model model){
        List<Employee> employees = employeeSercive.getAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @RequestMapping(value = "add")
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editEmployee(@RequestParam("id") Long id, Model model) {
        Optional<Employee> employeeEdit = employeeSercive.findEmployeeById(id);
        employeeEdit.ifPresent(employee -> model.addAttribute("employee", employee));
        return "editEmployee";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Employee employee){
        employeeSercive.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteEmployee(@RequestParam("id") Long id, Model model){
        employeeSercive.deleteEmployee(id);
        return "redirect:/";
    }

}
