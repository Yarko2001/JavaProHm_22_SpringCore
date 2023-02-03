package dehtiar.hillel.repository;

import dehtiar.hillel.model.Product;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * {@link ProductRepository} is a store class with a list of products.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@AllArgsConstructor
@Getter
@ToString
public class ProductRepository {

  List<Product> productList;

  /**
   * get the product by id
   *
   * @param id product id
   * @return {@link Product} product
   * @throws IllegalArgumentException if a product id wasn't found into list
   */

  public Product getProduct(Integer id) {
    return productList.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException
            ("Product with id [" + id + "] was not found into this repository."));
  }


}
