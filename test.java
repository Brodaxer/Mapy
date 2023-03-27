public class test {
    public static void main(String[] args) {
        ProductContainers costam = new ProductContainers();
        costam.createKeyMap();
        String sc = "rtv";
        System.out.println(costam.printProductsOfCategory(sc));
        System.out.println("Srdenia cena produktow: "+ costam.averagePriceOfProducts(sc));
        System.out.println("Najdrozszy produkt to: "+ costam.mostExpensive(sc).getName() +" : "+ costam.mostExpensive(sc).getPrice());
        System.out.println("Najtansszy produkt to: "+ costam.mostChipest(sc));
    }
}
