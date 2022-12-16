package com.objetcpool.app.impl.factory;


import com.objetcpool.app.impl.poolable.ExecutorTask;

public class ExecutorTaskFactory  implements IPoolableObjectFactory<ExecutorTask>{
    public ExecutorTask createNew(){
        return new ExecutorTask();
    }
}




