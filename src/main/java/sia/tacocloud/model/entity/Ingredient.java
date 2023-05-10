package sia.tacocloud.model.entity;

import lombok.*;
import sia.tacocloud.model.enums.IngredientType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient {

    @Id
    private final String id;

    private final String name;

    private final IngredientType type;
}
