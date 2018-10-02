public class InsuranceCheck {

    public static void main(String[] args){

        Customer newCustomer = new Customer("chaos",125678,34);
        Claim newclaim =newCustomer.file_claim(12,"due to electric short circuit","18-09-2018",0,0);
        Surveyor newSurveyor = new Surveyor("tasest",124356,42);
        Manager newManager = new Manager("qwart",126789,48);
        newclaim = newSurveyor.approveValidity(newclaim);
        if(newclaim.getClaimValidateStatus()==1){
            newclaim=newManager.approveClaim(newclaim);
        }

        if(newclaim.getClaimapprovalStatus()==1)
        {
            System.out.println("your claim has been approved");
        }
        else
        {
            System.out.println("your claim rejected");
        }

    }
}
