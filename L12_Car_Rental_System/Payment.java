package L12_Car_Rental_System;

public class Payment {
    public PaymentDetails payBill(Bill bill){
        bill.isBillPaid = true;
        return new PaymentDetails(bill.totalBillAmount, PaymentMode.CARD, true);
    }
}
