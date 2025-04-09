Feature:
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión, agregar productos al carrito y completar una
  compra
  Para poder adquirir los productos que necesito

  @regresion
  Scenario: Validacion de Inicio de sesion exitoso con credenciales validas - Ok
    Given estoy en la pagina de login de Sauce Demo
    When inicio sesion como usuario estandar
    Then deberia ver la pagina de inventario de productos

  @regresion
  Scenario: Validacion de Inicio de sesion fallido con credenciales invalidas - No Ok
    Given estoy en la pagina de login de Sauce Demo
    When inicio sesion como usuario no registrado
    Then deberia responderme con el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @regresion
  Scenario: Validacion de Inicio de sesion fallido con credenciales bloqueadas - No Ok
    Given estoy en la pagina de login de Sauce Demo
    When inicio sesion como usuario bloqueado
    Then deberia responderme con el mensaje de error "Epic sadface: Sorry, this user has been locked out."

  @regresion
  Scenario: Validacion de agregar productos en el carrito de compra - Ok
    Given estoy en la pagina de login de Sauce Demo
    And inicio sesion como usuario estandar
    When agregue productos al carrito de compra
    Then verifico que en la pagina de carrito de compra se visualice los productos agregados

  @regresion
  Scenario: Validacion de confirmación de compra del carrito- Ok
    Given estoy en la pagina de login de Sauce Demo
    And inicio sesion como usuario estandar
    And agregue tres productos al carrito de compra
    When continuo con el proceso de checkout
    And agrego mi información personal en la pagina de Checkout: Your Information
    And continuo con el proceso de la compra con el boton continuar
    And verifico que me muestre los productos y finalizo con mi pedido dandole click al boton finish en la pagina Checkout: Overview
    Then valido que me muestre un mensaje "Thank you for your order!"






