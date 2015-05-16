package ex14_10;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Copyright (C) 2012, 2013 RICOH Co., Ltd. All rights reserved.
 */

/**
 * Simple Thread Pool class.
 *
 * This class can be used to dispatch an Runnable object to
 * be executed by a thread.
 *
 * [Instruction]
 *  Implement one constructor and three methods.
 *  Don't forget to write a Test program to test this class. 
 *  Pay attention to @throws tags in the javadoc.
 *  If needed, you can put "synchronized" keyword to methods.
 *  All classes for implementation must be private inside this class.
 *  Don't use java.util.concurrent package.
 */
public class ThreadPool {
	private final Queue<Runnable> queue;
	private final WorkingThread[] pool;
	private final int queueSize;
	private boolean working = false;

	
    /**
     * Constructs ThreadPool.
     *
     * @param queueSize the max size of queue
     * @param numberOfThreads the number of threads in this pool.
     *
     * @throws IllegalArgumentException if either queueSize or numberOfThreads
     *         is less than 1
     */
    public ThreadPool(int queueSize, int numberOfThreads) {
    	if(queueSize < 1 || numberOfThreads < 1){
    		throw new IllegalArgumentException();
    	}
    	this.queue = new LinkedList<Runnable>();
    	this.pool = new WorkingThread[numberOfThreads];
    	this.queueSize = queueSize;
    	for(int i = 0; i < numberOfThreads; i++){
    		pool[i] = new WorkingThread();
    	}
    }

    /**
     * Starts threads.
     *
     * @throws IllegalStateException if threads has been already started.
     */
    public void start() {
    	if(working){
    		throw new IllegalStateException();
    	}
    	working = true;
    	for(WorkingThread wt : pool){
    		try{
    			wt.start();
    		} catch(IllegalStateException e){
    			throw new IllegalStateException(e);
    		}
    	}
    }

    /**
     * Stop all threads and wait for their terminations.
     *
     * @throws IllegalStateException if threads has not been started.
     */
    public void stop() {
    	if(!working){
    		throw new IllegalStateException();
    	}
    	working = false;
    	for(WorkingThread wt : pool){
    		wt.stopRequest();
    		try{
    			wt.join();
    		} catch(InterruptedException e){
    			e.printStackTrace();
    		}
    	}
    }

    /**
     * Executes the specified Runnable object, using a thread in the pool.
     * run() method will be invoked in the thread. If the queue is full, then
     * this method invocation will be blocked until the queue is not full.
     * 
     * @param runnable Runnable object whose run() method will be invoked.
     *
     * @throws NullPointerException if runnable is null.
     * @throws IllegalStateException if this pool has not been started yet.
     */
    public synchronized void dispatch(Runnable runnable) {
    	if(runnable == null){
    		throw new NullPointerException();
    	}
    	if(!working){
    		throw new IllegalStateException();
    	}
    	synchronized(queue){
    		while(queue.size() > queueSize){
    			try {
    				queue.wait();
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    		queue.offer(runnable);
    		queue.notifyAll();
    	}
    }
    
    private class WorkingThread extends Thread{
    	public synchronized void stopRequest(){
    		synchronized(queue){
    			queue.notifyAll();
    		}
    	}
    	@Override
    	public void run(){
			Runnable runnable;
			while (working) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						if (working) {
							try {
								queue.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						if (!working && queue.isEmpty())
							return;
					}
					runnable = queue.poll();
					queue.notifyAll();
				}
				runnable.run();
				
				try {
					sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
    	}
    }
}
