import java.util.ArrayList;

public class Mission {
    private int missionId;
    private String missionName;
    private String missionDescription;
    private String countryOfOrigin;
    private String countryAllowed;
    private String launchDate;
    private String destinationLocation;
    private int missionDuration;
    private String missionStatus;
    private ArrayList<Job> listOfJob;
    private String employmentRequirement;
    private String cargoRequirement;

    public Mission(int missionId, String missionName, String missionDescription, String countryOfOrigin, String countryAllowed, String launchDate, String destinationLocation, int missionDuration, String missionStatus, ArrayList<Job> listOfJob, String employmentRequirement, String cargoRequirement) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionDescription = missionDescription;
        this.countryOfOrigin = countryOfOrigin;
        this.countryAllowed = countryAllowed;
        this.launchDate = launchDate;
        this.destinationLocation = destinationLocation;
        this.missionDuration = missionDuration;
        this.missionStatus = missionStatus;
        this.listOfJob = listOfJob;
        this.employmentRequirement = employmentRequirement;
        this.cargoRequirement = cargoRequirement;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionDescription() {
        return missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryAllowed() {
        return countryAllowed;
    }

    public void setCountryAllowed(String countryAllowed) {
        this.countryAllowed = countryAllowed;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public int getMissionDuration() {
        return missionDuration;
    }

    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    public ArrayList<Job> getListOfJob() {
        return listOfJob;
    }

    public void setListOfJob(ArrayList<Job> listOfJob) {
        this.listOfJob = listOfJob;
    }

    public String getEmploymentRequirement() {
        return employmentRequirement;
    }

    public void setEmploymentRequirement(String employmentRequirement) {
        this.employmentRequirement = employmentRequirement;
    }

    public String getCargoRequirement() {
        return cargoRequirement;
    }

    public void setCargoRequirement(String cargoRequirement) {
        this.cargoRequirement = cargoRequirement;
    }



}
