package src.nested;

public class Local {
    
    public void run() {
        
        // Local Class
        class Localll {
            private int a;
            
            public Localll(int a) {
                this.a = a;
            }
            
            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
            
        }

        Localll local = new Localll(15);

        System.out.println("Local class worked!");
        System.out.println(local.getA());
    }

    public void print() {
        
    }
}
