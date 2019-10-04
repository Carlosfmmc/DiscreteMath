package discretemath;

public class DiscreteMath {

    public static void main(String[] args) {
        RecursiveFunction fibonachi = new RecursiveFunction() {

            @Override
            public int getN(int n) {
                if(n>1){
                    return getN(n-2)+getN(n-1);
                }
                return 1;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
            
        };
        
        Serie serie = new Serie(fibonachi, 10);
        System.out.println("Fibonachi");
        for (Integer n : serie) {
            System.out.println(n);
        }
    }
    
}
