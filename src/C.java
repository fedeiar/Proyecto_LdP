public class C extends B{
    B v3;

    public void init(){
        super.init();
        v3 = new B();
        v3.init();
    }

    public void m1(){
        super.m1();
        v1 = v1+this.m2(5+v3.m2(v1,v2));
    }    
}
