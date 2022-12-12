package com.objetcpool.app.impl.poolable;

import com.objetcpool.app.impl.PoolException;

public interface IObjectPool < T extends IpoolOclassbject > {
    public T getObject()throws PoolException;
    public void releaceObject(T pooledObject);   
}
