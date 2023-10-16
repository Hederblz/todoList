package br.com.hederblz.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /*
    * Métodos de acesso do HTTP
    * GET - Buscar uma informação
    * POST - Adicionar um dado/informação
    * PUT - Alterar um dado/info
    * DELETE - Remover um dado
    * PATCH - Alterar somente uma parte do dado/info
    *
    */
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funciona";
    }

}
