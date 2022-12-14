package com.objetcpool.app.impl;

public interface IPooledObject {
    public boolean validate();
    public boolean invalidate();
}
