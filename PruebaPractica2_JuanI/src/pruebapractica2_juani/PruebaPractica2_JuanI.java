/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica2_juani;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PruebaPractica2_JuanI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pd = new Scanner(System.in);
        int menu = 0;
        boolean bandera = true;
        ArrayList<String> Figuras = new ArrayList();
        Figura F = new Figura();
        F.Cuadrado = "cuadrado";
        F.Rectangulo = "rectangulo";
        F.Triangulo = "triangulo";
        while (bandera) {//cuerpo del menu central
            System.out.println("Bienvenido, sus opciones son las siguientes:");
            System.out.println();
            System.out.println("1. Definir una figura");
            System.out.println("2. Imprimir total de figuras");
            System.out.println();
            System.out.println("Marque el numero que esta enfrente de la opcion para acceder a ella: ");
            menu = pd.nextInt();
            switch (menu) {

                case 1:
                    boolean bandi = true;
                    while (bandi) {
                        System.out.println("Que figura desea imprimir: ");
                        pd.nextLine();
                        String x = pd.nextLine();// escriba sin asentos y en minuscula
                        if (x.contentEquals(F.Cuadrado)) {// seteo de la figura cuadrada
                            F.setValto();
                            F.setVancho();
                            F.setVlargo();
                            double WC = F.areaF(F.largo, F.ancho);
                            double VC = F.volumenFCR(F.largo, F.ancho, F.alto);
                            String ALTOC = F.alto + "", ANCHOC = F.ancho + "", LARGOC = F.largo + "", TWC = WC + "", TVC = VC + "";
                            String TextoC = "[" + "Figura: " + F.Cuadrado + " Alto: " + ALTOC + " largo: " + LARGOC + " ancho: " + ANCHOC + " volumen: " + TVC + " area: " + TWC + "]";
                            Figuras.add(TextoC);
                        } else if (x.contentEquals(F.Rectangulo)) {// seteo de la figura rectangular
                            F.setValto();
                            F.setVancho();
                            F.setVlargo();
                            double WR = F.areaF(F.largo, F.ancho);
                            double VR = F.volumenFCR(F.largo, F.ancho, F.alto);
                            String ALTOR = F.alto + "", ANCHOR = F.ancho + "", LARGOR = F.largo + "", TWR = WR + "", TVR = VR + "";
                            String TextoR = "[" + "Figura: " + F.Rectangulo + " Alto: " + ALTOR + " largo: " + LARGOR + " ancho: " + ANCHOR + " volumen: " + TVR + " area: " + TWR + "]";
                            Figuras.add(TextoR);
                        } else if (x.contentEquals(F.Triangulo)) {// seteo de la figura triangular
                            F.setValto();
                            F.setVancho();
                            F.setVlargo();
                            double WT = F.areaFT(F.alto, F.ancho);
                            double VT = F.volumenFT(WT, F.alto);
                            String ALTOT = F.alto + "", ANCHOT = F.ancho + "", LARGOT = F.largo + "", TWT = WT + "", TVT = VT + "";
                            String TextoT = "[" + "Figura: " + F.Triangulo + " Alto: " + ALTOT + " largo: " + LARGOT + " ancho: " + ANCHOT + " volumen: " + TVT + " area: " + TWT + "]";
                            Figuras.add(TextoT);
                        } else {
                            System.out.println("Figura invalida, por favor marque otra");
                        }
                        System.out.println("Desea ingresar otra figura? marque 1 para si 2 para no: ");//desicion para la impresion de mas figuras
                        int des = pd.nextInt();
                        if (des == 1) {
                            bandi = true;
                        } else if (des == 2) {
                            bandi = false;
                        } else {
                            System.out.println("Numero invalido, marque otro");
                            des = pd.nextInt();
                        }
                    }
                    bandera = true;
                    break;
                case 2:
                    System.out.println(Figuras);//impresion de figuras
                    bandera = false;
                    break;
                default:
                    System.out.println("numero invalido por favor ingrese otro");
                    bandera = true;
                    break;

            }
        }

    }

}
