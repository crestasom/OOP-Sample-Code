package interfaceCode;

public class MultipleInterfaceImpl {

}

interface i1 {
	int method();

	int method1();
}

interface i2 {
	int method();

	int method2();
}

class c1 implements i1, i2 {

	@Override
	public int method2() {

		return 2;
	}

	@Override
	public int method() {

		return 12;
	}

	@Override
	public int method1() {

		return 1;
	}

}