public class Main {
    public static void main(String[] args) {
        Account One = new Account();
        One.setAccNo(1987654);
        System.out.println("Account Number is " + One.getAccNo());

        One.setBalance(50000);
        System.out.println("Account Balance is " + One.getBalance());

        One.setCustomerName("Varada");
        System.out.println("Account Holder is " + One.getCustomerName());

        One.setDepositFunds(10000);
        System.out.println("Balance after depositing amount is " + One.getDepositFunds());

    }

}