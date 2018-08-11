package cn.itheima.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer,User> users = new HashMap<Integer,User>();
		users.put(1, new User("张三", 25));
		users.put(3, new User("李四", 22));
		users.put(2, new User("王五", 28));
		System.out.println(users);
		
		HashMap<Integer,User> sortHashMap = sortHashMap(users);
		System.out.println(sortHashMap);
	}

	private static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
		Set<Entry<Integer, User>> entrySet = map.entrySet();
		
		return null;
	}
}
