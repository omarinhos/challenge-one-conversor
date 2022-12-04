package com.omarinhos.challenge.one.conversor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ChallengeOneConversor {

    static String[] menu = {"Conversor de moneda"};
    static String[] options = {
        "De Soles a Dólar",
        "De Soles a Euro",
        "De Soles a Libras",
        "De Soles a Yen",
        "De Soles a Won Coreano",
        "De Dólar a Soles",
        "De Euro a Soles",
        "De Libras a Soles",
        "De Yen a Soles",
        "De Won Coreano a Soles"
    };

    static final double SOL_DOLAR = 0.26;
    static final double SOL_EURO = 0.25;
    static final double SOL_LIBRA = 0.21;
    static final double SOL_YEN = 35.16;
    static final double SOL_WON = 340.28;
    static final double DOLAR_SOL = 3.82;
    static final double EURO_SOL = 4.03;
    static final double LIBRA_SOL = 4.66;
    static final double YEN_SOL = 0.028;
    static final double WON_SOL = 0.0029;

    public static void main(String[] args) {

        while (true) {
            menu();

            double dinero = input();

            conversor(dinero);
            
            int op = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea continuar?", 
                    "Selecciona una opción",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null);
            
            if (op != 0) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }
        }

    }

    static String menu() {
        return (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                null,
                menu,
                menu[0]);
    }

    static double input() {
        int dinero = 0;

        do {
            try {
                dinero = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dinero que deseas convertir",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE));
                break;
            } catch (NumberFormatException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "SOLO VALORES NUMÉRICOS");
            }
        } while (true);

        return dinero;
    }

    static String optionsConversor() {
        return (String) JOptionPane.showInputDialog(
                null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas",
                JOptionPane.DEFAULT_OPTION,
                null,
                options,
                options[0]);
    }

    static void conversor(double dinero) {
        double cambio = 0;
        switch (optionsConversor()) {
            case "De Soles a Dólar":
                cambio = dinero * SOL_DOLAR;
                JOptionPane.showMessageDialog(null, "Tienes $" + cambio);
                break;
            case "De Soles a Euro":
                cambio = dinero * SOL_EURO;
                JOptionPane.showMessageDialog(null, "Tienes " + cambio + " €.");
                break;
            case "De Soles a Libras":
                cambio = dinero * SOL_LIBRA;
                JOptionPane.showMessageDialog(null, "Tienes " + cambio + " £.");
                break;
            case "De Soles a Yen":
                cambio = dinero * SOL_YEN;
                JOptionPane.showMessageDialog(null, "Tienes " + cambio + " ¥.");
                break;
            case "De Soles a Won Coreano":
                cambio = dinero * SOL_WON;
                JOptionPane.showMessageDialog(null, "Tienes ₩" + cambio);
                break;
            case "De Dólar a Soles":
                cambio = dinero * DOLAR_SOL;
                JOptionPane.showMessageDialog(null, "Tienes S/ " + cambio);
                break;
            case "De Euro a Soles":
                cambio = dinero * EURO_SOL;
                JOptionPane.showMessageDialog(null, "Tienes S/ " + cambio);
                break;
            case "De Libras a Soles":
                cambio = dinero * LIBRA_SOL;
                JOptionPane.showMessageDialog(null, "Tienes S/ " + cambio);
                break;
            case "De Yen a Soles":
                cambio = dinero * YEN_SOL;
                JOptionPane.showMessageDialog(null, "Tienes S/ " + cambio);
                break;
            case "De Won Coreano a Soles":
                cambio = dinero * WON_SOL;
                JOptionPane.showMessageDialog(null, "Tienes S/ " + cambio);
                break;
            default:
                System.out.println("Debe seleccinar una opcion");
        }
    }
}
