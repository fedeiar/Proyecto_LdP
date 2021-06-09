public class B extends A{
	int max;

	public void init(){
		super.init();
		v1 = v1*5;
		v2 = v2*5;
		max = 4;
	}

	public int m2(int x){
		if(x < 10 | max == 1){
			super.m1();
			max = 4;
			return v1+(v2-x);
		}
		max = max - 1;
		return this.m2(x / 10);
	}

}
