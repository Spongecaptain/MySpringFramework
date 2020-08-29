package cool.spongecaptain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Spongecaptain
 * @created: 2020/08/29 20:16
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBean sponge = (MyBean) ac.getBean("sponge");
		sponge.setAge(101);
		sponge.setName("captain");
		System.out.println(sponge);
	}
}