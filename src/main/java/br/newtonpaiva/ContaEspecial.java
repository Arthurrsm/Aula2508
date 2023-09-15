package br.newtonpaiva;

public class ContaEspecial extends Conta{
    private Double limite;

    @Override
    public Double sacar(Double valor) {
        if(getSaldo() + limite - valor < 0){
            throw new IllegalAccessException();
        }
        else {
            setSaldo(getSaldo()-limite);
            return getSaldo();
        }
        return super.sacar(valor);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
