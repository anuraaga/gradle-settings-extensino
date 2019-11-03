import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;

public class SettingsPlugin implements Plugin<Settings> {
    @Override
    public void apply(Settings settings) {
        SettingsExtension config = settings.getExtensions().create("config", SettingsExtension.class);
        settings.getGradle().settingsEvaluated(unused -> System.out.println(config.getValue().get()));
    }
}
