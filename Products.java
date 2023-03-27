import java.util.Comparator;
import java.util.Objects;

class Products {
    private String category;
    private String name;
    private double price;

    public Products(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 && Objects.equals(category, products.category) && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }

//    @Override
//    public int compareTo(Products o) {
//        if (hashCode()>o.hashCode()){
//            return 1;
//        }else if (hashCode()<o.hashCode()){
//            return -1;
//        }else {
//            return 0;
//        }
//
//    }
//    public static class CategoryNameComparator implements Comparator<Products>{
//        @Override
//        public int compare(Products p1,Products p2){
//            return p1.category.compareTo(p2.category);
//        }
//    }

    @Override
    public String toString() {
        return category + " " + name + " " + price;
    }
}
