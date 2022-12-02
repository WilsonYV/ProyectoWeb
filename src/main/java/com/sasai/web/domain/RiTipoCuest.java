package com.sasai.web.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ri_tipo_cuest")
public class RiTipoCuest extends AbstractAuditingEntity implements Serializable {

    @Id
    @Column(name = "id_tipo_cuest", nullable = false)
    private Long IdTipoCuest;

    @Column(name = "desc_tipo_cuest", nullable = false)
    private String DescTipoCuest;

    @Column(name = "id_per_juridica", nullable = false)
    private String IdPerJuridicq;

    @Column(name = "f_ini_vigencia", nullable = false)
    private Date FechaIniVigencia;

    @Column(name = "f_fin_vigencia")
    private Date FechaFinVigencia;

    @Column(name = "id_status", nullable = false)
    private Long IdStatus;

    public Long getIdTipoCuest() {
        return IdTipoCuest;
    }

    public void setIdTipoCuest(Long idTipoCuest) {
        IdTipoCuest = idTipoCuest;
    }

    public String getDescTipoCuest() {
        return DescTipoCuest;
    }

    public void setDescTipoCuest(String descTipoCuest) {
        DescTipoCuest = descTipoCuest;
    }

    public String getIdPerJuridicq() {
        return IdPerJuridicq;
    }

    public void setIdPerJuridicq(String idPerJuridicq) {
        IdPerJuridicq = idPerJuridicq;
    }

    public Date getFechaIniVigencia() {
        return FechaIniVigencia;
    }

    public void setFechaIniVigencia(Date fechaIniVigencia) {
        FechaIniVigencia = fechaIniVigencia;
    }

    public Date getFechaFinVigencia() {
        return FechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        FechaFinVigencia = fechaFinVigencia;
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
            "RiTipoCuest [IdTipoCuest=" +
            IdTipoCuest +
            ", DescTipoCuest=" +
            DescTipoCuest +
            ", IdPerJuridicq=" +
            IdPerJuridicq +
            ", FechaIniVigencia=" +
            FechaIniVigencia +
            ", FechaFinVigencia=" +
            FechaFinVigencia +
            ", IdStatus=" +
            IdStatus +
            "]"
        );
    }
}
