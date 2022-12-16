package com.objetcpool.app.impl.factory;

import com.objetcpool.app.impl.poolable.IPoolObject;

public interface IPoolableObjectFactory <T extends IPoolObject>{
    public T createNew();
}
