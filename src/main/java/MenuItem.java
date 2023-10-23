import lombok.Getter;

public class MenuItem {
    @Getter
    private String name;
    @Getter
    private String description;
    private boolean vegetarian;
    @Getter
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        setName(name);
        setDescription(description);
        this.vegetarian = (vegetarian);
        setPrice(price);
    }

    public MenuItem(){
        this("", "",false,0.0);
    };
    public String StrClean(String str){
        return str.replaceAll("\\s+"," ").trim();
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    private void setName(String name) {
        this.name = StrClean(name);
    }

    private void setDescription(String description) {
        this.description = StrClean(description);
    }


    private void setPrice(double price) {
        this.price = Math.abs(price);
    }
}
