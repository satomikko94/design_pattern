import java.io.*;
import java.util.Properties;


public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        FileInputStream in = new FileInputStream(filename);
        load(in);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        FileOutputStream out = new FileOutputStream(filename);
        String header = "written by FileProperties";
        store(out,header);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public void getValue(String key) {
        getProperty(key);
    }

}
