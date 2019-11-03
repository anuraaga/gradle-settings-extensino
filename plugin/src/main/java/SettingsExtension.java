import org.gradle.api.provider.Property;

public interface SettingsExtension {
    Property<String> getValue();
}
