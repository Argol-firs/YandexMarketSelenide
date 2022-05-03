package ru.yandexMarket;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Base page class
 */
public class CatalogYandex {
    private String yandexService = "//li[@class='services-new__list-item']//a[@href]";
    private String mainCatalog = "//button[@id='catalogPopupButton' and @aria-label='Каталог' ]";
    private String yandexMaretServices = "//div//ul//li[@data-zone-name='category-link']//a[@href]";
    private String subservices = "//ul[@data-autotest-id='subItems']//a[@href]";
    private String loadPage = "//aside";
    private String manufacture = "//legend[text()='Производитель']//following-sibling::ul//li//label";
    private String dropDownButton = "//button[contains(@id, 'dropdown-control')]";
    private String items12check = "//button[contains(text(), 'Показывать по 12')]";
    private String loader = "//div[@class='_12KyU _38i7T' and @data-tid='8bc8e36b']";
    private String elementsCollection = "//article//h3//a[@title]//span";
    private String buttonNext = "//button[text()='Показать ещё']";
    private String loaderButton = "//button[@data-tid='86941c28' and @disabled]";
    private String rezalts = "//article//h3//a[@title]//span";

    public ElementsCollection getRezalts() {
        return $$x(rezalts);
    }

    public SelenideElement getButtonNext() {
        return $x(buttonNext);
    }

    public SelenideElement getLoaderButton() {
        return $x(loaderButton);
    }

    public SelenideElement getMainCatalog() {
        return $x(mainCatalog);
    }

    public ElementsCollection getYandexMaretServices() {
        return $$x(yandexMaretServices);
    }

    public ElementsCollection getSubservices() {
        return $$x(subservices);
    }

    public ElementsCollection getManufacture() {
        return $$x(manufacture);
    }

    public ElementsCollection getYandexService() {
        return $$x(yandexService);
    }

    public String getLoadPage() {
        return loadPage;
    }

    public SelenideElement getDropDownButton() {
        return $x(dropDownButton);
    }

    public SelenideElement getItems12check() {
        return $x(items12check);
    }

    public SelenideElement getLoader() {
        return $x(loader);
    }

    public ElementsCollection getElementsCollection() {
        return $$x(elementsCollection);
    }
}
