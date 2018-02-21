import org.junit.*;




public class StackImpl<T> implements Stack {
    private int limit;
    private int p;
    private T[] data;

    public void setLimit(int var)
    {
        this.limit = var;
    }
    public int getLimit()
    {
        return this.limit;
    }

    public int size(){
        return p;
    }
    public boolean plena(){
        if(p==limit)
            return true;
        else return false;
    }

    public StackImpl(int num)
    {
        data= (T[])new Object[num];
        setLimit(num);
    }

    public void push(T t) throws PilaPlenaException{
        if(this.plena())
        {
            throw new PilaPlenaException();
            this.data[this.p++]=t;
        }
    }
}
