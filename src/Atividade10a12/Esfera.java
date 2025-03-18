package Atividade10a12;

public class Esfera {
    private double raio; // raio é a metade do tamanho de um circulo (do ponto A ao ponto B que fica centralizado no circulo)

    public Esfera(double raio) {
        this.raio = raio;
    }

    // calculo da área da esfera
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}


