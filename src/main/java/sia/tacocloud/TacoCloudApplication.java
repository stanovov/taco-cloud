package sia.tacocloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sia.tacocloud.model.entity.Ingredient;
import sia.tacocloud.model.enums.IngredientType;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner dataLoader(IngredientRepositoryJpa ingredientRepository) {
//        return args -> {
//            ingredientRepository.save(new Ingredient("FLTO", "Flour Tortilla", IngredientType.WRAP));
//            ingredientRepository.save(new Ingredient("COTO", "Corn Tortilla", IngredientType.WRAP));
//            ingredientRepository.save(new Ingredient("GRBF", "Ground Beef", IngredientType.PROTEIN));
//            ingredientRepository.save(new Ingredient("CARN", "Carnitas", IngredientType.PROTEIN));
//            ingredientRepository.save(new Ingredient("TMTO", "Diced Tomatoes", IngredientType.VEGGIES));
//            ingredientRepository.save(new Ingredient("LETC", "Lettuce", IngredientType.VEGGIES));
//            ingredientRepository.save(new Ingredient("CHED", "Cheddar", IngredientType.CHEESE));
//            ingredientRepository.save(new Ingredient("JACK", "Monterrey Jack", IngredientType.CHEESE));
//            ingredientRepository.save(new Ingredient("SLSA", "Salsa", IngredientType.SAUCE));
//            ingredientRepository.save(new Ingredient("SRCR", "Sour Cream", IngredientType.SAUCE));
//        };
//    }
}
