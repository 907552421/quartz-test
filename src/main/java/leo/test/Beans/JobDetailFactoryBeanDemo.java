package leo.test.Beans;
/**
 * Created by kuoyang.liang on 2017/2/5.
 */

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * ClassName: JobDetailFactoryBeanDemo<br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:     2017/2/5 <br/>
 *
 * @author kuoyang.liang
 */
public class JobDetailFactoryBeanDemo extends QuartzJobBean {
    final static Logger LOGGER  = LoggerFactory.getLogger(JobDetailFactoryBeanDemo.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        String text = "JobDetailFactoryBeanDemo";
        LOGGER.info("print {}",text);
        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        System.out.println(mergedJobDataMap.get("test"));
    }
}
