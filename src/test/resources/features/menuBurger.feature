@menuBurger
Feature: El usuario hace uso del menu hamburguesa

  Background:
    Given Navego
    When login


  Scenario: El usuario hace click en menu hamburguesa

    And hace click en menu hamburguesa
    Then visualiza el dropdown de opciones
