package Atividade1;

public class Supermercado {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 5.99, 20);

        arroz.exibirInformacoes();

        arroz.atualizarEstoque(15);

        System.out.println("\nApós atualização do estoque:");
        arroz.exibirInformacoes();
    }
}
