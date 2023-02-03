package dehtiar.hillel.service;

import dehtiar.hillel.model.Product;
import dehtiar.hillel.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.Value;

/**
 * {@link Cart} is a store class, where you can add and remove the products.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@Value
public class Cart {

  ProductRepository productRepository;
  List<Product> productList = new ArrayList<>();

  /**
   * adding the product
   *
   * @param id product id
   */
  public void addProduct(Integer id) {
    productList.add(productRepository.getProduct(id));
  }

  /**
   * removing the product
   *
   * @param id product id
   */
  public void removeProduct(Integer id) {
    productList.remove(productRepository.getProduct(id));
  }

}
