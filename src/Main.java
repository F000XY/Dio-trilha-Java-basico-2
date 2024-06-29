import Conta.Conta;
import ContaCorrente.ContaCorrente;
import ContaPoupanca.ContaPoupanca;
import java.util.Scanner;
public class Main {
    private String nome;
    public void nome(String nome){
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
    }
    public static void main(String[] args) {
        Main nome = new Main();
        nome.nome("Nathy");
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();

        conta1.depositar(200);
        conta1.sacar(100);
        conta1.transferir(conta2, 50);
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
        System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
    }
}
