package com.sasai.web.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ri_tipo_dato_cuest")
public class RiTipoDatoCuest extends AbstractAuditingEntity implements Serializable {

    @javax.persistence.Id
    @Column(name = "id_tipo_dato_cuest", nullable = false)
    private Long IdTipoDatoCuest;

    @Column(name = "desc_tipo_dato_cuest", nullable = false)
    private Long DescTipoDatoCuest;

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
}
