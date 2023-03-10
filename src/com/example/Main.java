package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product producto1 = new Product("Cola-Cao", 3.95, 00014502);
        Product producto2 = new Product("Pan", 0.10, 0012445);
        Product producto3 = new Product("Azucar", 1.55, 000123);
        Product producto4 = new Product("Leche", 1.02, 00234);
        Product producto5 = new Product("Galletas", 3.32, 00034);

        Product[] cesta = {producto1, producto2, producto3, producto4, producto5};

        double result = ProductStats.calculateTotalPrice(cesta);
        System.out.println("El precio total de su compra es: " + result);

        double mediaPrices = ProductStats.calculateMediaPrices(cesta);
        System.out.println("La media de precios es: " + mediaPrices);

        double maxProductPrice = ProductStats.calculaMaxPrice(cesta);
        System.out.println("El precio máximo es: " + maxProductPrice);

        double minProductPrice = ProductStats.calculateMinPrice(cesta);
        System.out.println("El precio minimo es: " + minProductPrice);
    }
}

