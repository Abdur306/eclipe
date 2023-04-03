package GhoustAssignment;

public class ClassDemo4 {

	public static void main(String[] args) {
		 Demo obj=new Demo();
		 obj.met(20, 30, "hello");
int []a=new int[] {10,20,30,40};
obj.met2(a);
obj.met2(new int [] {10,20,30,40,50});
obj.met3(120,34,56,67,78);
int b[]=obj.met3(20,30,40,78778,9898);
for(int i:b) {
	System.out.println("........."+i);
}
obj.met4("aaa",23432,"affds",new Demo());

}
	}

class Demo{
	void met(int i,int j,String s) {
		System.out.println(i+":"+j+":"+s);
	}
	void met2(int a[]) {
		for(int i=0;i<a.length;++i) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}
	}
	int [] met3(int ...abc) {
		for(int i:abc) {
			System.out.println(i);
		}
		return abc;
	}
	void met4(Object ...o) {
		
	}
}
