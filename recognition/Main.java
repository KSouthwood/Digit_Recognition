package recognition;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int choice = 0;
        while (choice != 2) {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("Learning... not yet...");
                    break;
                case 2:
                    new Analyze();
                    break;
                default:
                    break;
            }
        }
    }
}
