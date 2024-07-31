package closetmanagement.service;

import closetmanagement.model.Closet;
import closetmanagement.model.ClosetItem;
import closetmanagement.model.ClothingItem;

import java.util.List;

public interface ClosetManager {
    ClosetItem getItem(String id);
    String addItem(ClothingItem item);
    void removeItem(String id);
    List<ClosetItem> getLaundry();
    void markForLaundry(String id);
    void unmarkForLaundry(String id);
    int getTotalItems();
}
