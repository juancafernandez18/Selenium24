@login
Feature: Login a SauceDemo.com

  Background:
    Given Navego a saucedemo.com
@logincorrecto
  Scenario: El usuario realiza el login

    When Realizo un login correcto
    Then Visualizo la pagina de productos

@loginincorrecto
  Scenario: El usuario ingresa un dato no existente
    When el usuario ingresa un dato incorrecto
    Then se muestra el mensaje de error
