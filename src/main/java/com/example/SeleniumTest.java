package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Establecer la propiedad del driver de Chrome
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chrome.exe");

        // Inicializar el navegador
        WebDriver driver = new ChromeDriver();

        // Navegar a una página web
        driver.get("https://www.linkedin.com/feed/");

        // Obtener el título de la página y mostrarlo
        System.out.println("El título de la página es: " + driver.getTitle());
    

        // Cerrar el navegador
    //    driver.quit();
    }
}
