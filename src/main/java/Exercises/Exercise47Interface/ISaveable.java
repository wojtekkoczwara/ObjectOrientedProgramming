package Exercises.Exercise47Interface;

import java.util.List;

public interface ISaveable {
    public List<String> write();
    public void read(List<String> list);
}
