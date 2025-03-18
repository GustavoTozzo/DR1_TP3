package Atividade7a9;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // depósito e saque
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean saca(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // calcular rendimento
    public double calculaRendimento() {
        return saldo * 0.1;
    }

    // exibir as informações
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }
}
