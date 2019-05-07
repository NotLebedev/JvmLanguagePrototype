package src;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import src.interfaces.CustomRunnable;

import java.util.Scanner;

/**
 * @author NotLebedev
 */
public class ApplicationRunner {

    private static final Logger LOG = LogManager.getLogger();

    public void runApplication(CustomRunnable applicationInstance) {
new Scanner(System.in).next();
        try {
            applicationInstance.run();
        } catch (Throwable e) {
            LOG.error("Exception occurred while running " + applicationInstance.getClass().getSimpleName() + " providing stacktrace :\n", e);
        }

        double average = 0;
        for(int i = 0; i < 1000; i++) {

            long startTime = System.nanoTime();

            try {
                applicationInstance.run();
            } catch (Throwable e) {
                LOG.error("Exception occurred while running " + applicationInstance.getClass().getSimpleName() + " providing stacktrace :\n", e);
            }

            average = (average * (double) i + ((double)(System.nanoTime() - startTime)))/ ((double)(i+1));

        }

        System.out.println(average / 1000000);

    }

}
