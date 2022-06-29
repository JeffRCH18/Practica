package com.practica.Controller;


import com.practica.dao.PaisDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Indexcontroller {
    @Autowired
    private PaisDao paisdao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("estamos");
        var estados=paisdao.findAll();
        model.addAttribute("paises",estados);
        return "Index";
    }
}
