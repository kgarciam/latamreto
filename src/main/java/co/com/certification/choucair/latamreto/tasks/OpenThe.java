package co.com.certification.choucair.latamreto.tasks;

import co.com.certification.choucair.latamreto.userinterface.HomePageLatam;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

     private HomePageLatam homepage;

    public static OpenThe Pagweb() { return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homepage));



    }
}
