package trang.bui.selenium.common;

import org.apache.commons.lang3.StringUtils;

public class MyStringUtils {
    //Default Constructor
    private MyStringUtils() {}

    /**
     * Repeat * num times.
     * @param num
     * @return * num times, *******
     */
    public static String asterisk(int num) {
        return StringUtils.repeat("*", num);
    }

    public static String asterisk() {
        return StringUtils.repeat("*", Constants.TITLE_BOX_WIDTH);
    }

    public static String dash() {
        return StringUtils.repeat("-", Constants.TITLE_BOX_WIDTH);
    }


    public static String centerTitleWith$(String title, int size, String padStr) {

        return StringUtils.center(StringUtils.center(title, Constants.TITLE_TEXT_WIDTH, ' '), size, padStr);
    }

    public static String centerTitleWith$(String title) {
        return centerTitleWith$(title, Constants.TITLE_BOX_WIDTH, "$");
    }

    public static String centerTitleWithDash(String title) {
        return centerTitleWith$(title, Constants.TITLE_BOX_WIDTH, "=");
    }

}
