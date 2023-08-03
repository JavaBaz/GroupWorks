import com.example.Product;
import com.example.ProductNotFoundException;
import com.example.ShoppingCart;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


public class ProductTest {

    @Test
    public void testIsNewCartLengthZero(){

        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0,shoppingCart.getItemCount());
    }

    @Test
    public void testIsEmptyCartLengthZero(){
        Product product1 = new Product("product1",10.0);
        Product product2 = new Product("product2",15.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(product1);
        shoppingCart.addItem(product2);
        shoppingCart.empty();
        assertEquals(0,shoppingCart.getItemCount());
    }

    @Test
    public void testIsNumberOfItemsAdded(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("product1",10.0);
        Product product2 = new Product("product2",15.0);
        shoppingCart.addItem(product1);
        assertEquals(1,shoppingCart.getItemCount());
        shoppingCart.addItem(product2);
        assertEquals(2,shoppingCart.getItemCount());
    }

    @Test
    public void testIsSumOfPricesRight(){

        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("product1",10.0);
        Product product2 = new Product("product2",15.0);
        shoppingCart.addItem(product1);
        assertEquals(10.0,shoppingCart.getBalance());
        shoppingCart.addItem(product2);
        assertEquals(25.0,shoppingCart.getBalance());
    }

    @Test
    public void testIsNumberOfRemovedItemsRight() throws ProductNotFoundException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("product1",10.0);
        Product product2 = new Product("product2",15.0);
        Product product13 = new Product("product13",15.0);

        shoppingCart.addItem(product1);
        shoppingCart.addItem(product2);
        assertEquals(2,shoppingCart.getItemCount());
        shoppingCart.removeItem(product2);
        assertEquals(1,shoppingCart.getItemCount());
    }


    @Test(expected = ProductNotFoundException.class)
    public void testWhenRemoveItemOutOfCart() throws ProductNotFoundException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("product1",10.0);
        Product product2 = new Product("product2",15.0);
        Product product13 = new Product("product13",15.0);
        shoppingCart.addItem(product1);
        shoppingCart.addItem(product2);
        assertEquals(2,shoppingCart.getItemCount());
        shoppingCart.removeItem(product13);
    }

}
