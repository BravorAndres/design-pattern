package com.objetcpool.app.impl.poolable;


public interface IPooledObject {
    public boolean validate();
    public void invalidate();
}
