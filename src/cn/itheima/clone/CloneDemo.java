package cn.itheima.clone;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("zhang",23);
		Person p1 = (Person) p.clone();
		String result = p.getName() == p1.getName() 
				? "clone是浅拷贝的" : "clone是深拷贝的";
		System.out.println(result);
	}
}
