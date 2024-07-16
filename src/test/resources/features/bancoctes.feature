@banco
Feature: Ingreso a la pagina principal Banco de Corrientes

  #Scenario: Ingreso a la pagina | Botones
   # Given el usuario navega a la pagina
    #When hace click en el boton continuar
    #Then se muestra el mensaje de completar informacion


    Scenario: Boton He olvidado mis credenciales
      Given el usuario navega a la pagina
      When hace click en el boton he olvidado mis credenciales
      Then se muestra la ventana modal

