package java_20190730;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		
		//자동 import : ctl + shift + o(영문자)
		// HashSet은 데이터(객체)의 중복을 허용하지않고 순서가 없음.
		//HashSet set = new HashSet();; //선언
		//TreeSet은 데이터(객체)의 중복을 허용하지 않고, 오름차순 정렬한다.
		TreeSet<Integer> set = new TreeSet<Integer>(); //선언
		
		while(true) {
			int random = (int)(Math.random()*45)+1;
			set.add(new Integer(random)); //할당 , auto-boxing(primitive data type => wrapper)
			//hashSet 크기 : size()
			if(set.size()==6) break;
		}
		
		//HashSet의 출력은 Iterator 변경을 해서 출력해야 한다.
		// set 출력하는 방법. 외우기
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {//hasNext() HashSet에 출력할 객체가 존재하는지 판단하는 메서드
			//auto-unboxing : wrapper => primitive data type
			int temp= i.next(); //next() 해당 객체를 가져온다.
			System.out.println(temp+"\t");
			//컬렉션을 쓰면 제네릭을 무조건 씀
		}
	}

}



