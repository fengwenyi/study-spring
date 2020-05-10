package com.fengwenyi.study_spring.ioc;

import com.fengwenyi.study_spring.ioc.bean.Bean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Erwin Feng
 * @since 2020/5/10
 */
public class MyTest {

    @Test
    public void testBean() {
        //
        Bean myBean = new Bean();
        System.out.println(myBean);

        // spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean);
    }

}
