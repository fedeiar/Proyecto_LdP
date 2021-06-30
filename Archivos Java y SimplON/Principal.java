public class Principal {
	
    public static void main(String[] args){
        A oA; int x1, x2;                     
        oA = new C();                        
        oA.init();
        x1 = Sistema.read(); x2 = Sistema.read();
        Sistema.print(oA.m2(x1,x2));
        asignacionCondicional();
    }

    private void asignacionCondicional(){
        int valor = 11;
	    int result = (valor > 8) ? 1 : 0;
    }
  }
  