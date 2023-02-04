package dehtiar.hillel.model;

import lombok.Data;

/**
 * {@link Product} is a product class.
 *
 * @author Yaroslav Dehtiar on 01.02.2023
 */
@Data
public class Product {

  private final String name;
  private final Integer id;
  private final double cost;


}
