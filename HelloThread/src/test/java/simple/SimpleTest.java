package simple;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/11 11:05
 * @Description: null
 */
public class SimpleTest {
    UseThread useThread = new UseThread();
    @Test
    public void testUserThread() {
        useThread.start();
    }
    @Test
    public void testUserRunnable() {
       new Thread(new UseRunnable()).start();
    }
    @Test
    public void testUserFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        UseFuture userFuture = new UseFuture();
        Future<Integer> submit = executorService.submit(userFuture);
        System.out.println(submit.get());

    }
    @Test
    public void testUserFutureTask() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        UseFuture userFuture = new UseFuture();
        FutureTask<Integer> futureTask = new FutureTask<>(userFuture);
        executorService.submit(futureTask);
//        System.out.println(submit.get());
        System.out.println(futureTask.get());

    }
}
