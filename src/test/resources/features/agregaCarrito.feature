@agregarcarritos
Feature: agrega productos al carrito de compras

  Scenario: El usuario agrega productos al carrito

    Given agrega un producto al carrito de compras
    When  hace click en el carro de compras
    Then visualiza sus productos agregados

