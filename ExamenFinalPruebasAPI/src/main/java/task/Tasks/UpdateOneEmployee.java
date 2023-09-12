package task.Tasks;
import builders.EmpleadoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class UpdateOneEmployee implements Task {
    private final int empleado;
    public UpdateOneEmployee (int empleado){
        this.empleado = empleado;
    }
    public static Performable empleadoNumero(int empleado){
        return instrumented(UpdateOneEmployee.class, empleado);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("public/api/v1/update/" + empleado)
                        .with(requestSpecification -> requestSpecification
                                .body(EmpleadoBuilder.editarNuevoEmpleado()))
        );
    }
}


