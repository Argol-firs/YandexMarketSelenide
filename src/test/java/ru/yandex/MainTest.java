package ru.yandex;

import base.BaseTest;
import custom.properties.TestData;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.*;

public class MainTest extends BaseTest {


    @Feature("Проверка ЯндексМаркета")
    @DisplayName("Проверка результата поиска товара на ЯндексМаркете")
    @ParameterizedTest(name = "{displayName} {arguments}")
    @CsvSource("Маркет, Электроника, Смартфоны, Xiaomi, Xiaomi")
    public void yandexMarket(String services, String serviceYandex, String submenu, String manufacture) {
        open(TestData.propsUrl.baseURLYandex());
        page.getPage().goLinkByName(services);
        page.getPage().clickCatalog();
        page.getPage().goLinkByNameService(serviceYandex);
        page.getPage().goLinkByNameSubService(submenu);
        page.getPage().checkManufacturer(manufacture);
        page.getPage().openDropDownMenu();
        page.getPage().click12Items();
        page.getPage().clickNextPage();
    }
}
