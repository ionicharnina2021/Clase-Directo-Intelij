package com.adorno.pruebamustacheformulario2302;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/session")
public class SessionController {
    //@RequestMapping(value="/procesar",method = RequestMethod.POST)
    @PostMapping("/procesar")
    public String procesar(@RequestParam String info, Model model){
        model.addAttribute("info",info);
        return "resultadoFormulario";
    }
    @GetMapping("/mostrar")
    public void ff(){}
}
