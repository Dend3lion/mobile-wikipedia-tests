package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:emulator.properties"
})
public interface EmulatorConfig extends Config {
    @Key("platformVersion")
    String getPlatformVersion();

    @Key("device")
    String getDevice();

    @Key("appiumServerUrl")
    String getAppiumServerUrl();
}
