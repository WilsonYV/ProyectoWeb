<template>
  <div>
    <div class="EncabezadoPJ">
      <h2>&nbsp; Alta de Contrato Persona Fisica prueba al pull</h2>
      <hr />
    </div>
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th> descTipoCuest</th>
          <th> idPerJuridica</th>
          <th> descSeccionTipoCuest</th>
          <th> etiquetaGrupo</th>
          <th> idTipoDatoCuest</th>
          <th> etiquetaConcepto</th>
          <th> ayudaConcepto</th>
          <th> idTipoDato</th>
          <th> idTipoDato</th>
          <th> longitudMaxima</th>
          <th> idTipoValorMinimo</th>
          <th> valorMinimo</th>
          <th> idTipoValorMaximo</th>
          <th> valorMaximo</th>
          <th> mascaraCaptura</th>
          <th> mascaraPresentacion</th>
          <th> idTipoCatalogo</th>
          <th> idValorCatalogoDefault</th>
          <th> idReglaValidacionDefault</th>
          <th> idTipoControlVisual</th>
          <th> idTipoValorDefault</th>
          <th> valorDefault</th>
          <th> expresionRegularValida</th>
          <th> idReglaValidacionCaptura</th>
          <th> bEsEditable</th>
          <th> idReglaValidacionEditable</th>
          <th> bUnicidadGrupo</th>
          <th> idTipoCuest</th>
          <th> idSeccionTipoCuest</th>
          <th> idGrupoSeccionCuest</th>
          <th> idConceptoCuest</th>
          <th> consecutivoGrupo</th>
        </tr>
      </thead>
      <tbody>
        <tr th:each="contrato : ${creaContratosHTML}">
          <td th.text="${contrato.id}"> </td>
          <td th.text="${contrato.descTipoCuest}"></td>
          <td th.text="${contrato.idPerJuridica}"></td>
          <td th.text="${contrato.descSeccionTipoCuest}"></td>
          <td th.text="${contrato.etiquetaGrupo}"></td>
          <td th.text="${contrato.idTipoDatoCuest}"></td>
          <td th.text="${contrato.etiquetaConcepto}"></td>
          <td th.text="${contrato.ayudaConcepto}"></td>
          <td th.text="${contrato.idTipoDato}"></td>
          <td th.text="${contrato.idTipoDato}"></td>
          <td th.text="${contrato.longitudMaxima}"></td>
          <td th.text="${contrato.idTipoValorMinimo}"></td>
          <td th.text="${contrato.valorMinimo}"></td>
          <td th.text="${contrato.idTipoValorMaximo}"></td>
          <td th.text="${contrato.valorMaximo}"></td>
          <td th.text="${contrato.mascaraCaptura}"></td>
          <td th.text="${contrato.mascaraPresentacion}"></td>
          <td th.text="${contrato.idTipoCatalogo}"></td>
          <td th.text="${contrato.idValorCatalogoDefault}"></td>
          <td th.text="${contrato.idReglaValidacionDefault}"></td>
          <td th.text="${contrato.idTipoControlVisual}"></td>
          <td th.text="${contrato.idTipoValorDefault}"></td>
          <td th.text="${contrato.valorDefault}"></td>
          <td th.text="${contrato.expresionRegularValida}"></td>
          <td th.text="${contrato.idReglaValidacionCaptura}"></td>
          <td th.text="${contrato.bEsEditable}"></td>
          <td th.text="${contrato.idReglaValidacionEditable}"></td>
          <td th.text="${contrato.bUnicidadGrupo}"></td>
          <td th.text="${contrato.idTipoCuest}"></td>
          <td th.text="${contrato.idSeccionTipoCuest}"></td>
          <td th.text="${contrato.idGrupoSeccionCuest}"></td>
          <td th.text="${contrato.idConceptoCuest}"></td>
          <td th.text="${contrato.consecutivoGrupo}"></td>

        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>

</script>
