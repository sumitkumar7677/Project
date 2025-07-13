import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String category = br.readLine(); // Example: Accessories
        int minPrice = Integer.parseInt(br.readLine()); // Example: 3000
        int maxPrice = Integer.parseInt(br.readLine()); // Example: 4000

        int result = getProductsInRange(category, minPrice, maxPrice);
        System.out.println("Number of products in range: " + result);
    }

    public static int getProductsInRange(String category, int minPrice, int maxPrice) {
        int count = 0;
        int page = 1;
        int totalPages = 1;

        try {
            while (page <= totalPages) {
                String urlStr = "https://jsonmock.hackerrank.com/api/inventory?category=" + category + "&page=" + page;
                URL url = new URL(urlStr);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JSONObject json = new JSONObject(response.toString());
                if (page == 1) {
                    totalPages = json.getInt("total_pages");
                }

                JSONArray data = json.getJSONArray("data");
                for (int i = 0; i < data.length(); i++) {
                    JSONObject product = data.getJSONObject(i);
                    int price = product.getInt("price");
                    if (price >= minPrice && price <= maxPrice) {
                        count++;
                    }
                }

                page++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}
