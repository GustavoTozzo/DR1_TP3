package Atividade10a12;

public class TesteFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        double areaCirculo = circulo.calcularArea();
        System.out.println("Área do círculo com raio 3.0: " + areaCirculo);

        Esfera esfera = new Esfera(5.0);
        double volumeEsfera = esfera.calcularVolume();
        System.out.println("Volume da esfera com raio 5.0: " + volumeEsfera);
    }
}
