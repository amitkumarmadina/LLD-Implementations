package L12_Car_Rental_System;

import java.util.Date;

public class PaymentDetails {
    double amountPaid;
    PaymentMode paymentMode;
    Date paymentDate;
    boolean paymentSuccessful;

    PaymentDetails(double amountPaid, PaymentMode paymentMode, boolean paymentSuccessful){
        this.amountPaid = amountPaid;
        this.paymentMode = paymentMode;
        this.paymentDate = new Date();
        this.paymentSuccessful = paymentSuccessful;
    }
}
