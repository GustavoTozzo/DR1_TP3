package Atividade2a6;

public class AppProduto {
    public static void main(String[] args) {
        // criando um objeto da classe Produto com valores definidoss
        Produto produto1 = new Produto("Arroz", 25.50, 50);

        System.out.println("Informações iniciais do produto:");
        produto1.exibirInformacoes();

        // atualizando o preço e a quantidade em estoque
        produto1.alterarPreco(27.90);
        produto1.alterarQuantidade(40);

        // usando os métodos set para atualizar valores
        produto1.setPreco(29.90);
        produto1.setQuantidadeEmEstoque(30);
        produto1.setNome("Arroz Premium");

        // exibindo informações após as alterações de preço e quantidade
        System.out.println("\nInformações atualizadas do produto:");
        produto1.exibirInformacoes();
    }

}
