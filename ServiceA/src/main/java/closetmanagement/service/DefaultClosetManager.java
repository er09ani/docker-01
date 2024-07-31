package closetmanagement.service;

import closetmanagement.model.Closet;
import closetmanagement.model.ClosetItem;
import closetmanagement.model.ClothingItem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class DefaultClosetManager implements ClosetManager{
    Closet closet;

    public DefaultClosetManager() {
        this.closet = new Closet(UUID.randomUUID().toString(), new ArrayList<>());
    }

    @Override
    public ClosetItem getItem(String id) {
        return this.closet.getItems().stream()
                .filter(item -> item.getId().equals(id))
                .map(item -> new ClosetItem(item.getId(), item.getItem(), item.isReadyForLaundry()))
                .findFirst().orElse(null);
    }

    @Override
    public String addItem(ClothingItem item) {
        String uniqueId = UUID.randomUUID().toString();
        ClosetItem closetItem  = new ClosetItem(uniqueId, item, false);
        this.closet.getItems().add(closetItem);
        return uniqueId;
    }

    @Override
    public void removeItem(String id) {
        this.closet.getItems().remove(new ClosetItem(id, null, false));
    }

    @Override
    public List<ClosetItem> getLaundry() {
        return this.closet.getItems().stream()
                .filter(ClosetItem::isReadyForLaundry)
                .collect(Collectors.toList());
    }

    @Override
    public void markForLaundry(String id) {
        for(ClosetItem item : this.closet.getItems()) {
            if(item.getId().equals(id)) {
                item.setReadyForLaundry(true);
                return;
            }
        }
    }

    @Override
    public void unmarkForLaundry(String id) {
        for(ClosetItem item : this.closet.getItems()) {
            if(item.getId().equals(id)) {
                item.setReadyForLaundry(false);
                return;
            }
        }
    }

    @Override
    public int getTotalItems() {
        return this.closet.getItems().size();
    }
}
