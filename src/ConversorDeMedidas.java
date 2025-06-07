import java.util.Scanner;

public class ConversorDeMedidas {

    /**
     * Método principal que gerencia a execução do programa.
     */
    public static void main(String[] args) {
        Scanner leitorDeEntrada = new Scanner(System.in);

        System.out.println("--- Bem-vindo ao Conversor de Medidas ---");
        System.out.println("");

        converterDistancia(leitorDeEntrada);
        System.out.println("------------------------------------");

        converterTemperatura(leitorDeEntrada);
        System.out.println("------------------------------------");

        converterPeso(leitorDeEntrada);

        System.out.println("");
        System.out.println("--- Conversões finalizadas! ---");

        leitorDeEntrada.close();
    }

    /**
     * Pede um valor em metros e converte para quilômetros.
     */
    public static void converterDistancia(Scanner leitor) {
        System.out.println(">> Conversão de Distância");
        System.out.print("   Digite a distância em metros: ");
        double metros = leitor.nextDouble();
        double kilometros = metros / 1000;
        System.out.println("   Resultado: " + metros + "m é igual a " + kilometros + "km.");
    }

    /**
     * Pede um valor em Graus Celsius e converte para Fahrenheit.
     */
    public static void converterTemperatura(Scanner leitor) {
        System.out.println(">> Conversão de Temperatura");
        System.out.print("   Digite a temperatura em Graus Celsius: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("   Resultado: " + celsius + "°C é igual a " + fahrenheit + "°F.");
    }

    /**
     * Pede um valor em quilos e converte para libras.
     */
    public static void converterPeso(Scanner leitor) {
        System.out.println(">> Conversão de Peso");
        System.out.print("   Digite o peso em quilos (kg): ");
        double quilos = leitor.nextDouble();
        double libras = quilos * 2.20462;
        System.out.println("   Resultado: " + quilos + "kg é igual a " + libras + "lbs.");
    }
}