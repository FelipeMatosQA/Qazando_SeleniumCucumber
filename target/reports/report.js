$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Receber desconto da qazando",
  "description": "Eu como usuário da qazando\r\nquero receber um cupom de desconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar codigo de desconto",
  "description": "",
  "id": "receber-desconto-da-qazando;visualizar-codigo-de-desconto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 10,
  "name": "que eu estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu preencho meu e-mail",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu vejo o codigo de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.que_eu_estou_no_site_da_qazando()"
});
formatter.result({
  "duration": 3203800300,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_meu_e_mail()"
});
formatter.result({
  "duration": 2255325600,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 117669400,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_vejo_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 39701000,
  "status": "passed"
});
});