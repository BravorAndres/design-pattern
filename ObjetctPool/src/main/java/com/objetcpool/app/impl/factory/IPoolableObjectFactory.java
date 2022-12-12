package com.objetcpool.app.impl.factory;

import com.objetcpool.app.impl.poolable.IpoolObject;

public interface IPoolableObjectFactory <T extends IpoolObject>{
    public T createNew();
}
