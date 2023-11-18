package com.enset.Adapter.classType;

public class adapter extends OldImplementation implements Strandard{
    @Override
    public void operation() {
        System.out.println("adapted operation");
        op();
    }
}
