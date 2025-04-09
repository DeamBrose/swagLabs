Feature: Funcionalidad de creación de cuenta
  @Regression
  Scenario: Creación de cuenta exitosa
    Given que la web esté disponible
    And ingresar al opción de creacion de cuenta
    And ingresar un correo "marioluis@gmail.com"
    And seleccionar el genero "señor"
    And ingresar nombre "Carlos"
    And ingresar apellido "Prado"
    And validar el correo "marioluis@gmail.com"
    And ingresar password "carlos123"
    And ingresar fecha de nacimiento "2/10/1998"
    And "si" permitir envio de newsletter
    And seleccionar ofertas "no"
    And escribir empresa "mi empresa"
    And escribir primera direccion "mi casa 958"
    And escribir segunda direccion "mi segunda casa 123"
    And escribir ciudad "Lima"
    And seleccionar estado "Arizona"
    And escribir codigo postal "12565"
    And seleccionar pais "United States"
    And escribir info "registro de mi cuenta"
    And escribir telefono "555666"
    And escribir celular "956231256"
    And escribir alias "mi cuenta"
    And registrar registro

  @Table
  Scenario Outline: Creación de cuenta exitosa con varios registros
    Given que la web esté disponible
    And ingresar al opción de creacion de cuenta
    And ingresar un correo "<correo>"
    And seleccionar el genero "<genero>"
    And ingresar nombre "<nombre>"
    And ingresar apellido "<apellido>"
    And validar el correo "<correo>"
    And ingresar password "<password>"
    And ingresar fecha de nacimiento "<fechanacimiento>"
    And "<newsletter>" permitir envio de newsletter
    And seleccionar ofertas "<ofertas>"
    And escribir empresa "<nombreempresa>"
    And escribir primera direccion "<direccion1>"
    And escribir segunda direccion "<direccion2>"
    And escribir ciudad "<ciudad>"
    And seleccionar estado "<estado>"
    And escribir codigo postal "<codepostal>"
    And seleccionar pais "<pais>"
    And escribir info "<infoadicinal>"
    And escribir telefono "<telefono>"
    And escribir celular "<celular>"
    And escribir alias "<alias>"
    And registrar registro

    Examples:
      | correo                | genero | nombre    | apellido | password     | fechanacimiento | newsletter | ofertas | nombreempresa | direccion1  | direccion2          | ciudad | estado  | codepostal | pais          | infoadicinal          | telefono | celular   | alias     |
      | yutube@gmail.com      | señor  | Emilio    | Pilco    | emilio123    | 2/10/1998       | si         | no      | mi empresa    | mi casa 958 | mi segunda casa 123 | Lima   | Arizona | 88954      | United States | registro de mi cuenta | 555666   | 956231256 | mi cuenta |
      | powerdevil@gmail.com  | señor  | Alex      | Pilco    | alex12346    | 2/11/1998       | no         | si      | mi empresa    | mi casa 958 | mi segunda casa 123 | Lima   | Arizona | 96364      | United States | registro de mi cuenta | 555666   | 956321565 | mi cuenta |
      | pocoyo@gmail.com      | señora | Elizabeth | Rojas    | elizabeth123 | 15/10/1990      | si         | no      | mi empresa    | mi casa 958 | mi segunda casa 123 | Lima   | Arizona | 23565      | United States | registro de mi cuenta | 555666   | 986201236 | mi cuenta |
      | plutonLucas@gmail.com | señor  | Lucas     | Prado    | lucas123     | 4/10/1998       | no         | no      | mi empresa    | mi casa 958 | mi segunda casa 123 | Lima   | Arizona | 85418      | United States | registro de mi cuenta | 555666   | 902102565 | mi cuenta |