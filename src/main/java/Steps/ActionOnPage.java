package Steps;

import io.qameta.allure.Step;
import ru.yandexMarket.CatalogYandex;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;


public class ActionOnPage implements CatalogYandex {

    @Step("Проверка наличия сервиса {link}")
    public void goLinkByName(String link) {
        yandexService.find(text(link)).click();
        switchTo().window(1);
    }

    @Step("Нажать на каталог")
    public void clickCatalog() {
        mainCatalog.click();
    }

    @Step("Выбрать сервис {linkService}")
    public void goLinkByNameService(String linkService) {
        yandexMaretServices.find(text(linkService)).shouldBe(visible).hover();
    }

    @Step("Выбрать подменю {linkSubService}")
    public void goLinkByNameSubService(String linkSubService) {
        subservices.find(text(linkSubService)).shouldBe(visible).click();
    }

    @Step("Выбрать производителя {nameManufacturer}")
    public void checkManufacturer(String nameManufacturer) {
           manufacture.find(text(nameManufacturer)).shouldBe(visible).click();
    }

    @Step("Открыть выпадающее меню")
    public void openDropDownMenu() {
        dropDownButton.hover().click();
    }

    @Step("Установка показывать 12 элементов на странице")
    public void click12Items() { items12check.click();
    }

    @Step("Пролистывание страниц выборки")
    public void clickNextPage() {
        while (buttonNext.exists()) {
            buttonNext.hover().click();
            loaderButton.waitUntil(disappear, 5000);
        }
    }
}
