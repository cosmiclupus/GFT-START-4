package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício retornos");
        double areaQuadrado = Quadrilatero.area(3);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Àrea do quadrado:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 4);
        System.out.println("Àrea do trapézio:" + areaTrapezio);
    }

}


