package com.enset.Adapter.ObjectType;

public class adapter  implements Strandard {
    OldImplementation oldImplementation;
    @Override
    public void operation() {
        oldImplementation=new OldImplementation();
        System.out.println("adapted operation");
        oldImplementation.op();
    }
}
