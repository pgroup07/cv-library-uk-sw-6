package uk.co.library;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utilities.Utility;


public class Hooks extends Utility {

    @Before
    public void setup() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
