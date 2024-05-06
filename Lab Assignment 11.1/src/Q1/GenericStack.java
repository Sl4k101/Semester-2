public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {
      return list.size();
  }

  public E peek() {
      return list.get(getSize() - 1);
  }

  public void push(E o) {
      list.add(o);
  }

  public E pop() {
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
  }

  public boolean isEmpty() {
      return list.isEmpty();
  }
  
  public int search(E o) {
      int index = list.lastIndexOf(o);
      if (index >= 0) {
          return getSize() - index;
      } else {
          return -1;
      }
  }
  
  @Override
  public String toString() {
      return "Queue: " + list.toString();
  }
}
