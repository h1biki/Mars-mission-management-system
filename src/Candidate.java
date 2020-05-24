import java.util.Date;

public class Candidate {
    private int identificationNumber;
    private String candidateName;
    private Date candidateDob;
    private String candidateAddress;
    private String candidateNationality;
    private String candidateGender;
    private String candidateAllergy;
    private String candidateFoodpre;
    private String candidateQualification;
    private String candidateWorkExperience;
    private String candidateOccupation;
    private String candidateComputerSkill;
    private String candidateLanguage;
    private String healthRecord;
    private String criminalRecord;

    public Candidate(int identificationNumber, String candidateName, Date candidateDob, String candidateAddress, String candidateNationality, String candidateGender, String candidateAllergy, String candidateFoodpre, String candidateQualification, String candidateWorkExperience, String candidateOccupation, String candidateComputerSkill, String candidateLanguage, String healthRecord, String criminalRecord) {
        this.identificationNumber = identificationNumber;
        this.candidateName = candidateName;
        this.candidateDob = candidateDob;
        this.candidateAddress = candidateAddress;
        this.candidateNationality = candidateNationality;
        this.candidateGender = candidateGender;
        this.candidateAllergy = candidateAllergy;
        this.candidateFoodpre = candidateFoodpre;
        this.candidateQualification = candidateQualification;
        this.candidateWorkExperience = candidateWorkExperience;
        this.candidateOccupation = candidateOccupation;
        this.candidateComputerSkill = candidateComputerSkill;
        this.candidateLanguage = candidateLanguage;
        this.healthRecord = healthRecord;
        this.criminalRecord = criminalRecord;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Date getCandidateDob() {
        return candidateDob;
    }

    public void setCandidateDob(Date candidateDob) {
        this.candidateDob = candidateDob;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public String getCandidateNationality() {
        return candidateNationality;
    }

    public void setCandidateNationality(String candidateNationality) {
        this.candidateNationality = candidateNationality;
    }

    public String getCandidateGender() {
        return candidateGender;
    }

    public void setCandidateGender(String candidateGender) {
        this.candidateGender = candidateGender;
    }

    public String getCandidateAllergy() {
        return candidateAllergy;
    }

    public void setCandidateAllergy(String candidateAllergy) {
        this.candidateAllergy = candidateAllergy;
    }

    public String getCandidateFoodpre() {
        return candidateFoodpre;
    }

    public void setCandidateFoodpre(String candidateFoodpre) {
        this.candidateFoodpre = candidateFoodpre;
    }

    public String getCandidateQualification() {
        return candidateQualification;
    }

    public void setCandidateQualification(String candidateQualification) {
        this.candidateQualification = candidateQualification;
    }

    public String getCandidateWorkExperience() {
        return candidateWorkExperience;
    }

    public void setCandidateWorkExperience(String candidateWorkExperience) {
        this.candidateWorkExperience = candidateWorkExperience;
    }

    public String getCandidateOccupation() {
        return candidateOccupation;
    }

    public void setCandidateOccupation(String candidateOccupation) {
        this.candidateOccupation = candidateOccupation;
    }

    public String getCandidateComputerSkill() {
        return candidateComputerSkill;
    }

    public void setCandidateComputerSkill(String candidateComputerSkill) {
        this.candidateComputerSkill = candidateComputerSkill;
    }

    public String getCandidateLanguage() {
        return candidateLanguage;
    }

    public void setCandidateLanguage(String candidateLanguage) {
        this.candidateLanguage = candidateLanguage;
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
}
