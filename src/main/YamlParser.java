package main;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class YamlParser {
    private YamlParser(){}
    public static Server yamlParser(String passToFile) throws FileNotFoundException {
        Yaml yaml = new Yaml(new Constructor(Server.class));
        InputStream inputStream = new FileInputStream(passToFile);
        return yaml.load(inputStream);
    }
}
