package sia.tacocloud.data.jpa;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.entity.Ingredient;

public interface IngredientRepositoryJpa extends CrudRepository<Ingredient, String> {
}
