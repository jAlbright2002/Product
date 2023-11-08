package ie.atu.labexam1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

    @JsonProperty("warehouseId")
    private int warehouseId;

    @JsonProperty("location")
    private String location;

    @JsonProperty("capacity")
    private int capacity;

}
