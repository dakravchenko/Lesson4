package com.daniil;

public class FLight {
    String cityOfDeparture;
    String cityOfArrival;
    int distance; // in km
    int price; // in rub
    final int Internal_Fee = 1500;
    final int External_Fee = 3500;

    void showPlaces(){
        System.out.println("The flight " + cityOfDeparture + " - " + cityOfArrival);
    }
    int calculatePriceOfInternalFlight(){
        price = distance * 3 + Internal_Fee;
        System.out.println("The price is " + price + " RUB");
        return price;
    }

    int calculatePriceOfExternalFlight(){
        price = distance * 3 + External_Fee;
        System.out.println("The price is " + price + " RUB");
        return price;
    }
    public static void main(String[] args) {
        com.daniil.FLight U23 = new FLight();
        U23.cityOfDeparture = "Moscow";
        U23.cityOfArrival = "Kyiv";
        U23.distance = 1500;
        U23.showPlaces();
        U23.calculatePriceOfExternalFlight();
    }
}
