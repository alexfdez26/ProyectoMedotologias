package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude
public class EmpleadoBody {
    @JsonProperty("name")
    private  String name;
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("age")
    private String age;
}
