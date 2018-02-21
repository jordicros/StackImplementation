/**
 * Created by jordi on 21/02/2018.
 */
public interface Stack<T> {
    T pop() throws PilaBuidaException;
     int size();
    void push(T t) throws PilaPlenaException;
}
