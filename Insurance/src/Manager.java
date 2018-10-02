public class Manager {

    private String name;
    private long id;
    private int age;
    Claim newclaim;

    public Manager(String name,long id ,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public Claim approveClaim(Claim temp){
        if(checkDescriptionValidity(temp.getReason()))
        {
            temp.setClaimapprovalStatus(1);
        }
        return temp;
    }

    public boolean checkDescriptionValidity(String string){
        //if the description if valid then this returns true else false;

        return true;
    }

}
