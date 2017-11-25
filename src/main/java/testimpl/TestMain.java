package testimpl;

import test.Test;

public class TestMain {

	public static void main(String[] args) {
		Test test = new TestImpl();
		String str = "hello word!";
		System.out.println(test.getTest(str));
	}

}
