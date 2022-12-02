package com.sasai.web.domain;

public class Contrato {

    private Long id;
    private String descTipoCuest;

    private String idPerJuridica;
    private String descSeccionTipoCuest;

    private String etiquetaGrupo;

    private Long idTipoDatoCuest;

    private String etiquetaConcepto;

    private String ayudaConcepto;

    private String idTipoDato;

    private Long longitudMinima;

    private Long longitudMaxima;

    private String idTipoValorMinimo;

    private String valorMinimo;

    private String idTipoValorMaximo;

    private String valorMaximo;

    private String mascaraCaptura;

    private String mascaraPresentacion;

    private Long idTipoCatalogo;

    private Long idValorCatalogoDefault;

    private String idReglaValidacionDefault;

    private String idTipoControlVisual;

    private String idTipoValorDefault;

    private String valorDefault;

    private String expresionRegularValida;

    private String idReglaValidacionCaptura;

    private String bEsEditable;

    private String idReglaValidacionEditable;

    private String bUnicidadGrupo;

    private Long idTipoCuest;

    private Long idSeccionTipoCuest;

    private Long idGrupoSeccionCuest;

    private Long idConceptoCuest;

    private Long consecutivoGrupo;

    public Contrato() {}

    public Contrato(
        Long id,
        String descTipoCuest,
        String idPerJuridica,
        String descSeccionTipoCuest,
        String etiquetaGrupo,
        Long idTipoDatoCuest,
        String etiquetaConcepto,
        String ayudaConcepto,
        String idTipoDato,
        Long longitudMinima,
        Long longitudMaxima,
        String idTipoValorMinimo,
        String valorMinimo,
        String idTipoValorMaximo,
        String valorMaximo,
        String mascaraCaptura,
        String mascaraPresentacion,
        Long idTipoCatalogo,
        Long idValorCatalogoDefault,
        String idReglaValidacionDefault,
        String idTipoControlVisual,
        String idTipoValorDefault,
        String valorDefault,
        String expresionRegularValida,
        String idReglaValidacionCaptura,
        String bEsEditable,
        String idReglaValidacionEditable,
        String bUnicidadGrupo,
        Long idTipoCuest,
        Long idSeccionTipoCuest,
        Long idGrupoSeccionCuest,
        Long idConceptoCuest,
        Long consecutivoGrupo
    ) {
        this.id = id;
        this.descTipoCuest = descTipoCuest;
        this.idPerJuridica = idPerJuridica;
        this.descSeccionTipoCuest = descSeccionTipoCuest;
        this.etiquetaGrupo = etiquetaGrupo;
        this.idTipoDatoCuest = idTipoDatoCuest;
        this.etiquetaConcepto = etiquetaConcepto;
        this.ayudaConcepto = ayudaConcepto;
        this.idTipoDato = idTipoDato;
        this.longitudMinima = longitudMinima;
        this.longitudMaxima = longitudMaxima;
        this.idTipoValorMinimo = idTipoValorMinimo;
        this.valorMinimo = valorMinimo;
        this.idTipoValorMaximo = idTipoValorMaximo;
        this.valorMaximo = valorMaximo;
        this.mascaraCaptura = mascaraCaptura;
        this.mascaraPresentacion = mascaraPresentacion;
        this.idTipoCatalogo = idTipoCatalogo;
        this.idValorCatalogoDefault = idValorCatalogoDefault;
        this.idReglaValidacionDefault = idReglaValidacionDefault;
        this.idTipoControlVisual = idTipoControlVisual;
        this.idTipoValorDefault = idTipoValorDefault;
        this.valorDefault = valorDefault;
        this.expresionRegularValida = expresionRegularValida;
        this.idReglaValidacionCaptura = idReglaValidacionCaptura;
        this.bEsEditable = bEsEditable;
        this.idReglaValidacionEditable = idReglaValidacionEditable;
        this.bUnicidadGrupo = bUnicidadGrupo;
        this.idTipoCuest = idTipoCuest;
        this.idSeccionTipoCuest = idSeccionTipoCuest;
        this.idGrupoSeccionCuest = idGrupoSeccionCuest;
        this.idConceptoCuest = idConceptoCuest;
        this.consecutivoGrupo = consecutivoGrupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescTipoCuest() {
        return descTipoCuest;
    }

    public void setDescTipoCuest(String descTipoCuest) {
        this.descTipoCuest = descTipoCuest;
    }

    public String getIdPerJuridica() {
        return idPerJuridica;
    }

    public void setIdPerJuridica(String idPerJuridica) {
        this.idPerJuridica = idPerJuridica;
    }

    public String getDescSeccionTipoCuest() {
        return descSeccionTipoCuest;
    }

    public void setDescSeccionTipoCuest(String descSeccionTipoCuest) {
        this.descSeccionTipoCuest = descSeccionTipoCuest;
    }

    public String getEtiquetaGrupo() {
        return etiquetaGrupo;
    }

    public void setEtiquetaGrupo(String etiquetaGrupo) {
        this.etiquetaGrupo = etiquetaGrupo;
    }

    public Long getIdTipoDatoCuest() {
        return idTipoDatoCuest;
    }

    public void setIdTipoDatoCuest(Long idTipoDatoCuest) {
        this.idTipoDatoCuest = idTipoDatoCuest;
    }

    public String getEtiquetaConcepto() {
        return etiquetaConcepto;
    }

    public void setEtiquetaConcepto(String etiquetaConcepto) {
        this.etiquetaConcepto = etiquetaConcepto;
    }

    public String getAyudaConcepto() {
        return ayudaConcepto;
    }

    public void setAyudaConcepto(String ayudaConcepto) {
        this.ayudaConcepto = ayudaConcepto;
    }

    public String getIdTipoDato() {
        return idTipoDato;
    }

    public void setIdTipoDato(String idTipoDato) {
        this.idTipoDato = idTipoDato;
    }

    public Long getLongitudMinima() {
        return longitudMinima;
    }

    public void setLongitudMinima(Long longitudMinima) {
        this.longitudMinima = longitudMinima;
    }

    public Long getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(Long longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public String getIdTipoValorMinimo() {
        return idTipoValorMinimo;
    }

    public void setIdTipoValorMinimo(String idTipoValorMinimo) {
        this.idTipoValorMinimo = idTipoValorMinimo;
    }

    public String getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getIdTipoValorMaximo() {
        return idTipoValorMaximo;
    }

    public void setIdTipoValorMaximo(String idTipoValorMaximo) {
        this.idTipoValorMaximo = idTipoValorMaximo;
    }

    public String getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getMascaraCaptura() {
        return mascaraCaptura;
    }

    public void setMascaraCaptura(String mascaraCaptura) {
        this.mascaraCaptura = mascaraCaptura;
    }

    public String getMascaraPresentacion() {
        return mascaraPresentacion;
    }

    public void setMascaraPresentacion(String mascaraPresentacion) {
        this.mascaraPresentacion = mascaraPresentacion;
    }

    public Long getIdTipoCatalogo() {
        return idTipoCatalogo;
    }

    public void setIdTipoCatalogo(Long idTipoCatalogo) {
        this.idTipoCatalogo = idTipoCatalogo;
    }

    public Long getIdValorCatalogoDefault() {
        return idValorCatalogoDefault;
    }

    public void setIdValorCatalogoDefault(Long idValorCatalogoDefault) {
        this.idValorCatalogoDefault = idValorCatalogoDefault;
    }

    public String getIdReglaValidacionDefault() {
        return idReglaValidacionDefault;
    }

    public void setIdReglaValidacionDefault(String idReglaValidacionDefault) {
        this.idReglaValidacionDefault = idReglaValidacionDefault;
    }

    public String getIdTipoControlVisual() {
        return idTipoControlVisual;
    }

    public void setIdTipoControlVisual(String idTipoControlVisual) {
        this.idTipoControlVisual = idTipoControlVisual;
    }

    public String getIdTipoValorDefault() {
        return idTipoValorDefault;
    }

    public void setIdTipoValorDefault(String idTipoValorDefault) {
        this.idTipoValorDefault = idTipoValorDefault;
    }

    public String getValorDefault() {
        return valorDefault;
    }

    public void setValorDefault(String valorDefault) {
        this.valorDefault = valorDefault;
    }

    public String getExpresionRegularValida() {
        return expresionRegularValida;
    }

    public void setExpresionRegularValida(String expresionRegularValida) {
        this.expresionRegularValida = expresionRegularValida;
    }

    public String getIdReglaValidacionCaptura() {
        return idReglaValidacionCaptura;
    }

    public void setIdReglaValidacionCaptura(String idReglaValidacionCaptura) {
        this.idReglaValidacionCaptura = idReglaValidacionCaptura;
    }

    public String getbEsEditable() {
        return bEsEditable;
    }

    public void setbEsEditable(String bEsEditable) {
        this.bEsEditable = bEsEditable;
    }

    public String getIdReglaValidacionEditable() {
        return idReglaValidacionEditable;
    }

    public void setIdReglaValidacionEditable(String idReglaValidacionEditable) {
        this.idReglaValidacionEditable = idReglaValidacionEditable;
    }

    public String getbUnicidadGrupo() {
        return bUnicidadGrupo;
    }

    public void setbUnicidadGrupo(String bUnicidadGrupo) {
        this.bUnicidadGrupo = bUnicidadGrupo;
    }

    public Long getIdTipoCuest() {
        return idTipoCuest;
    }

    public void setIdTipoCuest(Long idTipoCuest) {
        this.idTipoCuest = idTipoCuest;
    }

    public Long getIdSeccionTipoCuest() {
        return idSeccionTipoCuest;
    }

    public void setIdSeccionTipoCuest(Long idSeccionTipoCuest) {
        this.idSeccionTipoCuest = idSeccionTipoCuest;
    }

    public Long getIdGrupoSeccionCuest() {
        return idGrupoSeccionCuest;
    }

    public void setIdGrupoSeccionCuest(Long idGrupoSeccionCuest) {
        this.idGrupoSeccionCuest = idGrupoSeccionCuest;
    }

    public Long getIdConceptoCuest() {
        return idConceptoCuest;
    }

    public void setIdConceptoCuest(Long idConceptoCuest) {
        this.idConceptoCuest = idConceptoCuest;
    }

    public Long getConsecutivoGrupo() {
        return consecutivoGrupo;
    }

    public void setConsecutivoGrupo(Long consecutivoGrupo) {
        this.consecutivoGrupo = consecutivoGrupo;
    }
}
