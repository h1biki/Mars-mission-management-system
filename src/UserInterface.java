public class UserInterface {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.start();
    }

    public UserInterface() {
    }
    public void start() {
        Input input = new Input();
        String option = "";//select option from the main menu

        while (option.equals("2")) {//main loop
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
                    displayLoginMenu();
                    break;
                case "2":
                    System.out.println("Good Bye!");
                    break;
            }
        }
    }

    public void displayLoginMenu() {

    }

    public void displayMissionCoordinatorMenu() {

    }

    public void displayAdministratorMenu() {

    }

    public void displayShuttle() {

    }

    public void displayCriteria() {

    }

    public void displayNBestCandidates() {

    }

    public void displayJob() {

    }

    public void displayMission() {

    }

    public void displayException(String string) {

    }





}