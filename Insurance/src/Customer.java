public class Customer {
    private String name;
    private long Id;
    private int age;
    Claim newClaim; // claim object for customer.

    //set the details of claim of the customer;
    //call the surveyor class method to check the validity
    //if accepted by surveyor call the manager class to go for approval of claim.
    public Customer(String name, long ID, int age) {
        this.name = name;
        this.Id = ID;
        this.age = age;
    }

    //initially the approval status would be kept 0 and changed at later stages.
    public Claim file_claim(long id, String des, String date, int valStatus, int appStatus) {
        newClaim = new Claim(id, des, date, valStatus, appStatus);
        return newClaim;
    }

}


