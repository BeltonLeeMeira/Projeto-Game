package br.com.fiap2espa;

public class MediaAritmetica {

    public static double mediaAritmetica(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double x = 7;
        double y = 8.5;
        double z = 10;
        double media = mediaAritmetica(x, y, z);
        System.out.println("Média de " + x + ", " + y + " e " + z + " = " + media);
    }
}
