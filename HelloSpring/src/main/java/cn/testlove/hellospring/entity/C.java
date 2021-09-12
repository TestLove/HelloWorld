package cn.testlove.hellospring.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/27 12:36
 * @Description: null
 */
@Component
public class C implements BeanFactoryPostProcessor {
    @Autowired
    A a;

    @Override
    public String toString() {
        return "C{" +
                "a=" + a +
                '}';
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
