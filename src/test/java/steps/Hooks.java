package steps;

import com.codeborne.selenide.Configuration;
import config.ProjectConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void setUp() {
        ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.startMaximized = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = config.baseUrl();

        open("");
    }

    @After
    public void getScenarioInfo(Scenario scenario) {
        System.out.println(scenario.getId());
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.isFailed());
        System.out.println(scenario.getSourceTagNames());
    }
}
