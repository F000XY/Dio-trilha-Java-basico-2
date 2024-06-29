package Conta;
//Interface, assinatura dos metodos
//não precisa public
//Classe abstrata
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
