package sia.tacocloud.model.entity;

import lombok.Data;
import sia.tacocloud.model.enums.IngredientType;

@Data
public class Ingredient {

    private final String id;

    private final String name;

    private final IngredientType type;
}
