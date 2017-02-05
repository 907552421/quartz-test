package leo.test.Beans;
/**
 * Created by kuoyang.liang on 2017/2/5.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName: DemoBean<br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:     2017/2/5 <br/>
 *
 * @author kuoyang.liang
 */

@Component
public class DemoBean {

    final static Logger LOGGER = LoggerFactory.getLogger(DemoBean.class);

    public void print(){
        LOGGER.info("print something");
    }
}
