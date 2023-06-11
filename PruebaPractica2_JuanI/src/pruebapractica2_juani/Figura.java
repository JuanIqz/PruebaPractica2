/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebapractica2_juani;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Figura {
    
    double largo;
    double ancho;   
    double alto;
    String Cuadrado;
    String Triangulo;
    String Rectangulo;
            
    public void setVlargo(){//seteo del largo
        Scanner pd = new Scanner(System.in);
        System.out.println("Ingrese el largo de la figura: ");
        double largo=pd.nextDouble();
        this.largo=largo;
    }
    
    public void setVancho(){//seteo del ancho
        Scanner pd = new Scanner(System.in);
        System.out.println("Ingrese el ancho de la figura: ");
        double ancho=pd.nextDouble();
        this.ancho=ancho;
    }
    
    public void setValto(){//seteo del ancho
        Scanner pd = new Scanner(System.in);
        System.out.println("Ingrese el alto de la figura: ");
        double alto=pd.nextDouble();
        this.alto=alto;
    }
    
    public double areaF(double largo, double ancho ){//inicio calculos
        double areaF=largo*ancho;
        return  areaF;
    }
    
    public double areaFT(double alto, double ancho ){
        double areaFT=(alto*ancho)/2;
        return areaFT;
    }
    
    public double volumenFCR(double largo, double ancho, double alto ){
        double volumenFTR=largo*ancho*alto;
        return  volumenFTR;
    }
    
    public double volumenFT(double base, double alto){//fin calculos
        double volumenFTR=(base*alto);
        return  volumenFTR;
    }
    
    
}
