package cn.stt.test;

import cn.stt.util.OSUtil;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2017/12/28.
 */
public class OSUtilTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OSUtilTest.class);

    @Before
    public void getOSInfo() {
        String osName = System.getProperty("os.name");
        LOGGER.info("osName={}", osName);
        String osVersion = System.getProperty("os.version");
        LOGGER.info("osVersion={}", osVersion);
        String osArch = System.getProperty("os.arch");
        LOGGER.info("osArch={}", osArch);
    }

    @Test
    public void checkOS() {
        LOGGER.info("OSUtil.getOSName()={}", OSUtil.getOSName());
        LOGGER.info("OSUtil.isWindows()={}", OSUtil.isWindows());
    }
}
