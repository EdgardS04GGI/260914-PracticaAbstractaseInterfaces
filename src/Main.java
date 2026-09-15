import com.uees.sv.semana10.CardPayment;

void main() {
    CardPayment pagoTarjeta=new CardPayment(""+System.currentTimeMillis());

    pagoTarjeta.pagar();
}
