package org.example;

public class Payment {

    int id;

    public PaymentDetails payBill(Bill bill, PaymentMode mode){

        PaymentDetails paymentDetail = new PaymentDetails();
        bill.setPaid(true);
        paymentDetail.setPaymentId(this.id);
        paymentDetail.setAmountPaid(bill.getTotalAmount());
        paymentDetail.setMode(mode);

        return paymentDetail;
    }
}
