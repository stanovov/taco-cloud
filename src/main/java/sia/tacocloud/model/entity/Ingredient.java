package sia.tacocloud.model.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import sia.tacocloud.model.enums.IngredientType;


@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Table("ingredients")
public class Ingredient {

    @PrimaryKey
    private final String id;

    private final String name;

    private final IngredientType type;
}
