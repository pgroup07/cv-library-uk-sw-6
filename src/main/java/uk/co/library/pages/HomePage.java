package uk.co.library.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleElement;


    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "(//*[@class='mat-button-wrapper'])[3]")
    WebElement cookiesAcceptButton;


    public void enterJobTitle(String jobTitle) {
        log.info("Enter job Title " + jobTitleElement.toString());
        sendTextToElement(jobTitleElement, jobTitle);
    }

    public void enterLocation(String location) {
        log.info("Enter location " + locationElement.toString());
        sendTextToElement(locationElement, location);

    }

    public void selectDistance(String distance) {
        log.info("Select distance " + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Click on More Search Option distance " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        log.info("Enter Minimum Salary " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Maximum Salary " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String sType) {
        log.info("Select Salary Type " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        log.info("Select Job Type " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton() throws InterruptedException {
        log.info("Click on find jobs button" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        Thread.sleep(2000);
    }

    public void acceptCookies() throws InterruptedException {

        switchToFrame("gdpr-consent-notice");
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
        switchToDefaultContent();
    }

}
