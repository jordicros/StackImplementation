import org.junit.*;


import java.util.Stack;


public class StackImpl<T> impl Stack {
    private int limit;

    public void setLimit(int var)
    {
        this.limit = var;
    }
    public int getLimit()
    {
        return this.limit;
    }

    public StackImpl(int num)
    {
        setLimit(num);
    }

}
