package sia.tacocloud.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.data.IngredientRepository;
import sia.tacocloud.model.entity.Ingredient;
import sia.tacocloud.model.udt.IngredientUDT;
import sia.tacocloud.util.TacoUDTUtils;

@Component
public class IngredientByIdConverter implements Converter<String, IngredientUDT> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientUDT convert(String id) {
        return ingredientRepository.findById(id)
                .map(TacoUDTUtils::toIngredientUDT)
                .orElse(null);
    }
}
