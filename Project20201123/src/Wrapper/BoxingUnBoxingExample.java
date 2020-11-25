package Wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		System.out.println("-------------------------------");
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입 시 자동 Unboxing
		int value = obj;// 100이라는 소리
		System.out.println("value: " + value);

		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);

		System.out.println("-------------------------------");

		int value4 = Integer.parseInt("10");
		double value5 = Double.parseDouble("3.14");
		boolean value6 = Boolean.parseBoolean("true");

		System.out.println("value4: " + value4);
		System.out.println("value5: " + value5);
		System.out.println("value6: " + value6);

		System.out.println((double) value4 + value5);

		System.out.println("-------------------------------");

		System.out.println("[-128~127 초과값일 경우]");
		Integer obj10 = 300;
		Integer obj20 = 300;

		System.out.println("==결과: " + (obj10 == obj20));
		System.out.println("언박싱후 ==결과: " + (obj10.intValue() == obj20.intValue()));
		System.out.println("equals()결과: " + obj10.equals(obj20));
		System.out.println();

		System.out.println("-------------------------------");

		System.out.println("[-128~127 범위값일 경우]");
		Integer obj30 = 10;
		Integer obj40 = 10;
		System.out.println("==결과: " + (obj30 == obj40));
		System.out.println("언박싱후 ==결과: " + (obj30.intValue() == obj40.intValue()));
		System.out.println("euals 결과: " + obj30.equals(obj40));

	}// end of main
}// end of class