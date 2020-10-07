package co.com.certification.choucair.latamreto.tasks;

import co.com.certification.choucair.latamreto.userinterface.MapeoLatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Hacer implements Task {

     private MapeoLatamPage Objectspage;


    public static Hacer clic() { return Tasks.instrumented(Hacer.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MapeoLatamPage.CLICKENVIAJES),
                Click.on(MapeoLatamPage.CLICKENDONDELOENCUENTRAS)



        );

    }
}
