package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface MobileConfig extends Config {
    @Key("device")
    @DefaultValue("Pixel 5")
    String getDevice();

    @Key("os_version")
    @DefaultValue("12")
    String getVersion();

    @Key("appUrl")
    String getApp();
}