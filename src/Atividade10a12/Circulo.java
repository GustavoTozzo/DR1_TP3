package Atividade10a12;

public class Circulo {
    private double raio; // raio é a metade do tamanho de um circulo (do ponto A ao ponto B que fica centralizado no circulo)

    public Circulo(double raio) {
        this.raio = raio;
    }

    // calculo da área do circulo
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
