import java.util.*;

// Map.ofEntries(Map.entry(keyFromList(),categoryList()));
class ProductContainers {
    private ReadFromFile readFromFile = new ReadFromFile();

    private Map<String, ArrayList<Products>> mapFromFile = new HashMap<>();

    public void createKeyMap() {
        readFromFile.readAndCreate();
        ArrayList<Products> products = new ArrayList<>();

        for (String s : readFromFile.getProductsCategoryList()
        ) {

            for (Products p : readFromFile.getProductsArrayList()
            ) {
                if (Objects.equals(p.getCategory(), s)) {
                    products.add(p);

                }
            }
            ArrayList<Products> copy = new ArrayList<>(products);
            mapFromFile.put(s, copy);
            products.clear();
        }

    }

    public String printProductsOfCategory(String sc) {
        return mapFromFile.get(sc) + "";
    }

    public double averagePriceOfProducts(String sc) {
        double a = 0;
        for (Products p : mapFromFile.get(sc)
        ) {
            a = a + p.getPrice();
        }
        return a / mapFromFile.get(sc).size();
    }

    public Products mostExpensive(String sc) {
        double a = 0;
        Products products = new Products(null, null, 0);
        for (Products p : mapFromFile.get(sc)
        ) {
            if (a < p.getPrice()) {
                a = p.getPrice();
                products = p;
            }
        }
        return products;
    }

    public Products mostChipest(String sc) {
        double chipest = mapFromFile.get(sc).get(0).getPrice();
        Products products = mapFromFile.get(sc).get(0);
        for (int i = 0; i < mapFromFile.get(sc).size(); i++
        ) {
            if (chipest > mapFromFile.get(sc).get(i).getPrice()) {
                products = mapFromFile.get(sc).get(i);
            }
        }
        return products;
    }


}
