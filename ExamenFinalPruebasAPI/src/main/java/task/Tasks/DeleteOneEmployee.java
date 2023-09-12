package task.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class DeleteOneEmployee implements Task {
    private final int empleado;
    public DeleteOneEmployee (int empleado){
        this.empleado = empleado;
    }
    public static Performable empleadoNumero(int empleado){

        return instrumented(DeleteOneEmployee.class, empleado);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from("public/api/v1/delete/" + empleado)
        );
    }
}
