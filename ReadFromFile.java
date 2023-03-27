import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ReadFromFile {
    private Set<String> productsCategoryList = new LinkedHashSet<>();
    private List<Products> productsArrayList = new ArrayList<>();
    private String fileName = "C:\\Users\\mlosz\\IdeaProjects\\MapyZ2\\src\\txt";

    public void readAndCreate() {

        String[] product = {};
        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            reader.readLine();
            while ((nextLine = reader.readLine()) != null) {
                product = nextLine.split(";");
                productsArrayList.add(new Products(product[0], product[1], Double.parseDouble(product[2])));
                productsCategoryList.add(product[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Set<String> getProductsCategoryList() {
        return productsCategoryList;
    }

    public List<Products> getProductsArrayList() {
        return productsArrayList;
    }
}
