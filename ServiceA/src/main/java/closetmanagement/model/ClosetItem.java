package closetmanagement.model;

import java.util.Objects;

public class ClosetItem {
    String id;
    ClothingItem item;
    boolean readyForLaundry;

    public ClosetItem(String id, ClothingItem item, boolean readyForLaundry) {
        this.id = id;
        this.item = item;
        this.readyForLaundry = readyForLaundry;
    }

    public String getId() {
        return id;
    }

    public ClothingItem getItem() {
        return item;
    }

    public boolean isReadyForLaundry() {
        return readyForLaundry;
    }

    public void setReadyForLaundry(boolean readyForLaundry) {
        this.readyForLaundry = readyForLaundry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClosetItem that = (ClosetItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
