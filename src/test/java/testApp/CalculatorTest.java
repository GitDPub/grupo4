package testApp;

import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CalculatorTest {

    MainActivity calculator = new MainActivity();

    @Before
    public void Before() throws MalformedURLException {
        calculator.buttonClear.Click();
    }

    @Test
    public void AddTest() throws MalformedURLException {
        calculator.button2.Click();
        calculator.buttonPlus.Click();
        calculator.button8.Click();
        calculator.buttonEqual.Click();
        String actualResult = calculator.resultText.GetText();
        String expectedResult = "10";
        Assert.assertEquals("no add done correctly", expectedResult, actualResult);
    }

    @Test
    public void SubtractTest() throws MalformedURLException {
        calculator.button2.Click();
        calculator.button1.Click();
        calculator.buttonSubtract.Click();
        calculator.button2.Click();
        calculator.button0.Click();
        calculator.buttonEqual.Click();
        String actualResult = calculator.resultText.GetText();
        String expectedResult = "1";
        Assert.assertEquals("no subtract done correctly", expectedResult, actualResult);
    }

    @Test
    public void MultiplyTest() throws MalformedURLException {
        calculator.button3.Click();
        calculator.buttonMultiply.Click();
        calculator.button5.Click();
        calculator.buttonEqual.Click();
        String actualResult = calculator.resultText.GetText();
        String expectedResult = "15";
        Assert.assertEquals("no multiplication done correctly", expectedResult, actualResult);
    }

    @Test
    public void DivideTest() throws MalformedURLException {
        calculator.button2.Click();
        calculator.button1.Click();
        calculator.buttonDivide.Click();
        calculator.button3.Click();
        calculator.buttonEqual.Click();
        String actualResult = calculator.resultText.GetText();
        String expectedResult = "7";
        Assert.assertEquals("no divide done correctly", expectedResult, actualResult);
    }

    @Test
    public void PercentageTest() throws MalformedURLException {
        calculator.button5.Click();
        calculator.button0.Click();
        calculator.button0.Click();
        calculator.buttonPercentage.Click();
        calculator.button5.Click();
        calculator.button0.Click();
        calculator.buttonEqual.Click();
        String actualResult = calculator.resultText.GetText();
        String expectedResult = "250";
        Assert.assertEquals("no percentage done correctly", expectedResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().CloseSession();
    }
}
