public class BankTransactionRecord {
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;
    public static int numberOfTransaction = 0;

    public BankTransactionRecord(){

    }

    public BankTransactionRecord(int inputTransactionNumber, boolean inputCanadianFunds, double inputExchangeRate, long inputTransactionReferenceNumber){
        this.transactionNumber = inputTransactionNumber;
        this.canadianFunds = inputCanadianFunds;
        this.exchangeRate = inputExchangeRate;
        this.transactionReferenceNumber = inputTransactionReferenceNumber;
        numberOfTransaction++;
    }

    public void setTransactionNumber(int inputTransactionNumber){
        transactionNumber = inputTransactionNumber;
    }

    public int getTransactionNumber(){
        return transactionNumber;
    }

    public void setCanadianFunds(boolean inputCanadianFunds){
        canadianFunds = inputCanadianFunds;
    }

    public boolean getCanadianFunds(){
        return canadianFunds;
    }

    public void setExchangeRate(double inputExchangeRate){
        exchangeRate = inputExchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setTransactionReferenceNumber(long inputTransactionReferenceNumber){
        transactionReferenceNumber = inputTransactionReferenceNumber;
    }

    public long getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }
}
