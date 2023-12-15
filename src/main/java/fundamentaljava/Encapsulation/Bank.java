package fundamentaljava.Encapsulation;
public class Bank 
{
    public String name;
    private String acc_name;
    private long acc_no;
    private String acc_place;
    private double acc_balance;
    private long acc_mobileno;
    public String getAcc_name() {
        return acc_name;
    }
    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getAcc_place() {
        return acc_place;
    }
    public void setAcc_place(String acc_place) {
        this.acc_place = acc_place;
    }
    public double getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }
    public long getAcc_mobileno() {
        return acc_mobileno;
    }
    public void setAcc_mobileno(long acc_mobileno) {
        this.acc_mobileno = acc_mobileno;
    }
}