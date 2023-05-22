package console;





import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;







@RunWith(Cucumber.class)



@CucumberOptions(features = "/Users/VI20466296/Downloads/Practice/console/src/main/java/features/test.feature", glue = {



 "BINDING" })



public class runner extends AbstractTestNGCucumberTests {



}



