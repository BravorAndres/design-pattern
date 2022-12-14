package com.objetcpool.app.impl.poolable;

import com.objetcpool.app.impl.IPooledObject;


public class ExecutorTask implements IPooledObject{

    private int uses;
    private static int invalidate;
    private static int counter;

    public void execute(){
        int c = ++counter;
        uses++;
        System.out.println("execute -->"+c);
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.println("Execute end -->"+c);
        }
    }

    @Override
    public boolean validate() {
        return uses<2;
    }

    @Override
    public boolean invalidate() {
        invalidate++;
        System.out.println("invalidate counter -->"+invalidate);
        return false;
    }


    
    
}
