package com.sasai.web.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ri_grupo_seccion_tipo_cuest")
public class RiGrupoSeccionTipoCuest extends AbstractAuditingEntity implements Serializable {

    @Id
    @Column(name = "id_tipo_cuest", nullable = false)
    private Long IdTipoCuest;

    @Column(name = "id_seccion_tipo_cuest", nullable = false)
    private Long IdSeccionTipoCuest;

    @Column(name = "id_grupo_seccion_cuest", nullable = false)
    private String IdGrupoSeccionCuest;

    @Column(name = "b_unicidad_grupo", nullable = true)
    private String BUnicidadGrupo;

    @Column(name = "b_obligatorio", nullable = true)
    private String BObligatorio;

    @Column(name = "id_regla_validacion_oblig", nullable = true)
    private String IdReglaValidacionOblig;

    @Column(name = "etiqueta", nullable = true)
    private String Etiqueta;

    @Column(name = "ayuda", nullable = true)
    private String Ayuda;

    @Column(name = "id_regla_validacion_present", nullable = true)
    private String IdReglaValidacionPresent;

    @Column(name = "secuencia_presentacion_gpo", nullable = true)
    private String SecuenciaPresentacionGpo;

    @Column(name = "b_es_editable", nullable = false)
    private String BEsEditable;

    @Column(name = "id_regla_validacion_editable", nullable = false)
    private String IdReglaValidacionEditable;

    @Column(name = "id_status", nullable = false)
    private String IdStatus;

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

    public String getIdGrupoSeccionCuest() {
        return IdGrupoSeccionCuest;
    }

    public void setIdGrupoSeccionCuest(String idGrupoSeccionCuest) {
        IdGrupoSeccionCuest = idGrupoSeccionCuest;
    }

    public String getBUnicidadGrupo() {
        return BUnicidadGrupo;
    }

    public void setBUnicidadGrupo(String bUnicidadGrupo) {
        BUnicidadGrupo = bUnicidadGrupo;
    }

    public String getBObligatorio() {
        return BObligatorio;
    }

    public void setBObligatorio(String bObligatorio) {
        BObligatorio = bObligatorio;
    }

    public String getIdReglaValidacionOblig() {
        return IdReglaValidacionOblig;
    }

    public void setIdReglaValidacionOblig(String idReglaValidacionOblig) {
        IdReglaValidacionOblig = idReglaValidacionOblig;
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

    public String getIdReglaValidacionPresent() {
        return IdReglaValidacionPresent;
    }

    public void setIdReglaValidacionPresent(String idReglaValidacionPresent) {
        IdReglaValidacionPresent = idReglaValidacionPresent;
    }

    public String getSecuenciaPresentacionGpo() {
        return SecuenciaPresentacionGpo;
    }

    public void setSecuenciaPresentacionGpo(String secuenciaPresentacionGpo) {
        SecuenciaPresentacionGpo = secuenciaPresentacionGpo;
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

    public String getIdStatus() {
        return IdStatus;
    }

    public void setIdStatus(String idStatus) {
        IdStatus = idStatus;
    }

    @Override
    public String toString() {
        return (
            "RiGrupoSeccionTipoCuest [IdTipoCuest=" +
            IdTipoCuest +
            ", IdSeccionTipoCuest=" +
            IdSeccionTipoCuest +
            ", IdGrupoSeccionCuest=" +
            IdGrupoSeccionCuest +
            ", BUnicidadGrupo=" +
            BUnicidadGrupo +
            ", BObligatorio=" +
            BObligatorio +
            ", IdReglaValidacionOblig=" +
            IdReglaValidacionOblig +
            ", Etiqueta=" +
            Etiqueta +
            ", Ayuda=" +
            Ayuda +
            ", IdReglaValidacionPresent=" +
            IdReglaValidacionPresent +
            ", SecuenciaPresentacionGpo=" +
            SecuenciaPresentacionGpo +
            ", BEsEditable=" +
            BEsEditable +
            ", IdReglaValidacionEditable=" +
            IdReglaValidacionEditable +
            ", IdStatus=" +
            IdStatus +
            "]"
        );
    }
}
