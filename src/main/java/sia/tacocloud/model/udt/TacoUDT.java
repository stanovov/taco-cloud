package sia.tacocloud.model.udt;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.List;

@Data
@Builder
@UserDefinedType
public class TacoUDT {

    private final String name;

    private final List<IngredientUDT> ingredients;
}
