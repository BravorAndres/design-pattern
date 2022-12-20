package com.objetcpool.app.impl.factory;

import com.objetcpool.app.impl.poolable.IPooledObject;

public interface IPoolableObjectFactory<T extends IPooledObject> {
    public T createNew();
}