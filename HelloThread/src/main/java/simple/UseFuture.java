package simple;

import java.util.concurrent.Callable;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/11 11:42
 * @Description: null
 */
public class UseFuture implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 54;
    }
}
