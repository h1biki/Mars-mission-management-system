public class Job {
    private int jobId;
    private String jobName;
    private String jobDescription;
    private int jobEmploymentNumber;
    private String jobRequirement;

    public Job(){

    }

    public Job(int jobId, String jobName, String jobDescription, int jobEmploymentNumber, String jobRequirement) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.jobEmploymentNumber = jobEmploymentNumber;
        this.jobRequirement = jobRequirement;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getJobEmploymentNumber() {
        return jobEmploymentNumber;
    }

    public void setJobEmploymentNumber(int jobEmploymentNumber) {
        this.jobEmploymentNumber = jobEmploymentNumber;
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }
}
