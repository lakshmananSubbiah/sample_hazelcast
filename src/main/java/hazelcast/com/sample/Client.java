package hazelcast.com.sample;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = -4870061854652654067L;
	
	private String name;
	
	private Long 	phone;
	
	private String sex;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public Long getPhone() {
		return phone;
	}

	public String getSex() {
		return sex;
	}
	
	
}
