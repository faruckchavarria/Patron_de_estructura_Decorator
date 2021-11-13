package org.faruck;

public class CuentaGeneral implements Cuenta {
    private double saldo;
    private Cliente cliente;
    private Fecha fecApertura;

    public CuentaGeneral(double saldoini, Cliente cliente) {
        this.saldo = saldoini;
        this.cliente = cliente;
        this.fecApertura = new Fecha();
    }

    @Override
    public double saldo() {
        // TODO Auto-generated method stub
        return saldo;
    }

    @Override
    public void ingresar(double cantidad) {

    }

    @Override
    public void retirar(double cantidad) {

    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public Fecha getFecApe() {
        return fecApertura;
    }

    @Override
    public void aplicaIntereses() {

    }

}

