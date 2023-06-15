import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Classroom implements Iterable<Student>
{
    private List<Student> list=null;
    public Classroom()
    {
        list = new LinkedList<Student>();
        list.add(new Student("aparna",20));
        list.add(new Student("anu",30));
    }

    @Override
    public Iterator<Student> iterator() {
        return list.iterator();
    }
}
