package src;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import src.interfaces.CustomRunnable;

/**
 * @author NotLebedev
 */
public class ApplicationRunner {

    private static final Logger LOG = LogManager.getLogger();

    public void runApplication(CustomRunnable applicationInstance) {

        try {
            applicationInstance.run();
        } catch (Throwable e) {
            LOG.error("Exception occured while running " + applicationInstance.getClass().getSimpleName() + " providing stacktrace :\n", e);
        }

    }

}
