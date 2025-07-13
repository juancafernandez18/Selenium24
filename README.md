# 📦 Proyecto de Automatización QA - Selenium + Java + Gradle + Cucumber + Allure

Este proyecto implementa un framework de automatización de pruebas funcionales para aplicaciones web utilizando **Selenium WebDriver**, **Java**, **Gradle**, **Cucumber** y reportes con **Allure**.

---

## 📌 Tecnologías utilizadas

- 🔹 Java 17
- 🔹 Gradle 8.0.2
- 🔹 Selenium WebDriver 4.18.1
- 🔹 Cucumber JVM 7.x
- 🔹 JUnit 5
- 🔹 WebDriverManager
- 🔹 Allure Reports
- 🔹 Maven Surefire / Gradle Test Plugin

---

## 📁 Estructura del proyecto

📦Instalacion Java JDK
Descargar la version Java JDK 1.8: Java JDK Download
Configurar las variables de Entorno JAVA_HOME y PATH: How to - Instalar y Configurar Java

📦 Instalar dependencias
./gradlew clean build

<img width="645" height="644" alt="image" src="https://github.com/user-attachments/assets/9516aaf1-1da1-47a6-8063-81cb10669d90" />

Instalacion de IDE IntelliJ
Descargar la version 2022 1.4: IntelliJ Download
Buscar la versión 2022.1.4 Community Windows X64(.exe)
Instalar IntelliJ

📦Plugins
Dentro del proyecto, click en solapa File.
Seleccionar Settings y dentro de la ventana dirigirse al menú Plugins.
Se debe descargar los siguientes Plugins: Gherkin y Cucumber for Java.

<img width="998" height="720" alt="image" src="https://github.com/user-attachments/assets/6163eade-b311-4ed9-a636-31ea865d0450" />


▶️ Ejecutar pruebas
<img width="1077" height="768" alt="image" src="https://github.com/user-attachments/assets/4b73bffd-e0a4-47fa-bd0e-6df2295daa1a" />

📊 Visualización de Reportes
Para los reportes se utiliza Allure Report
gradle allureReport --clean      # De acuerdo a los test ejecutados se crea la carpeta allure-results con formatos json en el cual allure report genera el reporte
gradle   allureServe             # Ejecuta el reporte abriendo en el navagador el reporte


📚 Créditos
Proyecto desarrollado por Juan Carlos Fernández
📧 contacto: juanca.fernandez18@gmail.com
📝 LinkedIn
