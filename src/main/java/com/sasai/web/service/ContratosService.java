package com.sasai.web.service;

import com.sasai.web.domain.Contrato;
import com.sasai.web.repository.ContratosRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ContratosService {

    private final ContratosRepository contratosRepository;

    public ContratosService(ContratosRepository contratosRepository) {
        this.contratosRepository = contratosRepository;
    }

    @PostConstruct
    public String creaContratosHTML() {
        List<Contrato> contratos = contratosRepository.getContratos();

        StringBuilder html = new StringBuilder("<HTML><title>Solicitud de Contratos " + "</title>");
           html.append("<p>    Alta Contrato PF</p>");
           html.append("<p>    Domicilios</p>");
        contratos.forEach(contrato ->
            html.append("<p>" + contrato.getEtiquetaConcepto() + "</p>"
                       + "<input/>")
        );
        html.append("</html");

        return html.toString();
    }
}
