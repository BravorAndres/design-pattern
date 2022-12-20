package com.objetcpool.app.impl;

import com.objetcpool.app.impl.poolable.IPooledObject;

public interface IObjectPool<T extends IPooledObject> {
    public T getObject() throws PoolException;
    public void releaceObject(T pooledObject);
}