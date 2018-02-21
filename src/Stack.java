/**
 * Created by jordi on 21/02/2018.
 */
public interface Stack<T> {
    public void push(T t) throws PilaPlenaException;
    public T pop() throws PilaBuidaException;
    public int size();
}
