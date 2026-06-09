import Enums.SeatCategory;

public class Seat {
    int seatId;
    int row;
    SeatCategory seatCategory;

    public int getSeatId(){
        return seatId;
    }

    public void setSeatId(int seatId){
        this.seatId = seatId;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public SeatCategory getSeatCategory(SeatCategory seat){
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seat){
        this.seatCategory = seat;
    }
}
