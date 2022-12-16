package com.objetcpool.app.impl;

public interface IObjectPool<T extends IPooledObject>{
    public T getObject() throws PoolException;
    public void releaceObject(T pooledObject);
}
