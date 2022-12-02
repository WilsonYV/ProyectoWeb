package com.sasai.web.web.rest;


import com.sasai.web.domain.Contrato;
import com.sasai.web.service.ContratosService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contratos")
public class ContratosResource {
    private final ContratosService contratosService;

    public ContratosResource(ContratosService contratosService) {
        this.contratosService = contratosService;
    }

    @GetMapping("")
    public String getContratos() {
        return contratosService.creaContratosHTML();
       //return "AltaPF";
    }
}
