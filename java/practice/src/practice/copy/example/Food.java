package practice.copy.example;

public class Food implements Cloneable {
    Number id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(Number id, String name, Number quantity, Number price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    Number quantity;
    Number price;

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Food(this.getId(), this.getName(), this.getQuantity(), this.getPrice());
        }
    }
}
