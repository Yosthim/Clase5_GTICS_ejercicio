package com.example.laboratorio3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//COMPLETAR
@Controller
public class EmployeeController {

    //COMPLETAR
    @GetMapping("/empleados")
    public String listaEmployee(Model model){
        //COMPLETAR

        return "employee/lista";
    }

    public String nuevoEmployeeForm( ) {
        //COMPLETAR
    }


    public String guardarEmployee() {
        //COMPLETAR
    }


    public String editarEmployee() {
        //COMPLETAR
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
