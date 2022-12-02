package com.sasai.web.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ri_seccion_tipo_cuest")
public class RiSeccionTipoCuest extends AbstractAuditingEntity implements Serializable {

    @Id
    @Column(name = "id_tipo_cuest", nullable = false)
    private Long IdTipoCuest;

    @Column(name = "id_seccion_tipo_cuest", nullable = false)
    private Long IdSeccionTipoCuest;

    @Column(name = "desc_seccion_tipo_cuest", nullable = false)
    private String DescSeccionTipoCuest;

    @Column(name = "b_obligatorio", nullable = true)
    private String BObligatorio;

    @Column(name = "b_unicidad_grupo", nullable = true)
    private String BUnicidadGrupo;

    @Column(name = "id_regla_validacion_oblig", nullable = true)
    private String IdReglaValidacionOblig;

    @Column(name = "id_regla_validacion_present", nullable = true)
    private String IdReglaValidacionPresent;

    @Column(name = "b_multipagina", nullable = true)
    private String BMultipagina;

    @Column(name = "secuencia_presentacion_sec", nullable = true)
    private Long SecuenciaPresentacionSec;

    @Column(name = "b_es_editable", nullable = false)
    private String BEsEditable;

    @Column(name = "id_regla_validacion_editable", nullable = true)
    private String IdReglaValidacionEditable;

    @Column(name = "b_header", nullable = true)
    private String BHeader;

    @Column(name = "b_footer", nullable = true)
    private String BFooter;

    @Column(name = "id_tipo_cuest_padre", nullable = true)
    private Long IdTipoCuestPadre;

    @Column(name = "id_seccion_tipo_cuest_padre", nullable = true)
    private Long IdSeccionTipoCuestPadre;

    @Column(name = "f_ini_vigencia", nullable = false)
    private Date FIniVigencia;

    @Column(name = "f_fin_vigencia", nullable = true)
    private Date FFinVigencia;

    @Column(name = "id_status", nullable = true)
    private Long IdStatus;

    public Long getIdTipoCuest() {
        return IdTipoCuest;
    }

    public void setIdTipoCuest(Long idTipoCuest) {
        IdTipoCuest = idTipoCuest;
    }

    public Long getIdSeccionTipoCuest() {
        return IdSeccionTipoCuest;
    }

    public void setIdSeccionTipoCuest(Long idSeccionTipoCuest) {
        IdSeccionTipoCuest = idSeccionTipoCuest;
    }

    public String getDescSeccionTipoCuest() {
        return DescSeccionTipoCuest;
    }

    public void setDescSeccionTipoCuest(String descSeccionTipoCuest) {
        DescSeccionTipoCuest = descSeccionTipoCuest;
    }

    public String getBObligatorio() {
        return BObligatorio;
    }

    public void setBObligatorio(String bObligatorio) {
        BObligatorio = bObligatorio;
    }

    public String getBUnicidadGrupo() {
        return BUnicidadGrupo;
    }

    public void setBUnicidadGrupo(String bUnicidadGrupo) {
        BUnicidadGrupo = bUnicidadGrupo;
    }

    public String getIdReglaValidacionOblig() {
        return IdReglaValidacionOblig;
    }

    public void setIdReglaValidacionOblig(String idReglaValidacionOblig) {
        IdReglaValidacionOblig = idReglaValidacionOblig;
    }

    public String getIdReglaValidacionPresent() {
        return IdReglaValidacionPresent;
    }

    public void setIdReglaValidacionPresent(String idReglaValidacionPresent) {
        IdReglaValidacionPresent = idReglaValidacionPresent;
    }

    public String getBMultipagina() {
        return BMultipagina;
    }

    public void setBMultipagina(String bMultipagina) {
        BMultipagina = bMultipagina;
    }

    public Long getSecuenciaPresentacionSec() {
        return SecuenciaPresentacionSec;
    }

    public void setSecuenciaPresentacionSec(Long secuenciaPresentacionSec) {
        SecuenciaPresentacionSec = secuenciaPresentacionSec;
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

    public String getBHeader() {
        return BHeader;
    }

    public void setBHeader(String bHeader) {
        BHeader = bHeader;
    }

    public String getBFooter() {
        return BFooter;
    }

    public void setBFooter(String bFooter) {
        BFooter = bFooter;
    }

    public Long getIdTipoCuestPadre() {
        return IdTipoCuestPadre;
    }

    public void setIdTipoCuestPadre(Long idTipoCuestPadre) {
        IdTipoCuestPadre = idTipoCuestPadre;
    }

    public Long getIdSeccionTipoCuestPadre() {
        return IdSeccionTipoCuestPadre;
    }

    public void setIdSeccionTipoCuestPadre(Long idSeccionTipoCuestPadre) {
        IdSeccionTipoCuestPadre = idSeccionTipoCuestPadre;
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
            "RiSeccionTipoCuest [IdTipoCuest=" +
            IdTipoCuest +
            ", IdSeccionTipoCuest=" +
            IdSeccionTipoCuest +
            ", DescSeccionTipoCuest=" +
            DescSeccionTipoCuest +
            ", BObligatorio=" +
            BObligatorio +
            ", BUnicidadGrupo=" +
            BUnicidadGrupo +
            ", IdReglaValidacionOblig=" +
            IdReglaValidacionOblig +
            ", IdReglaValidacionPresent=" +
            IdReglaValidacionPresent +
            ", BMultipagina=" +
            BMultipagina +
            ", SecuenciaPresentacionSec=" +
            SecuenciaPresentacionSec +
            ", BEsEditable=" +
            BEsEditable +
            ", IdReglaValidacionEditable=" +
            IdReglaValidacionEditable +
            ", BHeader=" +
            BHeader +
            ", BFooter=" +
            BFooter +
            ", IdTipoCuestPadre=" +
            IdTipoCuestPadre +
            ", IdSeccionTipoCuestPadre=" +
            IdSeccionTipoCuestPadre +
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
