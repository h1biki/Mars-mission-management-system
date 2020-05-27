public class MissionCoordinator extends Person {
    private int coordinatorId;
    private String coordinatorName;
    private String coordinatorContactInformation;

    public MissionCoordinator(String userName, String userPassword,String userPermission, String contactInformation, int identificationNumber, int coordinatorId, String coordinatorName, String coordinatorContactInformation) {
        super(userName, userPassword, userPermission, contactInformation);
        this.coordinatorId = coordinatorId;
        this.coordinatorName = coordinatorName;
        this.coordinatorContactInformation = coordinatorContactInformation;
    }

    public int getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(int coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }

    public String getCoordinatorContactInformation() {
        return coordinatorContactInformation;
    }

    public void setCoordinatorContactInformation(String coordinatorContactInformation) {
        this.coordinatorContactInformation = coordinatorContactInformation;
    }
}
