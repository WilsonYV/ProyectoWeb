package com.sasai.web.repository;

import com.sasai.web.domain.Contrato;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ContratosRepository {

    private final JdbcTemplate jdbcTemplate;

    public ContratosRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Contrato> getContratos() {
        return jdbcTemplate.query(
            "SELECT  ROWNUM AS id_dato_cuest,A.desc_tipo_cuest,A.id_per_juridica,B.desc_seccion_tipo_cuest,C.etiqueta etiqueta_grupo,f.id_tipo_dato_cuest,\n" +
            "           CASE WHEN D.etiqueta IS NOT NULL THEN D.etiqueta\n" +
            "                WHEN E.etiqueta IS NOT NULL THEN E.etiqueta\n" +
            "                WHEN F.etiqueta IS NOT NULL THEN F.etiqueta\n" +
            "            END   etiqueta_concepto,\n" +
            "           CASE WHEN D.ayuda IS NOT NULL THEN D.ayuda\n" +
            "                     WHEN E.ayuda IS NOT NULL THEN E.ayuda\n" +
            "                     WHEN F.ayuda IS NOT NULL THEN F.ayuda\n" +
            "            END   ayuda_concepto,\n" +
            "           CASE WHEN D.id_tipo_dato IS NOT NULL THEN D.id_tipo_dato\n" +
            "                     WHEN E.id_tipo_dato IS NOT NULL THEN E.id_tipo_dato\n" +
            "                     WHEN F.id_tipo_dato IS NOT NULL THEN F.id_tipo_dato\n" +
            "            END   id_tipo_dato,\n" +
            "           CASE WHEN D.longitud_minima IS NOT NULL THEN D.longitud_minima\n" +
            "                     WHEN E.longitud_minima IS NOT NULL THEN E.longitud_minima\n" +
            "                     WHEN F.longitud_minima IS NOT NULL THEN F.longitud_minima\n" +
            "            END   longitud_minima,\n" +
            "           CASE WHEN D.longitud_maxima IS NOT NULL THEN D.longitud_maxima\n" +
            "                     WHEN E.longitud_maxima IS NOT NULL THEN E.longitud_maxima\n" +
            "                     WHEN F.longitud_maxima IS NOT NULL THEN F.longitud_maxima\n" +
            "            END   longitud_maxima,\n" +
            "           CASE WHEN D.id_tipo_valor_minimo IS NOT NULL THEN D.id_tipo_valor_minimo\n" +
            "                     WHEN E.id_tipo_valor_minimo IS NOT NULL THEN E.id_tipo_valor_minimo\n" +
            "                     WHEN F.id_tipo_valor_minimo IS NOT NULL THEN F.id_tipo_valor_minimo\n" +
            "            END   id_tipo_valor_minimo,\n" +
            "           CASE WHEN D.valor_minimo IS NOT NULL THEN D.valor_minimo\n" +
            "                     WHEN E.valor_minimo IS NOT NULL THEN E.valor_minimo\n" +
            "                     WHEN F.valor_minimo IS NOT NULL THEN F.valor_minimo\n" +
            "            END   valor_minimo,\n" +
            "           CASE WHEN D.id_tipo_valor_maximo IS NOT NULL THEN D.id_tipo_valor_maximo\n" +
            "                     WHEN E.id_tipo_valor_maximo IS NOT NULL THEN E.id_tipo_valor_maximo\n" +
            "                     WHEN F.id_tipo_valor_maximo IS NOT NULL THEN F.id_tipo_valor_maximo\n" +
            "            END   id_tipo_valor_maximo,\n" +
            "           CASE WHEN D.valor_maximo IS NOT NULL THEN D.valor_maximo\n" +
            "                     WHEN E.valor_maximo IS NOT NULL THEN E.valor_maximo\n" +
            "                     WHEN F.valor_maximo IS NOT NULL THEN F.valor_maximo\n" +
            "            END   valor_maximo,\n" +
            "           CASE WHEN D.mascara_captura IS NOT NULL THEN D.mascara_captura\n" +
            "                     WHEN E.mascara_captura IS NOT NULL THEN E.mascara_captura\n" +
            "                     WHEN F.mascara_captura IS NOT NULL THEN F.mascara_captura\n" +
            "            END   mascara_captura,\n" +
            "           CASE WHEN D.mascara_presentacion IS NOT NULL THEN D.mascara_presentacion\n" +
            "                     WHEN E.mascara_presentacion IS NOT NULL THEN E.mascara_presentacion\n" +
            "                     WHEN F.mascara_presentacion IS NOT NULL THEN F.mascara_presentacion\n" +
            "            END   mascara_presentacion,\n" +
            "           CASE WHEN D.id_tipo_catalogo IS NOT NULL THEN D.id_tipo_catalogo\n" +
            "                     WHEN E.id_tipo_catalogo IS NOT NULL THEN E.id_tipo_catalogo\n" +
            "                     WHEN F.id_tipo_catalogo IS NOT NULL THEN F.id_tipo_catalogo\n" +
            "            END   id_tipo_catalogo,\n" +
            "           CASE WHEN D.id_valor_catalogo_default IS NOT NULL THEN D.id_valor_catalogo_default\n" +
            "                     WHEN E.id_valor_catalogo_default IS NOT NULL THEN E.id_valor_catalogo_default\n" +
            "                     WHEN F.id_valor_catalogo_default IS NOT NULL THEN F.id_valor_catalogo_default\n" +
            "            END   id_valor_catalogo_default,\n" +
            "           CASE WHEN D.id_regla_validacion_default IS NOT NULL THEN D.id_regla_validacion_default\n" +
            "                     WHEN E.id_regla_validacion_default IS NOT NULL THEN E.id_regla_validacion_default\n" +
            "                     WHEN F.id_regla_validacion_default IS NOT NULL THEN F.id_regla_validacion_default\n" +
            "            END   id_regla_validacion_default,\n" +
            "           CASE WHEN D.id_tipo_control_visual IS NOT NULL THEN D.id_tipo_control_visual\n" +
            "                     WHEN E.id_tipo_control_visual IS NOT NULL THEN E.id_tipo_control_visual\n" +
            "                     WHEN F.id_tipo_control_visual IS NOT NULL THEN F.id_tipo_control_visual\n" +
            "            END   id_tipo_control_visual,\n" +
            "           CASE WHEN D.id_tipo_valor_default IS NOT NULL THEN D.id_tipo_valor_default\n" +
            "                     WHEN E.id_tipo_valor_default IS NOT NULL THEN E.id_tipo_valor_default\n" +
            "                     WHEN F.id_tipo_valor_default IS NOT NULL THEN F.id_tipo_valor_default\n" +
            "            END   id_tipo_valor_default,\n" +
            "           CASE WHEN D.valor_default IS NOT NULL THEN D.valor_default\n" +
            "                     WHEN E.valor_default IS NOT NULL THEN E.valor_default\n" +
            "                     WHEN F.valor_default IS NOT NULL THEN F.valor_default\n" +
            "            END   valor_default,\n" +
            "           CASE WHEN D.expresion_regular_valida IS NOT NULL THEN D.expresion_regular_valida\n" +
            "                     WHEN E.expresion_regular_valida IS NOT NULL THEN E.expresion_regular_valida\n" +
            "                     WHEN F.expresion_regular_valida IS NOT NULL THEN F.expresion_regular_valida\n" +
            "            END   expresion_regular_valida,\n" +
            "           CASE WHEN D.id_regla_validacion_captura IS NOT NULL THEN D.id_regla_validacion_captura\n" +
            "                     WHEN E.id_regla_validacion_captura IS NOT NULL THEN E.id_regla_validacion_captura\n" +
            "                     WHEN F.id_regla_validacion_captura IS NOT NULL THEN F.id_regla_validacion_captura\n" +
            "            END   id_regla_validacion_captura,\n" +
            "           CASE WHEN D.b_es_editable IS NOT NULL THEN D.b_es_editable\n" +
            "                     WHEN E.b_es_editable IS NOT NULL THEN E.b_es_editable\n" +
            "                     WHEN F.b_es_editable IS NOT NULL THEN F.b_es_editable\n" +
            "            END   b_es_editable,\n" +
            "           CASE WHEN D.id_regla_validacion_editable IS NOT NULL THEN D.id_regla_validacion_editable\n" +
            "                     WHEN E.id_regla_validacion_editable IS NOT NULL THEN E.id_regla_validacion_editable\n" +
            "                     WHEN F.id_regla_validacion_editable IS NOT NULL THEN F.id_regla_validacion_editable\n" +
            "            END   id_regla_validacion_editable,\n" +
            "            c.b_unicidad_grupo,\n" +
            "            a.id_tipo_cuest,\n" +
            "            b.id_seccion_tipo_cuest,\n" +
            "            c.id_grupo_seccion_cuest,\n" +
            "            e.id_concepto_cuest,\n" +
            "            H.consecutivo_grupo\n" +
            "          FROM RI_TIPO_CUEST A\n" +
            "          left JOIN RI_SECCION_TIPO_CUEST B ON (A.id_tipo_cuest=b.id_tipo_cuest)\n" +
            "          left JOIN RI_GRUPO_SECCION_TIPO_CUEST C ON (A.id_tipo_cuest=C.id_tipo_cuest\n" +
            "                                                  AND B.Id_seccion_tipo_cuest=C.Id_seccion_tipo_cuest)\n" +
            "          left JOIN RI_GRUPO_DATO_CUEST H ON (C.id_grupo_seccion_cuest=H.id_grupo_seccion_cuest)\n" +
            "          left JOIN RI_CONC_GPO_SECCION_TIPO_CUEST D ON (C.id_grupo_seccion_cuest=D.id_grupo_seccion_cuest\n" +
            "                                                     and b.id_seccion_tipo_cuest=d.id_seccion_tipo_cuest\n" +
            "                                                     AND b.id_tipo_cuest=d.id_tipo_cuest)\n" +
            "          left JOIN RI_CONCEPTO_CUEST E ON (D.id_concepto_cuest=E.id_concepto_cuest)\n" +
            "          left JOIN RI_TIPO_DATO_CUEST F ON (E.id_tipo_dato_cuest=F.id_tipo_dato_cuest)\n" +
            "          WHERE a.id_tipo_cuest=2\n" +
            "          AND  b.id_seccion_tipo_cuest=1--'Datos Generales'\n" +
            "          --AND  c.id_grupo_seccion_cuest IN (1)--Para cada seccion poner sus grupos\n" +
            "          --AND c.etiqueta='Datos Generales'\n" +
            "          ORDER BY secuencia_presentacion_sec,secuencia_presentacion_gpo,secuencia_presentacion_conc,f.id_tipo_dato_cuest",
            (rs, rowNum) ->
                new Contrato(
                    rs.getLong("id_dato_cuest"),
                    rs.getString("desc_tipo_cuest"),
                    rs.getString("id_per_juridica"),
                    rs.getString("desc_seccion_tipo_cuest"),
                    rs.getString("etiqueta_grupo"),
                    rs.getLong("id_tipo_dato_cuest"),
                    rs.getString("etiqueta_concepto"),
                    rs.getString("ayuda_concepto"),
                    rs.getString("id_tipo_dato"),
                    rs.getLong("longitud_minima"),
                    rs.getLong("longitud_maxima"),
                    rs.getString("id_tipo_valor_minimo"),
                    rs.getString("valor_minimo"),
                    rs.getString("id_tipo_valor_maximo"),
                    rs.getString("valor_maximo"),
                    rs.getString("mascara_captura"),
                    rs.getString("mascara_presentacion"),
                    rs.getLong("id_tipo_catalogo"),
                    rs.getLong("id_valor_catalogo_default"),
                    rs.getString("id_regla_validacion_default"),
                    rs.getString("id_tipo_control_visual"),
                    rs.getString("id_tipo_valor_default"),
                    rs.getString("valor_default"),
                    rs.getString("expresion_regular_valida"),
                    rs.getString("id_regla_validacion_captura"),
                    rs.getString("b_es_editable"),
                    rs.getString("id_regla_validacion_editable"),
                    rs.getString("b_unicidad_grupo"),
                    rs.getLong("id_tipo_cuest"),
                    rs.getLong("id_seccion_tipo_cuest"),
                    rs.getLong("id_grupo_seccion_cuest"),
                    rs.getLong("id_concepto_cuest"),
                    rs.getLong("consecutivo_grupo")
                )
        );
    }
}
