import com.sun.java.accessibility.util.EventID;

import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.text.ParseException;

//test
public class UserInterface {
    private Input input = new Input();
    private Mission mission = new Mission();
    private Job job = new Job();
    private Criteria criteria = new Criteria();
    private String coordinatorId = "";

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        ui.readMissionExcel();
        //ui.writeToFile();
       // ui.readMissionExcel();
        ui.start();

    }

    public UserInterface() {
    }

    public void start() {
        Input input = new Input();
        String option = "";//select option from the main menu
        String role = "";

        do {//main loop
            System.out.println("");
            System.out.println("============================================");
            System.out.println("*   Welcome To The Mission to Mars System  *");
            System.out.println("*                                          *");
            System.out.println("* Please select from the following options *");
            System.out.println("*            Press 1 to Login              *");
            System.out.println("*            Press 2 to exit               *");
            System.out.println("============================================");
            System.out.println("");
            option = input.acceptStringInput("Please Choose Your Option: ");

            switch (option) {
                case "1":
                    role = loginPart();
                    break;
                case "2":
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }

            String action = "";
            do {
                if (role.equals("MissionCoordinator")) {
                    action = displayMissionCoordinatorMenu();
                    if (action.equals("1")) {
                        createMission();
                    } else if(action.equals("2")){
                        editMission();
                    }
                } else if (role.equals("Administrator")) {
                    action = displayAdministratorMenu();
                    if (action.equals("1")) {
                        //editMission();
                    } else if (action.equals("2")) {
                        //selectShuttle(shuttleHashMap);
                        displayCriteria();
                    }
                } else if (role.equals("Candidate")) {
                }
            } while (!action.equals("e"));
        } while (!option.equals("2"));
    }

    private void selectShuttle(HashMap<String, Shuttle> shuttleHashMap) {
        System.out.println("Available Shuttles");
        System.out.println("============================================");
        System.out.println("Shuttle1:");
        System.out.println("Shuttle Name: " + shuttleHashMap.get("shuttle1").getShuttleName());
        System.out.println("ID: " + shuttleHashMap.get("shuttle1").getShuttleId());
        System.out.println("Cargo Capacity: " + shuttleHashMap.get("shuttle1").getCargoCapacity());
        System.out.println("Fuel Capacity: " + shuttleHashMap.get("shuttle1").getFuelCapacity());
        System.out.println("Manufacturing Year: " + shuttleHashMap.get("shuttle1").getManufacturingYear());
        System.out.println("Passenger Capacity: " + shuttleHashMap.get("shuttle1").getPassengerCapacity());
        System.out.println("Travel Speed: " + shuttleHashMap.get("shuttle1").getTravelSpeed());
        System.out.println("============================================");
        System.out.println("Shuttle2:");
        System.out.println("Shuttle Name: " + shuttleHashMap.get("shuttle2").getShuttleName());
        System.out.println("ID: " + shuttleHashMap.get("shuttle2").getShuttleId());
        System.out.println("Cargo Capacity: " + shuttleHashMap.get("shuttle2").getCargoCapacity());
        System.out.println("Fuel Capacity: " + shuttleHashMap.get("shuttle2").getFuelCapacity());
        System.out.println("Manufacturing Year: " + shuttleHashMap.get("shuttle2").getManufacturingYear());
        System.out.println("Passenger Capacity: " + shuttleHashMap.get("shuttle2").getPassengerCapacity());
        System.out.println("Travel Speed: " + shuttleHashMap.get("shuttle2").getTravelSpeed());
        System.out.println("============================================");
        String option = input.acceptStringInput("Please input the desired shuttle name for mission:(Case sensitive)");

        Iterator keys = shuttleHashMap.keySet().iterator();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            if (option.equals(key)) {
                mission.setShuttle(shuttleHashMap.get(key));
            } else {
                System.out.println("Please enter the correct name of the desired shuttle listed above!");
                selectShuttle(shuttleHashMap);
            }
        }
    }

    /*private void editMission() {
        String option = "";
        do {
            option = displayCreateMissionMenu();
            option = displayCreateMission(option);
        } while (!option.equals("13"));
    }*/


    public String displayMissionCoordinatorMenu() {
        String option = "";
        System.out.println("");
        System.out.println("============================================");
        System.out.println("*          Mission Coordinator Menu        *");
        System.out.println("*                                          *");
        System.out.println("* Please select from the following options *");
        System.out.println("*            Press 1 to Creat a Mission    *");
        System.out.println("*            Press 2 to edit a Mission     *");
        System.out.println("*            Press e to exit               *");
        System.out.println("============================================");
        System.out.println("");
        option = input.acceptStringInput("Please Choose Your Option: ");
        return option;
    }

    public String displayCreateMissionMenu() {
        String option = "";
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("*                Create Mission Menu                   *");
        System.out.println("*                                                      *");
        System.out.println("* Please select from the following options to create   *");
        System.out.println("* mission                                              *");
        System.out.println("*  1. Mission name                                     *");
        System.out.println("*  2. Mission description                              *");
        System.out.println("*  3. Country of region                                *");
        System.out.println("*  4. Countries allowed                                *");
        System.out.println("*  5. Coordinator's name and contact information       *");
        System.out.println("*  6. Jobs                                             *");
        System.out.println("*  7. Employment requirements                          *");
        System.out.println("*  8. Cargo requirements                               *");
        System.out.println("*  9. Launch date                                      *");
        System.out.println("*  10. Location of the destination                     *");
        System.out.println("*  11. Duration of the mission                         *");
        System.out.println("*  12. Status of the mission                           *");
        System.out.println("*  13. Back to the Mission Coordinator Menu            *");
        System.out.println("========================================================");
        System.out.println("");
        option = input.acceptStringInput("Select from the options: ");
        return option;
    }

    public void createMission(){
        String[] mission = new String[23];
        mission = MissionMenu(mission);
        writeMissionToFile(mission);
    }

    //new
    public String[] MissionMenu(String[] mission) {
        String option = "";
        mission[0] = createMissionId();
        do {
            option = displayCreateMissionMenu();
            switch (option) {
                case "1":
                    String name = input.acceptStringInput("Please enter the mission name.");
                    mission[1] = name;
                    break;
                case "2":
                    String descrption = input.acceptStringInput("Please enter the mission description.");
                    mission[8] = descrption;
                    break;
                case "3":
                    String countryOfRegion = input.acceptStringInput("Please enter the country of region.");
                    mission[3] = countryOfRegion;
                    break;
                case "4":
                    String countriesAllowed = input.acceptStringInput("Please enter the countries allowed.");
                    mission[4] = countriesAllowed;
                    break;
                case "5":
                    String coordinateInformation = input.acceptStringInput("Please enter the coordinator's name and contact information.");
                    mission[5] = coordinateInformation;
                    break;
                case "6":
                    String jobName = input.acceptStringInput("Please enter the job name.");
                    job.setJobName(jobName);
                    String jobDescription = input.acceptStringInput("Please enter the job description.");
                    job.setJobDescription(jobDescription);
                    break;
                case "7":
                    String title = input.acceptStringInput("Please enter the employment requirements title.");
                    mission[9] = title;
                    String noOfEmp = input.acceptStringInput("Please enter the number of employees requirements for each job.");
                    mission[10] = noOfEmp;
                    break;
                case "8":
                    String cargoReqFor = input.acceptStringInput("Please enter the cargo requirements for.");
                    mission[10] = cargoReqFor;
                    break;
                case "9":
                    String LaunchDate = input.acceptStringInput("Please enter the launch date.");
                    mission[2] = LaunchDate;
                    break;
                case "10":
                    String desLocation = input.acceptStringInput("Please enter the Location of the destination.");
                    mission[21] = desLocation;
                    break;
                case "11":
                    String missionDuration = input.acceptStringInput("Please enter the Duration of the mission.");
                    mission[7] = missionDuration;
                    break;
                case "12":
                    String choice = input.acceptStringInput("Please select the state of the mission.\n\na.Planning phase \nb.Departed Earth\nc.Landed on Mars\nd.Mission in progress\ne. Returned to Earth\nf. Mission completed");
                    String state = missionState(choice);
                    mission[22] = state;
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (!option.equals("13"));
        return mission;
    }


    public String missionState(String option) {
        String state = "Planning phase";
        switch (option) {
            case "a":
                break;
            case "b":
                state = "Departed Earth";
                break;
            case "c":
                state = "Landed on Mars";
                break;
            case "d":
                state = "Mission in progress";
                break;
            case "e":
                state = "Returned to Earth";
                break;
            case "f":
                state = "Mission completed";
                break;
            default:
                System.out.println("Invalid Input!");
        }
        return state;
    }

    public String displayAdministratorMenu() {
        String option = "";
        System.out.println("");
        System.out.println("============================================");
        System.out.println("*            Administrator Menu            *");
        System.out.println("*                                          *");
        System.out.println("* Please select from the following options *");
        System.out.println("*         Press 1 to Edit a Mission        *");
        System.out.println("*         Press 2 to Select Shuttle        *");
        System.out.println("*            Press e to exit               *");
        System.out.println("============================================");
        System.out.println("");
        option = input.acceptStringInput("Please Choose Your Option: ");
        return option;

    }

    public void displayShuttle() {

    }

    public void displayCriteria() {
        System.out.println("============================================");
        System.out.println("Now, you should create specific criteria. " +
                "\n There are three criteria. \n The first one is criminal record. " +
                "\n The second one is health record. " +
                "\n The last one is age range. " +
                "\n The criteria will be stored to the system after you create.");
        System.out.println("============================================");
        String criteriaCriminal = input.acceptStringInput("Please create the criteria for criminal record ");
        String healthRecord = input.acceptStringInput("Please create the criteria for health record: ");
        String max = "";
        String min = "";
        max = input.acceptStringInput("please type the maximum age ");
        min = input.acceptStringInput("please type the minimum age ");
        boolean flag = true;
        boolean flagmin = false;
        boolean flagmax = false;
        Scanner sc = new Scanner(String.valueOf(max));
        Scanner sc2 = new Scanner(String.valueOf(min));
        while (flag) {
            while (!sc.hasNextInt() || flagmax) {
                if (!flagmax)
                    System.out.println("Maximum age is not Integer");
                max = input.acceptStringInput("please type the maximum age ");
                sc = new Scanner(String.valueOf(max));
                flagmax = false;
            }

            while (!sc2.hasNextInt() || flagmin) {
                if (!flagmin)
                    System.out.println("Minimum age is not Integer");
                min = input.acceptStringInput("please type the minimum age ");
                sc2 = new Scanner(String.valueOf(min));
                flagmin = false;
            }


            int max1 = Integer.parseInt(max);
            int min1 = Integer.parseInt(min);
            if (max1 <= 0 || max1 >= 100) {
                System.out.println("The maximum age is greater or equal to 100 please type again");
                flagmax = true;
            } else if (min1 <= 0) {
                System.out.println("The minimum age is less or equal to 0, please type again");
                flagmin = true;
            } else if (max1 < min1) {
                System.out.println("The minimum age is greater than maximum age,please type again");
                flagmin = true;
                flagmax = true;
            } else {
                flag = false;
                System.out.println("The criteria have been created successfully.");
                File criteria = new File("~/Desktops/criteria.txt");
                try {
                    FileWriter writer = new FileWriter("criteria.txt");
                    writer.write(criteriaCriminal);
                    writer.write(healthRecord);
                    writer.write(max);
                    writer.write(min);
                } catch (IOException e) {
                    System.out.println("An error occurred");
                }
            }
        }
        criteria.setAgeMax(Integer.parseInt(max));
        criteria.setAgeMin(Integer.parseInt(min));
        criteria.setCriminalRecord(criteriaCriminal);
        criteria.setHealthRecord(healthRecord);
    }

    public void writeCriteria() {

    }


    public void displayNBestCandidates() {
        Input input = new Input();
        String candiNo = "";
        boolean flag = true;
        while (flag) {
            candiNo = input.acceptStringInput("please input the number of candidates you want:");
            candiNo = candiNo.replaceAll("[0-9]", "");
            if (candiNo.length() != 0) {
                System.out.println("the input value is not an integer");
            } else {
                flag = false;
            }
        }
        String candiCriminalRecord = "";
        while (!flag) {
            candiCriminalRecord = input.acceptStringInput("please input the criminal record:");
            if (criteria.getCriminalRecord().equals(candiCriminalRecord)) {
                flag = true;
            } else {
                System.out.println("the criminal record does not exist ");
            }
        }
        String candiHealthRecord = "";
        while (flag) {
            candiHealthRecord = input.acceptStringInput("please input the health record:");
            if (criteria.getHealthRecord().equals(candiHealthRecord)) {
                flag = false;
            } else {
                System.out.println("the health record does not exist ");
            }
        }

        String candiDob = "";
        int age = -1;
        while (!flag) {
            candiDob = input.acceptStringInput("please input the date of birth in format of 'yyyy-mm-dd'");
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = format.parse(candiDob);
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("Your input should be in format of yyyy-mm-dd");
            }
            if(date != null) {
                date = java.sql.Date.valueOf(candiDob);
                flag = true;
            }
            Date currentDate = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int yearOfBirth = c.get(Calendar.YEAR);
            Calendar c1 = Calendar.getInstance();
            c.setTime(currentDate);
            int currentYear = c1.get(Calendar.YEAR);
            age = currentYear - yearOfBirth;
            if(age >= criteria.getAgeMin() && age <= criteria.getAgeMax()){
                flag = true;
            }
            else{
                System.out.println("the age does not exist");
            }
        }
        for (int i = 0; i < Integer.parseInt(candiNo); i++) {
            System.out.println("Here are the candidates you want:");
            System.out.println("");
        }

    }

    public String dateToString(Date date, String type) {
        String str = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (type.equals("SHORT")) {
            format = DateFormat.getDateInstance(DateFormat.SHORT);

            str = format.format(date);
        } else if (type.equals("MEDIUM")) {
            format = DateFormat.getDateInstance(DateFormat.MEDIUM);
            str = format.format(date);
        } else if (type.equals("FULL")) {
            format = DateFormat.getDateInstance(DateFormat.FULL);
            str = format.format(date);
        }
        return str;

    }

    public Date stringToDate(String str) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        date = java.sql.Date.valueOf(str);
        return date;
    }

    public void readMissionExcel() {

        //BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        //POIFSFileSystem p = new POIFSFileSystem(in);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mission.csv"));//换成你的文件名
            reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
            String line = null;
            while((line=reader.readLine())!=null){
                String item[] = line.split("，");
                String last = item[item.length-1];
                System.out.println(last);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //new
    public void writeMissionToFile(String[] mission){
        try {
            File file = new File( "../FIT5136_S1_2020_28/mission.csv");

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fw);
            if ( !file.exists() )
                file.createNewFile();
            if(!mission[0].equals("7303")) {
                writer.write("\n");
            }
            for (int i = 0; i < mission.length; i++) {
                String missionData = "\"" + mission[i] + "\"";
                writer.write(missionData);
                writer.write(",");
            }
            writer.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("writing into excel success");
    }


    public String loginPart() {
        String role = "";
        String userName = input.acceptStringInput("Please enter your id");
        String password = input.acceptStringInput("Please enter your password");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("missionCoordinators.csv"));
            reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String coordinator[] = line.split(",");
                String id = coordinator[0];
                String pwd = coordinator[2];
                if ((userName.equals(id)) && (password.equals(pwd))){
                    role = "MissionCoordinator";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("candidates.csv"));
            reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String candidates[] = line.split(",");
                String id = candidates[0];
                String pwd = candidates[1];
                if ((userName.equals(id)) && (password.equals(pwd))){
                    role = "candidates";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(role.equals("")){
            System.out.println("userName or password wrong");
            start();
        }
        return role;
    }

    public String createMissionId(){
        String missionid = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mission.csv"));
            reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
            String line = null;
            while((line=reader.readLine())!=null){
                String mission[] = line.split(",");
                missionid = mission[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(missionid.length()>4) {
            missionid = missionid.substring(1, 5);
        }
        int temp = Integer.parseInt(missionid) + 3;
        missionid = Integer.toString(temp);
        return  missionid;
    }

    /*public void readMissionExcel() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mission.csv"));
            reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String mission[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                String last = mission[mission.length-1];
                System.out.println(last);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public void editMission(){
        ArrayList<String[]> alldata = new ArrayList<String[]>();
        readMissionExcel();
        String missiionId = input.acceptStringInput("Please enter mission id to choose which mission you want to edit.");

        String a = String.valueOf((char)34);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mission.csv"));
            reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String mission[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                /*for(int i = 0; i < mission.length; i++){
                    mission[i] = mission[i].replace(a,"");
                }*/
                if(missiionId == mission[0]){
                    mission = MissionMenu(mission);
                }
                alldata.add(mission);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            File file = new File( "../FIT5136_S1_2020_28/mission.csv");

            FileWriter fw = new FileWriter(file, false);
            BufferedWriter writer = new BufferedWriter(fw);
            if ( !file.exists() )
                file.createNewFile();
            for(int i = 0 ; i < alldata.size(); i++){
                String[] tempMission = alldata.get(i);
                for(int j = 0; j < tempMission.length; j++){
                    String missionData = "\"" + tempMission[j] + "\"";
                    writer.write(missionData);
                    writer.write(",");
                }
                writer.write("\n");
            }
            writer.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editMissionMenu(String[] mission){

    }

    public void displayJob() {

    }

    public void displayMission() {

    }

    public void displayException(String string) {

    }
}