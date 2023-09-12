package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Message implements Question {
    public static Question<?> elementoResponseBody(){
        return new Message();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().body().jsonPath().get("message");
    }
}
