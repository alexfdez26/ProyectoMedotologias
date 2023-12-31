package questions;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
public class StatusCode implements Question {
    public static Question<Integer> respuestaStatusCode(){
        return new StatusCode();
    }
    @Override
    public Object answeredBy (Actor actor){
        return SerenityRest.lastResponse().statusCode();
    }
}
