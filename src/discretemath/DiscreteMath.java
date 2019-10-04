package discretemath;

public class DiscreteMath {

    public static void main(String[] args) {
        RecursiveFunction fibonachiMemorization = new RecursiveFunction() {
            private int a = 1;
            private int b =1;
            private int c = 1;
            
            @Override
            public int getN(int n) {
                if(n>1){
                    c = a+b;
                    a = b;
                    b = c;
                    return c;
                }
                return 1;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
            
        };
        
        Serie serie = new Serie(fibonachiMemorization, 10);
        System.out.println("Fibonachi");
        for (Integer n : serie) {
            System.out.println(n);
        }
    }
    
}
