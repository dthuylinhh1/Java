public class RealEstateTransactionTestHarness {
    public static void main(String[] args){
        RealEstateTransaction caseOne = new RealEstateTransaction();
        caseOne.setStreetNumber("226");
        caseOne.setStreetName("Rose");
        caseOne.setCity("Barrie");
        caseOne.setCounty("Simcoe");
        caseOne.setPurchasePrice("twomillion");
        caseOne.oneString();
        caseOne.validNumber();
        caseOne.encryption();
    }
}
