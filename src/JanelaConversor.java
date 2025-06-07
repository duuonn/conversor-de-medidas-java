import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaConversor {

    public static void main(String[] args) {

        JFrame minhaJanela = new JFrame("Conversor de Medidas");
        minhaJanela.setSize(450, 200);
        minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // O gerenciador de abas principal
        JTabbedPane abas = new JTabbedPane();

        // ---- Painel da Aba 1: Distância ----
        JPanel painelDistancia = new JPanel(new FlowLayout());
        
        JLabel textoDistanciaLabel = new JLabel("Digite o valor em metros:");
        JTextField campoDistancia = new JTextField(10);
        JButton botaoConverterDistancia = new JButton("Converter");
        JLabel resultadoDistanciaLabel = new JLabel("Resultado aparecerá aqui.");

        painelDistancia.add(textoDistanciaLabel);
        painelDistancia.add(campoDistancia);
        painelDistancia.add(botaoConverterDistancia);
        painelDistancia.add(resultadoDistanciaLabel);

        botaoConverterDistancia.addActionListener(e -> {
            String textoMetros = campoDistancia.getText();
            double metros = Double.parseDouble(textoMetros);
            double kilometros = metros / 1000;
            resultadoDistanciaLabel.setText(metros + "m equivale a " + kilometros + "km.");
        });
        
        abas.addTab("Distância", painelDistancia);

        // ---- Painel da Aba 2: Temperatura ----
        JPanel painelTemperatura = new JPanel(new FlowLayout());

        JLabel textoTemperaturaLabel = new JLabel("Digite a temp. em Celsius:");
        JTextField campoTemperatura = new JTextField(10);
        JButton botaoConverterTemperatura = new JButton("Converter");
        JLabel resultadoTemperaturaLabel = new JLabel("Resultado aparecerá aqui.");

        painelTemperatura.add(textoTemperaturaLabel);
        painelTemperatura.add(campoTemperatura);
        painelTemperatura.add(botaoConverterTemperatura);
        painelTemperatura.add(resultadoTemperaturaLabel);

        botaoConverterTemperatura.addActionListener(e -> {
            String textoCelsius = campoTemperatura.getText();
            double celsius = Double.parseDouble(textoCelsius);
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            resultadoTemperaturaLabel.setText(celsius + "°C equivale a " + fahrenheit + "°F.");
        });

        abas.addTab("Temperatura", painelTemperatura);

        // ---- Painel da Aba 3: Peso ----
        JPanel painelPeso = new JPanel(new FlowLayout());

        JLabel textoPesoLabel = new JLabel("Digite o peso em quilos (kg):");
        JTextField campoPeso = new JTextField(10);
        JButton botaoConverterPeso = new JButton("Converter");
        JLabel resultadoPesoLabel = new JLabel("Resultado aparecerá aqui.");

        painelPeso.add(textoPesoLabel);
        painelPeso.add(campoPeso);
        painelPeso.add(botaoConverterPeso);
        painelPeso.add(resultadoPesoLabel);

        botaoConverterPeso.addActionListener(e -> {
            String textoQuilos = campoPeso.getText();
            double quilos = Double.parseDouble(textoQuilos);
            double libras = quilos * 2.20462;
            resultadoPesoLabel.setText(quilos + "kg equivale a " + libras + "lbs.");
        });

        abas.addTab("Peso", painelPeso);

        // Adicionamos o gerenciador de abas à janela principal
        minhaJanela.add(abas);

        // Deixamos a janela visível
        minhaJanela.setVisible(true);
    }
}