package discretemath;

import java.util.Iterator;

class Serie implements Iterable<Integer>{
    
    private RecursiveFunction r;
    private int maxIteration = -1;
    private int n = 0;
    
    public Serie(RecursiveFunction r) {
        this.r = r;
    }

    public Serie(RecursiveFunction r, int maxIteration) {
        this.r = r;
        this.maxIteration = maxIteration;
    }

    public int getMaxIteration() {
        return maxIteration;
    }

    public void setMaxIteration(int maxIteration) {
        this.maxIteration = maxIteration;
    }
        
    @Override
    public Iterator iterator() {
        return i;
    }
    private Iterator<Integer> i = new Iterator<Integer>() {

        @Override
        public boolean hasNext() {
            return n != maxIteration;
        }

        @Override
        public Integer next() {
            return r.getN(++n);
        }
    };
    
}
