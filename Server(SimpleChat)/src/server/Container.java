package server;

import java.util.LinkedList;
import java.util.List;

public class Container<T> {

    /** List - elements */
    private List<T> elements;

    /**
     * Make new object Container
     * */
    public Container() {

        this.elements = new LinkedList<>();

    }

    /**
     * This method add element in list
     * @param element value what need to add in list
     * @return boolean value
     * */
    public boolean addElement(T element) {

        return this.elements.add(element);

    }

    /**
     * This method remove element from list
     * @param element value what need to remove from list
     * @return boolean value
     * */
    public boolean removeElement(T element) {

        return this.elements.remove(element);

    }

    /**
     * This method return value of the object elements
     * @return value of the object elements
     * */
    public List getElements() {

        return this.elements;

    }

    /**
     * This method set value of the object elements
     * @param elements value of the object elements
     * */
    public void setElements(List elements) {

        this.elements = elements;

    }

}
