import java.util.ArrayList;

public class MissionToMarsSystem {
    private ArrayList<Mission> listOfMissions;
    private ArrayList<Candidate> listOfCandidates;
    private ArrayList<Criteria> listOfCriteria;

    public MissionToMarsSystem(ArrayList<Mission> listOfMissions, ArrayList<Candidate> listOfCandidates, ArrayList<Criteria> listOfCriteria) {
        this.listOfMissions = listOfMissions;
        this.listOfCandidates = listOfCandidates;
        this.listOfCriteria = listOfCriteria;
    }

    public ArrayList<Candidate> getListOfCandidates() {
        return listOfCandidates;
    }

    public ArrayList<Criteria> getListOfCriteria() {
        return listOfCriteria;
    }

    public ArrayList<Mission> getListOfMissions() {
        return listOfMissions;
    }

    public void setListOfCandidates(ArrayList<Candidate> listOfCandidates) {
        this.listOfCandidates = listOfCandidates;
    }

    public void setListOfCriteria(ArrayList<Criteria> listOfCriteria) {
        this.listOfCriteria = listOfCriteria;
    }

    public void setListOfMissions(ArrayList<Mission> listOfMissions) {
        this.listOfMissions = listOfMissions;
    }

    /*public Mission createMission() {

    }

    /*public Mission editMission() {

    }

    public Criteria createCriteria() {

    }

    public int findCandidates(ArrayList<Integer> arrayList) {

    }

    public Candidate createCandidateProfile() {

    }

    public Criteria manageCriteria(String string) {

    }

    public Job editJob() {

    }

    public int findShuttle(ArrayList<Integer> arrayList) {

    }*/





}
