package cool.spongecaptain;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Spongecaptain
 * @created: 2020/08/29 20:18
 */

@Component("sponge")
public class MyBean {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + age;
	}
}