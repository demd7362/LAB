package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
	A a1 = new A(true);
	// A a2 = new A(1); 다른 패키지임 default
	// A a3 = new A("문자열"); 같은 객체가 아님 private
}
