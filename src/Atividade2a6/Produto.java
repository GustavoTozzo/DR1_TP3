package Atividade2a6;

public class Produto {
    String nome; // nome do produto (cadastros)
    double preco; // valor do produto
    int quantidade; // quantidade do produto

    // o construtor permite que os atributos sejam inicializados diretamente no momento da criação do objeto, sem precisar de chamadas separadas para os setters.
    // torna o código mais limpo e eficiente, já que reduz a necessidade de múltiplas chamadas a métodos set.
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidadeEmEstoque;
    }

    // alteração de preço
    public void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("O preço deve ser maior que zero.");
        }
    }

    // alteraçã ode estoque
    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade = novaQuantidade;
        } else {
            System.out.println("A quantidade não pode ser negativa.");
        }
    }

    // métodos getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidade;
    }

    // métodos setter
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("O preço deve ser maior que zero.");
        }
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade = novaQuantidade;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }

    // exibir informações
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

}

