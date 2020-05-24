public class Criteria {
    private int criteriaId;
    private int ageMax;
    private int ageMin;
    private int workExperienceYear;
    private String occupation;
    private String healthRecord;
    private String criminalRecord;
    private String computerSkill;
    private String language;

    public Criteria(int criteriaId, int ageMax, int ageMin, int workExperienceYear, String occupation, String healthRecord, String criminalRecord, String computerSkill, String language) {
        this.criteriaId = criteriaId;
        this.ageMax = ageMax;
        this.ageMin = ageMin;
        this.workExperienceYear = workExperienceYear;
        this.occupation = occupation;
        this.healthRecord = healthRecord;
        this.criminalRecord = criminalRecord;
        this.computerSkill = computerSkill;
        this.language = language;
    }

    public int getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(int criteriaId) {
        this.criteriaId = criteriaId;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getWorkExperienceYear() {
        return workExperienceYear;
    }

    public void setWorkExperienceYear(int workExperienceYear) {
        this.workExperienceYear = workExperienceYear;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }

    public String getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(String criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getComputerSkill() {
        return computerSkill;
    }

    public void setComputerSkill(String computerSkill) {
        this.computerSkill = computerSkill;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
