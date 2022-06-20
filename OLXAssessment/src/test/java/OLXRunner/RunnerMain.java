package OLXRunner;

import Utility.RunnerClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/java/OLXFeatures",glue="OLXDefinitions")
public class RunnerMain extends RunnerClass{

}
