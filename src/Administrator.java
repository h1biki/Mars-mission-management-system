public class Administrator extends Person {
    private int adminId;
    private String adminName;

    public Administrator (String userName, String userPassword,String userPermission, String contactInformation, int adminId, String adminName) {
        super(userName, userPassword, userPermission, contactInformation);
        this.adminId = adminId;
        this.adminName = adminName;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}
