package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by vasya on 07.04.2017.
 */
public class Settings {
    private static final Settings INSTANCE = new Settings();

    private final Properties properties = new Properties();

    public Settings() {
        try {
            properties.load(new FileInputStream(this.getClass().getClassLoader().getResource("postgresql.properties").getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Settings getInstance() {
        return INSTANCE;
    }

    public String value(String key) {
        return this.properties.getProperty(key);
    }
}
