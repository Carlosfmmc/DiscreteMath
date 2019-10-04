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
            
        };
        Serie serie = new Serie(fibonachi);
    }
    
}
