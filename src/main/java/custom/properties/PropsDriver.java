package custom.properties;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:driver.properties"
})
public interface PropsDriver extends Config{
    @Key("default.timeout")
    int defaultTimeout();

    @Key("address.chrome.driver")
    String addressChromeDriver();

}
