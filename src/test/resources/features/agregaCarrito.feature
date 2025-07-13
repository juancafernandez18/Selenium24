@agregarcarritos
Feature: agrega productos al carrito de compras

  Background:
    Given Navego a saucedemo.com
    When Realizo un login correcto


  Scenario: El usuario agrega productos al carrito

    When agrega un producto al carrito de compras
    And  hace click en el carro de compras
    Then visualiza sus productos agregados

