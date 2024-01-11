package catalogue;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BetterBasketTest {

    @Test
        public void testMergeAddProduct() {
            BetterBasket b = new BetterBasket();
            Product p1 = new Product("0001", "Digital Camera", 89.99, 1);
            Product p2 = new Product("0001", "Digital Camera", 89.99, 1);
            Product p3 = new Product("0002", "MP3 Player", 7.99, 1);
            Product p4 = new Product("0002", "MP3 Player", 7.99, 2);

            //Test p1 and p2 get merged
            b.add(p1);
            b.add(p2);
            assertEquals(1, b.size(), "Size incorrect after merge");
            assertEquals(2, b.get(0).getQuantity(), "Quantity incorrect after merge");

            //Test that p3 doesn't get merged
            b.add(p3);
            assertEquals(2, b.size(), "Size incorrect after non-merge");

            // Test with a single product
            BetterBasket b2 = new BetterBasket();
            b2.add(p1);
            assertEquals(1, b2.size(), "Size incorrect for a basket with a single product");

            // Test with an empty basket
            BetterBasket b1 = new BetterBasket();
            assertEquals(0, b1.size(), "Size incorrect for an empty basket");

            // Test clear basket method
            b.clear();
            assertEquals(0, b.size(), "basket clear");
    }

}