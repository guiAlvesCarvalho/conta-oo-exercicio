package model;

public class Conta {
    private String tipoConta;
    private String tipoCliente;
    private String nomeCliente;
    private String dataAbertura;
    private double taxa;
    private double saldo;

    public String sacar(double valor){
        if (valor < saldo){
            saldo -= valor;
            return "Saque realizado";
        } else {
            return "Saldo insuficiente";
        }
    }

    public String depositar(double valor){
        saldo += valor;
        return "Depósito efetuado, saldo atual: "+ saldo;
    }


    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
