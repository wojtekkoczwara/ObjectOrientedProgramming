package Exercises.Exercise49AbstractClass;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem listItem);
    boolean removeItem(ListItem listItem);

    void traverse(ListItem root);

}
