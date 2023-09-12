package builders;

import models.EmpleadoBody;

public class EmpleadoBuilder {
    public static EmpleadoBody editarNuevoEmpleado(){
        return EmpleadoBody.builder()
                .name("pruebaAlex")
                .salary("500")
                .age("33")
                .build();
    }
}
