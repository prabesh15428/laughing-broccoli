package core;

public class Array_example {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= new int[5];
	for(int i=0;i<b.length;i++) {
		b[i]=a[i]+1;
		System.out.println(b[i]);
	}
} 

}
