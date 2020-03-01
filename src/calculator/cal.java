package calculator;

public class cal {
public static int add(int a,int b) {
	return a+b;
	
}
public static int sub(int a,int b) {
	return a-b;
}
public static int mult(int a,int b) {
	return a*b;
}
public static float div(int a,int b) {
	return a/b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x,y,z,m=9,n=8;
         float v;
         x=add(m,n);
         y=sub(m,n);
         z=mult(m,n);
         v=div(m,n);
	}

}
