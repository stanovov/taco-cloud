package sia.tacocloud.model.udt;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import sia.tacocloud.model.enums.IngredientType;

@Data
@Builder
@UserDefinedType("ingredient")
public class IngredientUDT {

    private String name;

    private IngredientType type;
}
