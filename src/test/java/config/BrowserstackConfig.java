package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${deviceHost}.properties"
})
public interface BrowserstackConfig extends Config {
    @Key("device")
    @DefaultValue("Pixel 5")
    String getDevice();

    @Key("os_version")
    @DefaultValue("12.0")
    String getVersion();

    @Key("appUrl")
    String getApp();
}