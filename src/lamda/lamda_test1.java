package lamda;

interface MyFunction{
	int calc(int x, int y);
}
interface MyFun2{
	int calcpow(int x);
}
interface MyFun3{
	void print();
}
interface MyFun4{
	int cal_mul(int x, int y);
}

public class lamda_test1 {

	public static void main(String[] args) {
//		int age=10;
//		age -> System.out.println("³ªÀÌ´Â " + age);

//		MyFunction f =(x, y) -> { return x+y; };
//		System.out.println(f.calc(1, 2));
//		
//		MyFunction ff = (x,y) -> x-y;
//		System.out.println(ff.calc(1, 2));
//		
//		MyFun2 square = x-> x*x;
//		System.out.println(square.calcpow(2));
		
//		MyFun3 f = () -> { System.out.println("Hello!!");};
//		f.print();
//		
//		f = () -> System.out.println("¾È³ç");
//		f.print();
		
		printMultiply(3,4, (x,y)->x*y);
		
		
	}

	static void  printMultiply(int x, int y, MyFun4 mulf) {
		System.out.println(mulf.cal_mul(x, y));
	}
}
