package closetmanagement.model;

import java.util.List;
import java.util.UUID;

public class Closet {
    String id;
    List<ClosetItem> items;

    private Closet() {
    }

    public Closet(String id, List<ClosetItem> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public List<ClosetItem> getItems() {
        return items;
    }
}
