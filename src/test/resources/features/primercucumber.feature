@cursos
Feature: Ingreso a sysacad e inento ingresar sin credenciales

    Scenario: Ingreso a sysacad
        Given I navigate to MySysacad
        When I ingress my pass
        Then I take the button Acceder
