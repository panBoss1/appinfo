package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lizhou.TestEntity;

public class AOPtest {
	@Test
	public void test(){
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		TestEntity testentity=(TestEntity)context.getBean("entity");
		testentity.showValue();
	}
	
}
