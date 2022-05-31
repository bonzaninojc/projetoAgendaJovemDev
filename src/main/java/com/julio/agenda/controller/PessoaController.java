package com.julio.agenda.controller;

import com.julio.agenda.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping({"/"})
    public ModelAndView pageIndex() {
        ModelAndView modelView = new ModelAndView("index");
        return modelView;
    }
}
