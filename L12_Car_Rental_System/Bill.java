package L12_Car_Rental_System;

public class Bill{
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){
        if(reservation.reservationType == ReservationType.DAILY){
            return reservation.vehicle.getDailyRentalCost();
        }
        return reservation.vehicle.getHourlyRentalCost();
    }
}
