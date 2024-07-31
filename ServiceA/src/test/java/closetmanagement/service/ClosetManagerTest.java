package closetmanagement.service;

import closetmanagement.model.ClosetItem;
import closetmanagement.model.ClothingItem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ClosetManagerTest {

    @Test
    void test_can_AddItem() {
        ClosetManager closetManager = new DefaultClosetManager();
        ClothingItem item1 = new ClothingItem();
        item1.setName("Shirt");

        ClothingItem item2 = new ClothingItem();
        item2.setName("Shirt");

        assertThat(closetManager.getTotalItems(), equalTo(0));
        closetManager.addItem(item1);
        closetManager.addItem(item2);
        assertThat(closetManager.getTotalItems(), equalTo(2));
    }

    @Test
    void test_can_removeItem() {
        ClothingItem item1 = new ClothingItem();
        item1.setName("Shirt");

        ClosetManager closetManager = new DefaultClosetManager();
        String id = closetManager.addItem(item1);
        assertThat(closetManager.getTotalItems(), equalTo(1));
        closetManager.removeItem(id);
        assertThat(closetManager.getTotalItems(), equalTo(0));
    }

    @Test
    void test_can_setItemForLaundry_and_unmarkForLaundry() {
        ClothingItem item1 = new ClothingItem();
        item1.setName("Shirt");
        ClosetManager closetManager = new DefaultClosetManager();
        String id = closetManager.addItem(item1);
        ClosetItem closetItem = closetManager.getItem(id);
        assertThat(closetItem.isReadyForLaundry(), equalTo(false));
        closetManager.markForLaundry(id);
        assertThat(closetManager.getItem(id).isReadyForLaundry(), equalTo(true));
        closetManager.unmarkForLaundry(id);
        assertThat(closetManager.getItem(id).isReadyForLaundry(), equalTo(false));
    }

    @Test
    void test_can_getLaundry() {
        ClothingItem item1 = new ClothingItem();
        item1.setName("Shirt");
        ClothingItem item2 = new ClothingItem();
        item1.setName("Pant");
        ClosetManager closetManager = new DefaultClosetManager();
        String id1 = closetManager.addItem(item1);
        closetManager.addItem(item2);
        closetManager.markForLaundry(id1);
        List<ClosetItem> laundry = closetManager.getLaundry();
        assertThat(laundry.size(), equalTo(1));
    }

}