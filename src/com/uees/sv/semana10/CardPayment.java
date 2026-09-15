package com.uees.sv.semana10;

public class CardPayment extends Payment implements Authenticable, Auditable{


    public CardPayment(String transaccion) {
        super (transaccion);

    }

    @Override
    public void registrarTransaccion(String transaccion) {
        System.out.println("Transacción de tarjeta registrada: "+transaccion);
    }

    @Override
    void aplicarPago(String pago) {
        System.out.println("Iniciando pago: "+pago);
        registrarTransaccion(pago);
    }
}
