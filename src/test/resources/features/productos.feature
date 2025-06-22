Feature: Productos

  @productos
  Scenario: Acceso a la pagina productos
    Given Navego a saucedemo
    When Realizo un login
    Then Visualizo los productos