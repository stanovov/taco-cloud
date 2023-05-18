package sia.tacocloud.util;

import sia.tacocloud.model.entity.Ingredient;
import sia.tacocloud.model.entity.Taco;
import sia.tacocloud.model.udt.IngredientUDT;
import sia.tacocloud.model.udt.TacoUDT;

import java.util.stream.Collectors;

public class TacoUDTUtils {

    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return IngredientUDT.builder()
                .name(ingredient.getName())
                .type(ingredient.getType())
                .build();
    }

    public static TacoUDT toTacoUDT(Taco taco) {
        return TacoUDT.builder()
                .name(taco.getName())
                .ingredients(taco.getIngredients())
                .build();
    }
}
