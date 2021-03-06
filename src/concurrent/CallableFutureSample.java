package concurrent;

import java.util.concurrent.*;

/**
 * 
 * @author zhangwei
 *
 * Callable<T>接口与FutureTask<T>接口
 * future可以获取callable线程执行反比后的返回值
 *
 */

public class CallableFutureSample implements Callable<Integer>{
	
	public static void main(String[] args) {
		CallableFutureSample ct = new CallableFutureSample();
		FutureTask<Integer> ft = new FutureTask<>(ct);
		for(int i = 0;i < 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);  
            if(i==20)  
            {  
                new Thread(ft,"有返回值的线程").start();  
            }  
        }  
        try  
        {  
            System.out.println("子线程的返回值："+ft.get());  //ft线程执行完毕后才会执行
        } catch (InterruptedException e)  
        {  
            e.printStackTrace();  
        } catch (ExecutionException e)  
        {  
            e.printStackTrace();  
        } 
	}
	
	@Override
	public Integer call() throws Exception {
		int i = 0;  
        for(;i<100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
        }  
        return i;  
	}
	
}
