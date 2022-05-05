package ru.yandexMarket;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Base page class
 */
public interface CatalogYandex {
    ElementsCollection yandexService = $$x("//li[@class='services-new__list-item']//a[@href]");
    SelenideElement mainCatalog = $x("//button[@id='catalogPopupButton' and @aria-label='Каталог' ]");
    ElementsCollection yandexMaretServices = $$x("//div//ul//li[@data-zone-name='category-link']//a[@href]");
    ElementsCollection subservices = $$x("//ul[@data-autotest-id='subItems']//a[@href]");
    SelenideElement loadPage = $x("//aside");
    ElementsCollection manufacture = $$x("//legend[text()='Производитель']//following-sibling::ul//li//label");
    SelenideElement dropDownButton = $x("//button[contains(@id, 'dropdown-control')]");
    SelenideElement items12check = $x("//button[contains(text(), 'Показывать по 12')]");
    SelenideElement loader = $x("//div[@class='_12KyU _38i7T' and @data-tid='8bc8e36b']");
    ElementsCollection elementsCollection = $$x("//article//h3//a[@title]//span");
    SelenideElement buttonNext = $x("//button[text()='Показать ещё']");
    SelenideElement loaderButton = $x("//button[@data-tid='86941c28' and @disabled]");
    ElementsCollection rezalts =  $$x("//article//h3//a[@title]//span");
    SelenideElement buttonWatchAll = $x("//legend[text()='Производитель']/..//button[text()='Показать всё']");
}
