package pattern.createpattern.builder;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class WrapperTest {

    private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    // runState is stored in the high-order bits
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;

    // Packing and unpacking ctl
    private static int runStateOf(int c)     { return c & ~CAPACITY; }
    private static int workerCountOf(int c)  { return c & CAPACITY; }
    private static int ctlOf(int rs, int wc) { return rs | wc; }
    public static void main(String[] args) {
        System.out.println(RUNNING);//-536870912
        System.out.println(SHUTDOWN);
        System.out.println(STOP);
        System.out.println(TIDYING);
        System.out.println(TERMINATED);
        AtomicInteger atomicInteger = new AtomicInteger(ctlOf(-536870912, 0));
        System.out.println(atomicInteger.get());
        System.out.println(runStateOf(RUNNING));;
        System.out.println(runStateOf(SHUTDOWN));;
        System.out.println(runStateOf(STOP));;
        System.out.println(runStateOf(TIDYING));;
        System.out.println(runStateOf(TERMINATED));;

    }


}