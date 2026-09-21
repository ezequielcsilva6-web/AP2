package com.example.Ap2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    public String mensagem() {
        return "Bem-Vindo";
    }

    public String dev() {
        return "Feito_por_Ezequiel";
    }

    ;
   public String turma() {
       return "Numero da Turma";
   }

    ;
   public String curso() {
       return "Nome do curso";
   }

}
