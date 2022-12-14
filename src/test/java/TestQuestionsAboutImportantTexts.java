import elements.page.MainPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;

public class TestQuestionsAboutImportantTexts {
    private WebDriver driver;


    @Test
    public void QuestionsOne() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[0]);
        mainPage.standBy(By.id("accordion__panel-0"));
        assertEquals(mainPage.questionText[0], driver.findElement(By.id("accordion__panel-0")).getText());
    }

    @Test
    public void QuestionsTwo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[1]);
        mainPage.standBy(By.id("accordion__panel-1"));
        assertEquals(mainPage.questionText[1], driver.findElement(By.id("accordion__panel-1")).getText());
    }

    @Test
    public void QuestionsThree() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[2]);
        mainPage.standBy(By.id("accordion__panel-2"));
        assertEquals(mainPage.questionText[2], driver.findElement(By.id("accordion__panel-2")).getText());
    }

    @Test
    public void QuestionsFour() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[3]);
        mainPage.standBy(By.id("accordion__panel-3"));
        assertEquals(mainPage.questionText[3], driver.findElement(By.id("accordion__panel-3")).getText());
    }

    @Test
    public void QuestionsFive() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[4]);
        mainPage.standBy(By.id("accordion__panel-4"));
        assertEquals(mainPage.questionText[4], driver.findElement(By.id("accordion__panel-4")).getText());
    }

    @Test
    public void QuestionsSix() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[5]);
        mainPage.standBy(By.id("accordion__panel-5"));
        assertEquals(mainPage.questionText[5], driver.findElement(By.id("accordion__panel-5")).getText());
    }

    @Test
    public void QuestionsSeven() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[6]);
        mainPage.standBy(By.id("accordion__panel-6"));
        assertEquals(mainPage.questionText[6], driver.findElement(By.id("accordion__panel-6")).getText());
    }

    @Test
    public void QuestionsEight() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        mainPage.openDomen();
        mainPage.clickOnQuestionButton(mainPage.questionLocator[7]);
        mainPage.standBy(By.id("accordion__panel-7"));
        assertEquals(mainPage.questionText[7], driver.findElement(By.id("accordion__panel-7")).getText());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
