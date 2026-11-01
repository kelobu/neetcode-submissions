class DynamicArray {

    int[] elements;
    int numberOfElements;

    public DynamicArray(int capacity) {
        elements = new int[capacity];
        numberOfElements = 0;
    }

    public int get(int i) {
        return elements[i];
    }

    public void set(int i, int n) {
        elements[i] = n;
    }

    public void pushback(int n) {
        if(numberOfElements == elements.length) {
            resize();
        }
        elements[numberOfElements] = n;
        numberOfElements++;
    }

    public int popback() {
        int result = get(numberOfElements - 1);
        set(elements.length - 1, 0);
        numberOfElements--;
        return result;
    }

    private void resize() {
        int[] newElements = new int[elements.length * 2];
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int getSize() {
        return numberOfElements;
    }

    public int getCapacity() {
        return elements.length;
    }
}
