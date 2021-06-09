public class A {
    int v1, v2;

	public void init() {
		v1 = 3;
		v2 = 6;
 	}
	
	public void m1() {
	    int i = 0;
	    
	    while( (v2>v1 | v1+v2 >= 5) & i<50){
			i = i+1;
			v1 = ((v1-i)*v2)/i;
			if(v1+v2+i > v2*i){
				continue;
			}
			v2 = ((v2+3)*(5+i))/i;
	    }
	 }
	
	public int m2(int x, int y) {
	    v1 = v1+x;
		v2 = v2+y;
		this.m1();
        return v1+v2;
	}

}
