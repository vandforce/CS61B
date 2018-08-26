public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(2));
	}
/*  迭代方法
	public int get(int i){
		IntList p = this;
		while (i!=0){
			p=p.rest;
			i=i-1;
		}
		return p.first;
	}
	*/

/* 递归方法*/
	public int get(int i){
		if(i == 1){
			return this.first;
		}
		return this.rest.get(i-1);
	}

}