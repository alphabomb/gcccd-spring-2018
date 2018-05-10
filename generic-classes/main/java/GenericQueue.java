import java.util.ArrayList;

public class GenericQueue<T>
{
    private final ArrayList<T> elements;

    public GenericQueue()
    {
        this(10);
    }

    public GenericQueue(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);
    }

    public void enqueue(T queueValue)
    {
        elements.add(elements.size()-1, queueValue);
    }

    public T dequeue()
    {
        if (elements.isEmpty())
            System.out.println("Queue is empty, cannot dequeue");

        return elements.remove(0);
    }

    public int length()
    {
        return elements.size();
    }
}




