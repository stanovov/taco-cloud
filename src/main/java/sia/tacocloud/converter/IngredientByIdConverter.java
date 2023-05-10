package sia.tacocloud.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.data.jpa.IngredientRepositoryJpa;
import sia.tacocloud.model.entity.Ingredient;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepositoryJpa ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepositoryJpa ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id)
                .orElse(null);
    }
}
