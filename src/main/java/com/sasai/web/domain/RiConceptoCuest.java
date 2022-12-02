package com.sasai.web.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ri_concepto_cuest")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RiConceptoCuest extends AbstractAuditingEntity implements Serializable {

    /**
     *
     */

    @Id
    @Column(name = "id_concepto_cuest", nullable = false)
    private Long IdConceptoCuest;

    @Column(name = "desc_concepto_cuest", nullable = false)
    private String DescConceptoCuest;

    @Column(name = "id_tipo_dato_cuest", nullable = false)
    private String IdTipoDatoCuest;

    @Column(name = "etiqueta", nullable = true)
    private String Etiqueta;

    @Column(name = "ayuda", nullable = true)
    private String Ayuda;

    @Column(name = "id_tipo_dato", nullable = true)
    private String IdTipoDato;

    @Column(name = "longitud_minima", nullable = true)
    private Long LongitudMinima;

    @Column(name = "longitud_maxima", nullable = true)
    private Long LongitudMaxima;

    @Column(name = "id_tipo_valor_minimo", nullable = true)
    private String IdTipoValorMinimo;

    @Column(name = "valor_minimo", nullable = true)
    private String ValorMinimo;

    @Column(name = "id_tipo_valor_maximo", nullable = true)
    private String IdTipoValorMaximo;

    @Column(name = "valor_maximo", nullable = true)
    private String ValorMaximo;

    @Column(name = "mascara_captura", nullable = true)
    private String MascaraCaptura;

    @Column(name = "mascara_presentacion", nullable = true)
    private String MascaraPresentacion;

    @Column(name = "id_tipo_catalogo", nullable = true)
    private Long IdTipoCatalogo;

    @Column(name = "id_valor_catalogo_default", nullable = true)
    private Long IdValorCatalogoDefault;

    @Column(name = "id_regla_validacion_default", nullable = true)
    private String IdReglaValidacionDefault;

    @Column(name = "id_tipo_control_visual", nullable = true)
    private String IdTipoControlVisual;

    @Column(name = "id_tipo_valor_default", nullable = true)
    private String IdTipoValorDefault;

    @Column(name = "valor_default", nullable = true)
    private String ValorDefault;

    @Column(name = "expresion_regular_valida", nullable = true)
    private String ExpresionRegularValida;

    @Column(name = "id_regla_validacion_captura", nullable = true)
    private String IdReglaValidacionCaptura;

    @Column(name = "b_es_editable", nullable = true)
    private String BEsEditable;

    @Column(name = "id_regla_validacion_editable", nullable = true)
    private String IdReglaValidacionEditable;

    @Column(name = "f_ini_vigencia", nullable = false)
    private Date FIniVigencia;

    @Column(name = "f_fin_vigencia", nullable = true)
    private Date FFinVigencia;

    @Column(name = "id_status", nullable = true)
    private Long IdStatus;

    public Long getIdConceptoCuest() {
        return IdConceptoCuest;
    }

    public void setIdConceptoCuest(Long idConceptoCuest) {
        IdConceptoCuest = idConceptoCuest;
    }

    public String getDescConceptoCuest() {
        return DescConceptoCuest;
    }

    public void setDescConceptoCuest(String descConceptoCuest) {
        DescConceptoCuest = descConceptoCuest;
    }

    public String getIdTipoDatoCuest() {
        return IdTipoDatoCuest;
    }

    public void setIdTipoDatoCuest(String idTipoDatoCuest) {
        IdTipoDatoCuest = idTipoDatoCuest;
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        Etiqueta = etiqueta;
    }

    public String getAyuda() {
        return Ayuda;
    }

    public void setAyuda(String ayuda) {
        Ayuda = ayuda;
    }

    public String getIdTipoDato() {
        return IdTipoDato;
    }

    public void setIdTipoDato(String idTipoDato) {
        IdTipoDato = idTipoDato;
    }

    public Long getLongitudMinima() {
        return LongitudMinima;
    }

    public void setLongitudMinima(Long longitudMinima) {
        LongitudMinima = longitudMinima;
    }

    public Long getLongitudMaxima() {
        return LongitudMaxima;
    }

    public void setLongitudMaxima(Long longitudMaxima) {
        LongitudMaxima = longitudMaxima;
    }

    public String getIdTipoValorMinimo() {
        return IdTipoValorMinimo;
    }

    public void setIdTipoValorMinimo(String idTipoValorMinimo) {
        IdTipoValorMinimo = idTipoValorMinimo;
    }

    public String getValorMinimo() {
        return ValorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        ValorMinimo = valorMinimo;
    }

    public String getIdTipoValorMaximo() {
        return IdTipoValorMaximo;
    }

    public void setIdTipoValorMaximo(String idTipoValorMaximo) {
        IdTipoValorMaximo = idTipoValorMaximo;
    }

    public String getValorMaximo() {
        return ValorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        ValorMaximo = valorMaximo;
    }

    public String getMascaraCaptura() {
        return MascaraCaptura;
    }

    public void setMascaraCaptura(String mascaraCaptura) {
        MascaraCaptura = mascaraCaptura;
    }

    public String getMascaraPresentacion() {
        return MascaraPresentacion;
    }

    public void setMascaraPresentacion(String mascaraPresentacion) {
        MascaraPresentacion = mascaraPresentacion;
    }

    public Long getIdTipoCatalogo() {
        return IdTipoCatalogo;
    }

    public void setIdTipoCatalogo(Long idTipoCatalogo) {
        IdTipoCatalogo = idTipoCatalogo;
    }

    public Long getIdValorCatalogoDefault() {
        return IdValorCatalogoDefault;
    }

    public void setIdValorCatalogoDefault(Long idValorCatalogoDefault) {
        IdValorCatalogoDefault = idValorCatalogoDefault;
    }

    public String getIdReglaValidacionDefault() {
        return IdReglaValidacionDefault;
    }

    public void setIdReglaValidacionDefault(String idReglaValidacionDefault) {
        IdReglaValidacionDefault = idReglaValidacionDefault;
    }

    public String getIdTipoControlVisual() {
        return IdTipoControlVisual;
    }

    public void setIdTipoControlVisual(String idTipoControlVisual) {
        IdTipoControlVisual = idTipoControlVisual;
    }

    public String getIdTipoValorDefault() {
        return IdTipoValorDefault;
    }

    public void setIdTipoValorDefault(String idTipoValorDefault) {
        IdTipoValorDefault = idTipoValorDefault;
    }

    public String getValorDefault() {
        return ValorDefault;
    }

    public void setValorDefault(String valorDefault) {
        ValorDefault = valorDefault;
    }

    public String getExpresionRegularValida() {
        return ExpresionRegularValida;
    }

    public void setExpresionRegularValida(String expresionRegularValida) {
        ExpresionRegularValida = expresionRegularValida;
    }

    public String getIdReglaValidacionCaptura() {
        return IdReglaValidacionCaptura;
    }

    public void setIdReglaValidacionCaptura(String idReglaValidacionCaptura) {
        IdReglaValidacionCaptura = idReglaValidacionCaptura;
    }

    public String getBEsEditable() {
        return BEsEditable;
    }

    public void setBEsEditable(String bEsEditable) {
        BEsEditable = bEsEditable;
    }

    public String getIdReglaValidacionEditable() {
        return IdReglaValidacionEditable;
    }

    public void setIdReglaValidacionEditable(String idReglaValidacionEditable) {
        IdReglaValidacionEditable = idReglaValidacionEditable;
    }

    public Date getFIniVigencia() {
        return FIniVigencia;
    }

    public void setFIniVigencia(Date fIniVigencia) {
        FIniVigencia = fIniVigencia;
    }

    public Date getFFinVigencia() {
        return FFinVigencia;
    }

    public void setFFinVigencia(Date fFinVigencia) {
        FFinVigencia = fFinVigencia;
    }

    public Long getIdStatus() {
        return IdStatus;
    }

    public void setIdStatus(Long idStatus) {
        IdStatus = idStatus;
    }

    @Override
    public String toString() {
        return (
            "RiConceptoCuest [IdConceptoCuest=" +
            IdConceptoCuest +
            ", DescConceptoCuest=" +
            DescConceptoCuest +
            ", IdTipoDatoCuest=" +
            IdTipoDatoCuest +
            ", Etiqueta=" +
            Etiqueta +
            ", Ayuda=" +
            Ayuda +
            ", IdTipoDato=" +
            IdTipoDato +
            ", LongitudMinima=" +
            LongitudMinima +
            ", LongitudMaxima=" +
            LongitudMaxima +
            ", IdTipoValorMinimo=" +
            IdTipoValorMinimo +
            ", ValorMinimo=" +
            ValorMinimo +
            ", IdTipoValorMaximo=" +
            IdTipoValorMaximo +
            ", ValorMaximo=" +
            ValorMaximo +
            ", MascaraCaptura=" +
            MascaraCaptura +
            ", MascaraPresentacion=" +
            MascaraPresentacion +
            ", IdTipoCatalogo=" +
            IdTipoCatalogo +
            ", IdValorCatalogoDefault=" +
            IdValorCatalogoDefault +
            ", IdReglaValidacionDefault=" +
            IdReglaValidacionDefault +
            ", IdTipoControlVisual=" +
            IdTipoControlVisual +
            ", IdTipoValorDefault=" +
            IdTipoValorDefault +
            ", ValorDefault=" +
            ValorDefault +
            ", ExpresionRegularValida=" +
            ExpresionRegularValida +
            ", IdReglaValidacionCaptura=" +
            IdReglaValidacionCaptura +
            ", BEsEditable=" +
            BEsEditable +
            ", IdReglaValidacionEditable=" +
            IdReglaValidacionEditable +
            ", FIniVigencia=" +
            FIniVigencia +
            ", FFinVigencia=" +
            FFinVigencia +
            ", IdStatus=" +
            IdStatus +
            "]"
        );
    }
}
