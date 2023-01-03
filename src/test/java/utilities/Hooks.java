package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setups.Capabilities;

public class Hooks extends Capabilities {

    @Before
    public void beforeScenario() throws Exception{
        System.out.println("This will run before the Scenario");
        preparation();
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        stopServer();
    }
}
