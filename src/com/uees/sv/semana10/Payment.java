package com.uees.sv.semana10;

public abstract class Payment {
    private String transaccion;

    public Payment(String transaccion) {
        this.transaccion = transaccion;
    }

    public void pagar(){
        System.out.println("Pagando transacción:" +transaccion);
        aplicarPago(transaccion);
    }

    abstract void aplicarPago(String pago);
}
