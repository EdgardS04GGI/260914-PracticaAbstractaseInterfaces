import com.uees.sv.semana10.CardPayment;

void main() {
    //CardPayment pagoTarjeta=new CardPayment(""+System.currentTimeMillis());

    //pagoTarjeta.pagar();

    Payment cashPayment = new CashPayment(""+System.currentTimeMillis());

    cashPayment.pagar();

}
