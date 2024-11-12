package chapter3;

import java.util.Map;
import java.util.List;

public abstract class  Constraint <V,D>{
    protected List<V> variables;
    public  Constraint(List<V> variables){
        this.variables=variables;
    }
    public abstract boolean satisfied(Map<V,D> assignment);
}
