public class Claim {
    private long claimId;
    private String reason;
    private String claimDate;
    private int claimValidateStatus;
    private int claimapprovalStatus;

    public Claim(long id , String description , String date , int validatestatus,int approvalstatus)
    {
        this.claimapprovalStatus=approvalstatus;
        this.reason=description;
        this.claimDate=date;
        this.claimValidateStatus=validatestatus;
        this.claimId=id;
    }

    public void setClaimapprovalStatus(int claimapprovalStatus) {
        this.claimapprovalStatus = claimapprovalStatus;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public void setClaimId(long claimId) {
        this.claimId = claimId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setClaimValidateStatus(int claimValidateStatus) {
        this.claimValidateStatus = claimValidateStatus;
    }

    public int getClaimapprovalStatus() {
        return claimapprovalStatus;
    }

    public int getClaimValidateStatus() {
        return claimValidateStatus;
    }

    public long getClaimId() {
        return claimId;
    }

    public String getReason() {
        return reason;
    }

    public String getClaimDate() {
        return claimDate;
    }
}
