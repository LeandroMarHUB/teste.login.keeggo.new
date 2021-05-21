#Author: leandro1984martins@hotmail.com


Feature: Realizando login de usuario cadastrado
   Eu como usuario ja cadastrado quero logar na minha conta 

 
  Scenario: entrando no site para realiar login
    Given que eu esteja no site "http://advantageonlineshopping.com/#/"
    When vou no icone de login e comeco a preencher as lacunas
    Then faço meu login
