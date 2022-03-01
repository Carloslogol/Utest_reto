package co.com.choucair.utest_reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageDevices extends PageObject {

    public static final Target CONTAINER_COMPUTER = Target.the("Container for choose computer")
            .located(By.xpath(""));

    public static final Target COMPUTER = Target.the("Select for choose computer")
            .located(By.xpath());

    public static final Target CONTAINER_VERSION = Target.the("Container for choose version")
            .located(By.xpath(""));

    public static final Target VERSION = Target.the("Select for choose version")
            .located(By.xpath());

    public static final Target CONTAINER_LANGUAJE = Target.the("Container for choose languaje")
            .located(By.xpath(""));

    public static final Target LANGUAJE = Target.the("Select for choose languaje")
            .located(By.xpath());

    public static final Target CONTAINER_MOVIL_DEVICE = Target.the("Container for choose movil device")
            .located(By.xpath(""));

    public static final Target MOVIL_DEVICE = Target.the("Select for choose movil device")
            .located(By.xpath());

    public static final Target CONTAINER_MODEL_DEVICE = Target.the("Container for choose model device")
            .located(By.xpath(""));

    public static final Target MODEL_DEVICE = Target.the("Select for choose model device")
            .located(By.xpath());

    public static final Target CONTAINER_OS = Target.the("Container for choose system operative")
            .located(By.xpath(""));

    public static final Target OS = Target.the("Select for choose system operative")
            .located(By.xpath());

    public static final Target BUTTON_FINISH = Target.the("Button for finish")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
