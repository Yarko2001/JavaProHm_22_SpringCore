package dehtiar.hillel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * {@link Main} is a console app.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
public class Main {

  private static final String CONFIG_PATH = "src/main/resources/ApplicationContext.xml";

  public static void main(String[] args) {

    ApplicationContext context = new FileSystemXmlApplicationContext(CONFIG_PATH);

    ProductRepository repository = context.getBean("productRepository", ProductRepository.class);
    System.out.println("All products in ProductRepository: \n" + repository.getProductList());

    Cart cart1 = context.getBean("cart", Cart.class);
    cart1.addProduct(1);
    cart1.addProduct(5);
    cart1.addProduct(3);
    System.out.println("Products in the cart1 after adding : " + cart1.getProductList());
    cart1.removeProduct(1);
    System.out.println("Products in the cart1 after removing : ");

    System.out.println("===================================================");
    System.out.println("===================================================");
    System.out.println("===================================================");

    Cart cart2 = context.getBean("cart", Cart.class);
    cart2.addProduct(0);
    cart2.addProduct(2);
    cart2.addProduct(3);
    System.out.println("Products in the cart2 after adding : " + cart2.getProductList());
    cart2.removeProduct(0);
    System.out.println("Products in the cart2 after removing : " + cart2.getProductList());


  }

}
