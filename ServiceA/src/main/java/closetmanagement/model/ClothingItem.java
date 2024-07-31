package closetmanagement.model;

public class ClothingItem {
    String name;
    Category category;
    Size size;
    Color color;
    double price;
    Brand brand;
    Material material;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public enum Category {
        TOPS,
        BOTTOMS,
        OUTWEAR,
        UNDERWEAR_AND_LINGERIE,
        SEASONAL_WEAR,
        SLEEPWEAR,
        ACTIVEWEAR
    }

    public enum Brand {

        ZUDIO,
        MAX,
        STUDIO_FIT,
        ZARA;
    }

    public enum Color {
        RED,
        BLUE,
        GREEN,
        ORANGE,
        WHITE,
        BLACK;
    }

    public enum Material {
        SILK,
        SATIN,
        POLYESTER,
        COTTON,
        NYLON,
        HYBRID;
    }

    public enum Size {
        XS,
        S,
        M,
        L,
        XL,
        XXL;
    }
}
