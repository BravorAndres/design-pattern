package com.objetcpool.app.impl.factory;



public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask> {
    public Exexutortask createNew(){
        return ExecutorTask();    
    }
}
