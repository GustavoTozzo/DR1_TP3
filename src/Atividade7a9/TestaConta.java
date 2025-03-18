package Atividade7a9;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Gustavo Tozzo", 12345, "001", 10.0, "17/03/2025");

        System.out.println("== Informações Iniciais da Conta ==");
        minhaConta.exibirDados();

        System.out.println("\n=== Realizando Depósito de R$500 ==");
        minhaConta.deposita(500);

        System.out.println("\n== Realizando Saque de R$300 ===");
        minhaConta.saca(300);

        System.out.println("\n== Calculando Rendimento ==");
        double rendimento = minhaConta.calculaRendimento();
        System.out.println("Rendimento mensal esperado: R$" + rendimento);

        System.out.println("\n=== Informações Finais da Conta ===");
        minhaConta.exibirDados();
    }
}
