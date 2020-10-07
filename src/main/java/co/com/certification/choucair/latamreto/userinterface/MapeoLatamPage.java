package co.com.certification.choucair.latamreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapeoLatamPage  {

    public static final Target CLICKENVIAJES = Target.the("Click to viajes").located(By.xpath("//span[@class='icon-regular-tra005 icon-small icon-color icon-style']"));
    public static final Target CLICKENDONDELOENCUENTRAS = Target.the("Click to donde lo encuentras ?").located(By.xpath("//span[contains(text(),'¿Dónde lo encuentras?')]"));
    public static final Target QUESTION = Target.the("Question").located(By.xpath("//span[contains(text(),'VBCDGG.')]"));


}
