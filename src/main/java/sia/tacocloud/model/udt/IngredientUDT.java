package sia.tacocloud.model.udt;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import sia.tacocloud.model.enums.IngredientType;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Builder
@UserDefinedType("ingredient")
public class IngredientUDT {

    private final String name;

    private final IngredientType type;
}
