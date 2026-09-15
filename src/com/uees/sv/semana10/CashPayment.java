package com.uees.sv.semana10;

public class CashPayment extends Payment implements Authenticable, Refundable, Auditable{


    public CashPayment(String transaccion) {
        super (transaccion);

    }

    @Override
    public void registrarTransaccion(String transaccion) {
        System.out.println("Transacción en efectivo registrada: "+transaccion);
    }

    @Override
    void aplicarPago(String pago) {
        System.out.println("Iniciando pago en efectivo: "+pago);
        registrarTransaccion(pago);
    }
}
