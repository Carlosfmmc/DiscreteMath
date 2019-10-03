package discretemath;

import java.util.Iterator;

class Serie implements Iterable<Integer>{
    
    private RecursiveFuntion r;
    
    public Serie(RecursiveFuntion r) {
        r = r;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
