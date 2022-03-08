import java.util.Scanner;

public class main {

    private static boolean isDev = false;

    public static void print(String text){
        System.out.println(text);
    }

    public static void store(person p1){
        print("Welcome to the store");
        System.out.println("you have " + p1.silver + " silver");
        print("what would you like to buy?");
        print("1 - sword - 45 silver");
        print("2 - dagger - 10 silver");
        print("3 - leave");
        Scanner sc = new Scanner(System.in);
        String usrCommand = sc.nextLine();
        if (usrCommand.equals("1")){
            if (p1.silver >= 45){
                p1.silver -= 45;
                if (p1.Equipped == "none"){
                    p1.Equipped = "sword";
                }
                else{
                    if (p1.Equipped2 == "none"){
                        p1.Equipped2 = "sword";
                    }
                    else{
                        print("you have no room for another weapon");
                        print("you have to sell something");
                        print("1 - sell your first weapon -- " + p1.Equipped );
                        print("2 - sell your second weapon -- " + p1.Equipped2 );
                        print("3 - leave");
                        String usrCommand2 = sc.nextLine();
                        if (usrCommand2.equals("1")){
                            if (p1.Equipped == "sword"){
                                p1.Equipped = "none";
                                p1.silver += 45;
                            }
                            if (p1.Equipped == "dagger"){
                                p1.Equipped = "none";
                                p1.silver += 10;
                            }
                        }
                        else if (usrCommand2.equals("2")){
                            if (p1.Equipped2 == "sword"){
                                p1.Equipped2 = "none";
                                p1.silver += 45;
                            }
                            if (p1.Equipped2 == "dagger"){
                                p1.Equipped2 = "none";
                                p1.silver += 10;

                            }
                        }
                        else if (usrCommand2.equals("3")){
                            print("you leave the store");
                        }
                    }
                }
                print("you bought a sword");
            }
            else{
                print("you do not have enough silver");

            }

        }
        else if (usrCommand.equals("2")){
            if (p1.silver >= 10){
                if (p1.Equipped == "none"){
                    p1.Equipped = "dagger";
                    p1.silver -= 10;
                    print("you bought a dagger");
                }
                else{
                    if (p1.Equipped2 == "none"){
                        p1.Equipped2 = "dagger";
                        p1.silver -= 10;
                        print("you bought a dagger");
                    }
                    else{
                        print("you have no room for another weapon");
                        print("you have to sell something");
                        print("1 - sell your first weapon -- " + p1.Equipped );
                        print("2 - sell your second weapon -- " + p1.Equipped2 );
                        print("3 - leave");
                        String usrCommand2 = sc.nextLine();
                        if (usrCommand2.equals("1")){
                            if (p1.Equipped == "sword"){
                                p1.Equipped = "none";
                                p1.silver += 45;
                                print("you sold your sword");
                            }
                            if (p1.Equipped == "dagger"){
                                p1.Equipped = "none";
                                p1.silver += 10;
                                print("you sold your dagger");
                            }
                        }
                        else if (usrCommand2.equals("2")){
                            if (p1.Equipped2 == "sword"){
                                p1.Equipped2 = "none";
                                p1.silver += 45;
                                print("you sold your sword");
                            }
                            if (p1.Equipped2 == "dagger"){
                                p1.Equipped2 = "none";
                                p1.silver += 10;
                                print("you sold your dagger");
                            }
                        }
                        else if (usrCommand2.equals("3")){
                            print("you leave the store");
                        }
                    }
                }
            }

        }
        else if (usrCommand.equals("3")){
            print("goodbye");
        }

    }

    public static void main(String[] args){
        person p1 = new person("John", 15);
        Scanner sc = new Scanner(System.in);
        print("type help for help");
        while (true){
            print("Enter a command: ");
            String usrCommand = sc.nextLine();

            if(usrCommand.equals("stats")){
                p1.printStats();

            }
            else if (usrCommand.equals("help")){
                print("stats - prints the stats of the person");
                print("help - prints this help message");
                print("exit - exits the game");
                print("store - opens the store");

            }
            else if (usrCommand.equals("exit")){
                print("are you sure you want to exit? it does not save your progress (y/n)");
                String usrConfirm = sc.nextLine();
                if (usrConfirm.equals("y")){
                    print("goodbye");
                    break;
                }
                else{
                    print("okay");
                }
            }
            else if (usrCommand.equals("store")){
                store(p1);
            }
            else if (usrCommand.equals("")){
                print("Please enter a command");
            }

            // DEV COMMANDS============================================================================
            else if (usrCommand.equals("d")){
                print("you found the secret command");
                print("this gives you Dev powers");
                print("are you sure you want to continue? (y/n)");
                String usrConfirm = sc.nextLine();
                if (usrConfirm.equals("y")){
                    print("you are now a Dev");
                    isDev = true;
                    p1.silver += 1000000;
                }
                else{
                    print("okay");
                }
            }
            else if (usrCommand.equals("set stats")){
                if (isDev == true){
                    print("enter your stats");
                    print("hp :");
                    int TEMP_hp = sc.nextInt();
                    print("xp :");
                    int TEMP_xp = sc.nextInt();
                    print("silver :");
                    int TEMP_silver = sc.nextInt();
                    print("level :");
                    int TEMP_level = sc.nextInt();
                    print("age :");
                    int TEMP_age = sc.nextInt();

                    String TEMP_name = p1.name;
                    p1.setStats(TEMP_hp, TEMP_xp, TEMP_level, TEMP_silver, TEMP_name, TEMP_age);
                }
                else{

                }
            }
        }

    }
}
