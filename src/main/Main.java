package main;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory = CarFactory.getInstance();
        carFactory.buildCar("Sedan");
        carFactory.buildCar("Sedan");
        carFactory.buildCar("SUV");
        carFactory.buildCar("SUV");
        carFactory.buildCar("SUV");
        carFactory.buildCar("esportivo");
        carFactory.buildCar("esportivo");

        carFactory.gerarRelatorio();
    }
}
