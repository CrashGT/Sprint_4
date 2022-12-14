import elements.page.MainPage;
import elements.page.OrderForWhomPage;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.startsWith;

@RunWith(Parameterized.class)
public class TestSuccessfulOrder {
    public static By metroStation = By.xpath(".//button[@value='1']");
    public static By colorScooterGrey = By.xpath("//*[@id='grey']");
    public static By colorScooterBlack = By.xpath("//*[@id='black']"); //Чёрный цвет
    public static By orderButton = By.xpath(".//button[(@class = 'Button_Button__ra12g' and (text()='Заказать'))]");   //Кнопка "Заказать" в верхнем углу страницы
    public static By downOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");   //Кнопка "Заказать" внизу страницы
    private String expectedTextSuccessOrder = "Заказ оформлен";
    private WebDriver driver;
    private final By buttonOrder, station, color;
    private final int month, period;
    private final String name, surname, addres, number, comment;

    public TestSuccessfulOrder(By buttonOrder, By station, By color, int month, int period, String name, String surname, String addres, String number, String comment) {
        this.buttonOrder = buttonOrder;
        this.station = station;
        this.color = color;
        this.month = month;
        this.period = period;
        this.name = name;
        this.surname = surname;
        this.addres = addres;
        this.number = number;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getCities() {
        //Сгенерируй тестовые данные (нам нужно название городов и результат поиска)
        return new Object[][]{
                {orderButton, metroStation, colorScooterBlack, 0, 1, "Евгений", "Понасенков", "Малая монетная", "78005553535", "Самый эстетичный"},
                {downOrderButton, metroStation, colorScooterGrey, 1, 2, "Кто-то", "Прекрасный", "Большая", "79539111111", "Поскрее"},
        };
    }



    @Test
    public void order() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        MainPage mainPage = new MainPage(driver);
        OrderForWhomPage orderForWhomPage = new OrderForWhomPage(driver);
        mainPage.openDomen();
        orderForWhomPage.clickOnOrderButton(buttonOrder);
        orderForWhomPage.setOrderForWhom(name, surname, addres, number);
        orderForWhomPage.setStationOrder(station);
        orderForWhomPage.clickNextOrderButton();
        orderForWhomPage.setNextMonthDateButton(month);
        orderForWhomPage.setPeriod(period);
        orderForWhomPage.setColorScooter(color);
        orderForWhomPage.setComment(comment);
        orderForWhomPage.clickNextOrderButton();
        orderForWhomPage.yesButtonClick();
        String actualTextSuccessOrder = orderForWhomPage.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа отличается", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
