package trang.bui.selenium.common;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Resources {
    private String LOG4J_PATH;
    private String CONFIG_PATH;
    public Resources() {
        LOG4J_PATH = this.getClass().getClassLoader().getResource(Constants.LOG4J_FILE).getPath();
        CONFIG_PATH = this.getClass().getClassLoader().getResource(Constants.CONFIG_FILE).getPath();
    }
}
