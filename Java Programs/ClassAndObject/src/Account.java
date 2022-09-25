public class Account {
    private double accNo;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNo;

    public double getAccNo() {
        return accNo;
    }

    public void setAccNo(double accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDepositFunds(double fund){
        balance = balance + fund;
    }

    public double getDepositFunds(){
        return balance;
    }





}
