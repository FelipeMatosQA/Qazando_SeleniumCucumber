#language: pt

Funcionalidade: Receber desconto da qazando
  Eu como usuário da qazando
  quero receber um cupom de desconto
  para comprar um curso com valor reduzido

  Cenário: Visualizar codigo de desconto

    Dado que eu estou no site da qazando
    Quando eu preencho meu e-mail
    E clico em ganhar cupom
    Então eu vejo o codigo de desconto