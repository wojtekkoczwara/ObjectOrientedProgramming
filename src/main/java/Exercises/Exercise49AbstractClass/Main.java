package Exercises.Exercise49AbstractClass;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        stringData = "5 6 6 3 4 1 7 8 9";
        String[] data = stringData.split(" ");
        for (String s: data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        

    }
}
