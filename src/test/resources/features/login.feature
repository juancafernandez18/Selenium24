@login
Feature: Login


  Scenario: El usuario realiza el login
    Given Navego a saucedemo.com
    When Realizo un login correcto

@loginincorrecto
  Scenario: El usuario ingresa un dato no existente
    Given el usuario ingresa un dato incorrecto
    Then se muestra el mensaje de error
