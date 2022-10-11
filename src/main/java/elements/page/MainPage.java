package elements.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    private String domen = "https://qa-scooter.praktikum-services.ru/";
    public By[] questionLocator= {By.xpath(".//div[@aria-controls='accordion__panel-0']") , By.xpath(".//div[@aria-controls='accordion__panel-1']"), By.xpath(".//div[@aria-controls='accordion__panel-2']"), By.xpath(".//div[@aria-controls='accordion__panel-3']"), By.xpath(".//div[@aria-controls='accordion__panel-4']"), By.xpath(".//div[@aria-controls='accordion__panel-5']"), By.xpath(".//div[@aria-controls='accordion__panel-6']"), By.xpath(".//div[@aria-controls='accordion__panel-7']")};
    public String[] questionText = {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", "Да, обязательно. Всем самокатов! И Москве, и Московской области."};

    public void openDomen() {  //Открываем сайт
        driver.get(domen);
    }

    public void scrollToElement(By element) { //скроллим до необходимого элемента
        WebElement desiredElement = driver.findElement(element);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", desiredElement);
    }

    public void standBy(By element) { //Ожидание
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void clickOnQuestionButton(By button) {
        standBy(button);
        scrollToElement(button);
        driver.findElement(button).click();
    }
}
