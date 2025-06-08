package bean.circular.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Alphabet1 implements Alphabet {
    private final Alphabet2 alphabet2;

    @Autowired
    public Alphabet1( Alphabet2 alphabet2) {
        this.alphabet2 = alphabet2;
    }
    @Override
    public void dosome()
    {
    	System.out.println("A is doing task");
    }
}

