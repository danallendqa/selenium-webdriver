package com.example;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prueba {
    public static void main(String[] args) {
        // Ruta completa al ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chrome.exe");

        // Opciones de Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = null;

        try {
            // Inicializar WebDriver
            System.out.println("Inicializando el WebDriver...");
            driver = new ChromeDriver(options);

            // Abrir una página web
            System.out.println("Abriendo Google...");
            driver.get("https://www.creacapital.com");

            // Esperar unos segundos para ver la página
            Thread.sleep(5000);

            System.out.println("Página abierta correctamente.");
        } catch (SessionNotCreatedException e) {
            System.err.println("No se pudo crear una nueva sesión. Posibles causas: dirección inválida del servidor remoto o fallo al iniciar el navegador.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("El hilo fue interrumpido.");
            e.printStackTrace();
        } finally {
            if (driver != null) {
                // Cerrar el navegador
                System.out.println("Cerrando el navegador...");
                driver.quit();
            }
            System.out.println("Proceso completado.");
        
        }
    }
}

