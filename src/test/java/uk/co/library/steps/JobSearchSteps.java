package uk.co.library.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() throws InterruptedException {
        new HomePage().acceptCookies();
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
    }

    @And("I Enter Job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I Enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select Distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more Search Option Link")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I Enter Minimum Salary{string}")
    public void iEnterMinimumSalary(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I Enter Maximum Salary{string}")
    public void iEnterMaximumSalary(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I Enter Salary Type {string}")
    public void iEnterSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select Job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find job Button")
    public void iClickOnFindJobButton() throws InterruptedException {
        new HomePage().clickOnFindJobsButton();
    }

//    @Then("Verify the {string}")
//    public void verifyThe(String actualMessage) throws Exception {
//        String expectedMessage = new ResultPage().verifyTheResults();
//        Assert.assertEquals(expectedMessage, actualMessage);
//    }

    @Then("Verify the {string}")
    public void verifyThe(String actualMessage) throws InterruptedException {
        String expectedMessage = new ResultPage().verifyTheResults();
        Assert.assertEquals(expectedMessage, actualMessage);
        // throw new io.cucumber.java.PendingException();
    }


//    @Then("Verify the {string}")
//    public void verifyThe(String resultText) {
//        Assert.assertEquals(new ResultPage().verifyTheResults());
//    }
}
