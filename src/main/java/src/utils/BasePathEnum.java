package src.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BasePathEnum {
    BASE_URL("http://uitestingplayground.com/"),
    CHROME_DRIVER_PATH("..\\automation-task-selenium\\src\\main\\resources\\chromedriver.exe");

    @Getter
    private final String path;
}
