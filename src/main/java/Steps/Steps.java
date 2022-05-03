package Steps;

import io.qameta.allure.Step;
import ru.yandexMarket.CatalogYandex;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;


public class Steps extends CatalogYandex {

    @Step("Проверка наличия сервиса {link}")
    public void goLinkByName(String link) {
        getYandexService().find(text(link)).click();
        switchTo().window(1);
    }

    @Step("Нажать на каталог")
    public void clickCatalog() {
        getMainCatalog().click();
    }

    @Step("Выбрать сервис {linkService}")
    public void goLinkByNameService(String linkService) {
        getYandexMaretServices().find(text(linkService)).shouldBe(visible).hover();
    }

    @Step("Выбрать подменю {linkSubService}")
    public void goLinkByNameSubService(String linkSubService) {
        getSubservices().find(text(linkSubService)).shouldBe(visible).click();
    }

    @Step("Выбрать производителя {nameManufacturer}")
    public void checkManufacturer(String nameManufacturer) {
        getManufacture().find(text(nameManufacturer)).shouldBe(visible).click();
    }

    @Step("Открыть выпадающее меню")
    public void openDropDownMenu() {
        getDropDownButton().hover().click();
    }

    @Step("Установка показывать 12 элементов на странице")
    public void click12Items() {
        getItems12check().click();
    }

    @Step("Пролистывание страниц выборки")
    public void clickNextPage() {
        while (getButtonNext().exists()) {
            getButtonNext().hover().click();
            getLoaderButton().waitUntil(disappear, 5000);
        }
    }
}
