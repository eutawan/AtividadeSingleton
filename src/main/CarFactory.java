package main;

public class CarFactory {
    // atributos para manter o controle da quantidade de carros criados para cada modelo
    // Singleton
    private static CarFactory instance;
    private int sedanQnt = 0;
    private int suvQnt = 0;
    private int esportivoQnt = 0;

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    // Metodo de construcao e verificacao do carro criado
    public  void  buildCar(String model) {
        switch (model) {
            case "Sedan":
                sedanQnt++;
                System.out.println("Carro do modelo sedan criado!");
                break;

            case "SUV":
                suvQnt++;
                System.out.println("Carro do modelo SUV criado!");
                break;

            case "esportivo":
                esportivoQnt++;
                System.out.println("Carro do modelo esportivo criado!");
                break;

            default:
                System.out.println("Carro desconhecido " + model);
                break;

        }
    }
    // Metodo para gerar um relatorio dos carros vendidos e mostrar o carro mais vendido
    public void gerarRelatorio(){
        System.out.println("\nRelatório de carros vendidos:");
        System.out.println("Sedan: " + sedanQnt + " unidades vendidas");
        System.out.println("SUV: " + suvQnt + " unidades vendidas");
        System.out.println("Sedan: " + esportivoQnt + " unidades vendidas");

        if (sedanQnt > suvQnt && sedanQnt > esportivoQnt){
            System.out.println("Carro mais vendido: Sedan, com " + sedanQnt + " vendidos.");
        } 
        else if (suvQnt > sedanQnt && suvQnt > esportivoQnt) {
            System.out.println("Carro mais vendido: SUV, com " + suvQnt + " vendidos.");
        }
        else if (esportivoQnt > sedanQnt && esportivoQnt > suvQnt) {
            System.out.println("Carro mais vendido: Esportivo, com " + esportivoQnt + " vendidos.");
        } else {
            System.out.println("Empate entre os modelos vendidos.");
        }
    }
}

