package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"FeatureFiles"},
		glue = {"steps"}
		)
public class Runner
{
	////select[@name='toMonth']//following-sibling::select[@name='toDay']
	//select[@name='toDay']//preceding-sibling::select[@name='toMonth']
	//select[@name='toDay']//preceding::select[@name='passCount']
	//select[@name='passCount']//following::select[@name='toDay']
	//select[@name='toDay']//parent::td//parent::tr//preceding-sibling::tr/td/b/select
	//select[@name='toDay']//ancestor::tr//preceding-sibling::tr/td/b/select

}
