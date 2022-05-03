package ru.yandex;

import Assertions.Assertions;
import custom.properties.TestData;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import Steps.Steps;
import static com.codeborne.selenide.Selenide.*;

public class MainTest extends BaseTest{


    @Feature("Проверка ЯндексМаркета")
    @DisplayName("Проверка результата поиска товара на ЯндексМаркете")
    @ParameterizedTest(name = "{displayName} {arguments}")
    @CsvSource("Маркет, Электроника, Смартфоны, Xiaomi, Xiaomi")
    public void yandexMarket(String services, String serviceYandex, String submenu, String manufacture, String mark) {
        open(TestData.propsUrl.baseURLYandex());

        Steps page = new Steps();

        Assertions.assertTrue(page.getYandexService().toString().contains(services), "Яндекс не располагает сервисом " + services);
        page.goLinkByName(services);
        page.clickCatalog();
        Assertions.assertTrue(page.getMainCatalog().exists(), "Каталог товаров не доступен");
        page.goLinkByNameService(serviceYandex);
        page.goLinkByNameSubService(submenu);
        page.checkManufacturer(manufacture);
        page.openDropDownMenu();
        page.click12Items();
        page.clickNextPage();
        Assertions.assertTrue(page.getRezalts().toString().contains(mark), "В списке присутствует не только смартфоны марки " + mark);
    }
}
