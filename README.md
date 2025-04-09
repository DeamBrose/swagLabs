# Proyecto de Automatización Swag Labs (Sauce Demo)
Este proyecto contiene pruebas automatizadas de interfaz de usuario (UI) para el sitio web de demostración [Sauce Demo](https://www.saucedemo.com/). Las pruebas cubren funcionalidades clave como el inicio de sesión, la adición de productos al carrito y el
proceso de checkout.

## Tecnologías Utilizadas

*   **Lenguaje:** Java (Se recomienda JDK 11 o superior)
*   **Automatización UI:** Selenium WebDriver
*   **Framework BDD:** Cucumber
*   **Gestor de Dependencias y Build:** Apache Maven
*   **Gestor de Drivers:** WebDriverManager
*   **Navegador:** Google Chrome (Principalmente configurado para este navegador)
*   **Aserciones:** JUnit (Integrado con Cucumber)

## Pre Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

1.  **JDK (Java Development Kit):** Versión 11 o superior. Verifica con `java -version`.
2.  **Apache Maven:** Verifica con `mvn -version`.
3.  **Git:** Para clonar el repositorio.
4.  **Google Chrome:** El navegador debe estar instalado, ya que las pruebas están configuradas para usar `ChromeDriver`. WebDriverManager se encargará de descargar el driver correspondiente.

## Configuración del Proyecto

1.  **Clonar el Repositorio:**
    *(Reemplaza `<URL_DEL_REPOSITORIO_GIT>` con la URL real de tu repositorio)*

2.  **Instalar Dependencias:** Maven descargará todas las dependencias necesarias definidas en el archivo `pom.xml`.

## Ejecución de las Pruebas

Puedes ejecutar las pruebas automatizadas usando Maven desde la línea de comandos en la raíz del proyecto.

1.  **Ejecutar todas las pruebas:**

2.  **Ejecutar pruebas por Tags
    :**
    Puedes ejecutar escenarios específicos usando los tags definidos en los archivos `.feature` (ej. `@regresion`).

## Reportes

Después de la ejecución, se genera un reporte HTML de Cucumber.

*   **Ubicación:** El reporte se encuentra generalmente en la carpeta `target/cucumber-reports/`.
*   **Archivo Principal:** Abre el archivo `index.html` dentro de esa carpeta.
*   **Acceso:**
    *   **Localmente (Ruta de archivo):** Puedes abrir la ruta completa en tu navegador, por ejemplo: `file:///C:/Users/emili/Desktop/newProyectoWeb/swagLabs/target/cucumber-reports/index.html` (Ajusta la ruta según tu sistema).
    *   **Servidor Local (si aplica):** Si estás usando un servidor integrado (como el de IntelliJ IDEA), la URL podría ser similar a: `http://localhost:63342/swagLabs/target/cucumber-reports/index.html` (El puerto y la ruta base pueden variar).
#
