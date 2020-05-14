import java.util.*;

public class employFast {
    private String name;
    private String passWd;
    private ArrayList<String> usrList;
    private ArrayList<String> usrPwdList;

    public employFast(){
        name = "";
        passWd = "";
        usrList = new ArrayList<String>() ;
        usrPwdList = new ArrayList<String>();
    }

    public void employFast(String name, String passWd, ArrayList<String>usrList, ArrayList<String>usrPwdList){
        this.name = name;
        this.passWd = passWd;
        this.usrList = usrList;
        this.usrPwdList = usrPwdList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public ArrayList<String> getUsrList() {
        return usrList;
    }

    public void setUsrList(ArrayList<String> usrList) {
        this.usrList = usrList;
    }

    public ArrayList<String> getUsrPwdList() {
        return usrPwdList;
    }

    public void setUsrPwdList(ArrayList<String> usrPwdList) {
        this.usrPwdList = usrPwdList;
    }

    public void start(){
//123

    }

}
