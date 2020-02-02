package core;

public class Arrayy {
public static void main(String[] args) {
	int a1[]= {1,2,3,4,5,};
	int a2[]= {1,2,3,7,8};
	int i,j;
	for(i=0;i<a1.length;i++) {
		for(j=0;j<a1.length;j++) {
			if(a1[i]==a2[j]) {
				System.out.println(a1[i]);
			}
		}
	}
}
}
