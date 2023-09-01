package br.newtonpaiva;

public class HomeScreen {

    public static void main(String[] args) {
        var c01 = new Conta(); //var é uma variável tipo string, pois reconhece o codigo da frente, que é uma string.
        c01.setNumero(999);
        c01.depositar(100.90);

        var saldo = c01.sacar(10.90);
        System.out.println("O saldo é de: " + saldo);

        saldo = c01.depositar(50.00);
        System.out.println("O saldo é de: " + saldo);

    }
}
