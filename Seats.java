package Project2021;

public class Seats {

    private String row = "0";
    private int column = 0;
    private boolean booked = false;


    public Seats() {
    }

    public Seats(String row, int column, boolean booked) {

            this.row=row;
            this.column = column;
            this.booked = booked;

    }



    public String getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getLabel() {
        return row + String.valueOf(column);
    }

    public boolean getBookingStatus() {
        return booked;
    }

    public void setBookingStatus(boolean booked) {
        this.booked = booked;
    }

}