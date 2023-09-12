package testADL.stepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;
import questions.Message;
import questions.Name;
import questions.StatusCode;
import task.Tasks.DeleteOneEmployee;
import task.Tasks.UpdateOneEmployee;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class MyStepsDefinition {
    private static final String baseURL = "https://dummy.restapiexample.com/";
    Actor alex;
    @Dado("el tester que hace hace el examen final")
    public void elTesterQueHaceElExamenFinal() {
        alex = Actor.named("Alex Prueba")
                .whoCan(CallAnApi.at(baseURL));
    }
    @Cuando("consume una peticion tipo PUT al API Dummy Rest")
    public void consumeUnaPeticionTipoPUTAlAPIDummyRest() {
        alex.attemptsTo(
                UpdateOneEmployee.empleadoNumero(2)
        );
    }
    @Cuando("consume una peticion tipo Delete al API Dummy Rest")
        public void consumeUnaPeticionTipoDELETEAlAPIDummyRest() {
            alex.attemptsTo(
                    DeleteOneEmployee.empleadoNumero(1)
            );
    }
    @Entonces("obtiene una respuesta exitosa del servicio actualizar API Dummy Rest")
    public void obtieneUnaRespuestaExitosaDelServicioActualizarAPIDummyRest() {
        alex = Actor.named("Alex Prueba")
                .whoCan(CallAnApi.at(baseURL));
        alex.should(seeThat("El status code de la petición es exitosa",
                StatusCode.respuestaStatusCode(),
                equalTo(HttpStatus.SC_OK)))
        ;
    }
    @Entonces("obtiene una respuesta exitosa del servicio Eliminar API Dummy Rest")
    public void obtieneUnaRespuestaExitosaDelServicioEliminarAPIDummyRest() {
        alex = Actor.named("Alex Prueba")
                .whoCan(CallAnApi.at(baseURL));
        alex.should(seeThat("El status code de la petición es exitosa",
                StatusCode.respuestaStatusCode(),
                equalTo(HttpStatus.SC_OK)));
    }
    @Y("el usuario fue actualizado correctamente")
    public void elUsuarioFueActualizadoCorrectamente(){
        alex.should(
                seeThat("el usuario fue actualizado correctamente",
                        Name.elementoResponseBody(), equalTo("pruebaAlex")));
    }
    @Y("el mensaje de eliminación es correcto")
    public void elMensajeDeEliminacionEsCorrecto(){
        alex.should(
                seeThat("el mensaje de eliminación es correcto",
                        Message.elementoResponseBody(), equalTo("Successfully! Record has been deleted")));
    }
}
