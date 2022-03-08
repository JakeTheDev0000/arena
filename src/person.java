import java.util.Map;
import java.util.HashMap;


public class person {

    public static void print(String text) {
        System.out.println(text);
    }

    public String name;
    private int age;
    private int hp;
    private int xp;
    private int lvl;
    private int howMuchMoreXpTillNextLvl;
    private weapons wep = new weapons();
    public int silver;

    public String Equipped = "none";
    public String Equipped2 = "none";

    public String shield = "none";
    public String armor = "none";

    person(String name, int age) {
        this.name = name;
        this.age = age;

        this.hp = 100;
        this.xp = 0;
        this.lvl = 1;
        this.howMuchMoreXpTillNextLvl = 100 - this.xp;

        this.silver = 10;

        this.Equipped = "none";
    }

    public void printStats() {
        this.howMuchMoreXpTillNextLvl = 100 - this.xp;
        print("========================stats===================================");
        print("Name: " + this.name);
        print("Age: " + this.age);
        print("HP: " + this.hp);
        print("XP: " + this.xp);
        print("Level: " + this.lvl);
        print("How much more XP till next level: " + this.howMuchMoreXpTillNextLvl);
        print("Equipped: " + this.Equipped);
        print("Equipped2: " + this.Equipped2);
        print("Silver: " + this.silver);
        print("========================stats===================================");
    }

    public void setStats(int hp, int xp, int lvl, int silver, String name, int age) {
        this.hp = hp;
        this.xp = xp;
        this.lvl = lvl;
        this.silver = silver;
        this.name = name;
        this.age = age;
    }
}
