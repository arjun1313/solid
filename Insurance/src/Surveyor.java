public class Surveyor {
    private String name;
    private long id ;
    private int age;

    Claim newClaim ;



    public Surveyor(String name,long id , int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public Claim approveValidity(Claim temp){
        if(checkDescriptionValidity(temp.getReason()))
        {
               temp.setClaimValidateStatus(1);
        }
        return temp;
    }

    public boolean checkDescriptionValidity(String string){
        //if the description if valid then this returns true else false;

        return true;
    }



}
