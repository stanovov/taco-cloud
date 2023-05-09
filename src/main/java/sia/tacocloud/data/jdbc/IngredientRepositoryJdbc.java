package sia.tacocloud.data.jdbc;

import sia.tacocloud.model.entity.Ingredient;

import java.util.Optional;

public interface IngredientRepositoryJdbc {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
