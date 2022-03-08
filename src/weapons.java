import java.util.Map;
import java.util.HashMap;

public class weapons {
    public Map<String, String> dagger = new HashMap<String, String>();
    public Map<String, String> sword = new HashMap<String, String>();
    weapons() {
        // dagger
        this.dagger.put("name", "Dagger");
        this.dagger.put("damage", "1");
        this.dagger.put("description", "A small, sharp dagger.");
        this.dagger.put("durability", "60");
        this.dagger.put("price", "10");

        this.sword.put("name", "sword");
        this.sword.put("damage", "3");
        this.sword.put("description", "A long, sharp sword.");
        this.sword.put("durability", "150");
        this.sword.put("price", "45");

    }
}
