package thread;

import java.util.concurrent.*;

/**
 * Created by liyang21 on 2017/9/24.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(singleThreadExecutor);
        for (int i = 0; i < 5; i++) {
            final int id = i;
            cs.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    Thread.sleep(1000);
                    return id;
                }
            });
        }
        for (int i=0;i<5;i++){
            try {
                System.out.println(cs.take().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        // test


//        Future future = singleThreadExecutor.submit(new Callable<Object>() {
//            public Object call() throws Exception {
//                int result = 0;
//                for (int i = 0; i < 10; i++) {
//                    result += i;
//                    Thread.sleep(200);
//                }
//                return result;
//            }
//        });
//        try {
//            System.out.println("get the result is done?:"+future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        while (future.isDone()) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            System.out.println("get the result=" + future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

    }
}
