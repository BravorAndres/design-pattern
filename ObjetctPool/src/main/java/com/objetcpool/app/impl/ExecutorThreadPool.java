package com.objetcpool.app.impl;

import com.objetcpool.app.impl.poolable.ExecutorTask;
import com.objetcpool.app.impl.factory.IPoolableObjectFactory;

public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask>{

    public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime, 
            IPoolableObjectFactory<ExecutorTask> poolableObjectFactory) {
        super(minInstances, maxInstances, waitTime, poolableObjectFactory);
    }
}
