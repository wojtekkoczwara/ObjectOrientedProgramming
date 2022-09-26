package Exercises.Exercise49AbstractClass;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.rightLink = listItem;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.leftLink = listItem;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if( listItem != null){
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        } else {
            return -1;
        }
    }
}
