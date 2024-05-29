# Recursion

### Activity

This activity will explore recursion, using a provided linked list implementation, AtaLinkedList, which uses AtaNode objects to store the elements in the list. First, we’ll explore the implementation and structure of ATALinkedList, then we will focus on developing a recursive algorithm to compute the sum of the elements in the list.

### Phase 1 : Explore AtaLinkedList and AtaNode

For today’s purposes, when we say, “an AtaLinkedList represented by [1.1] -> [2.2] -> null”, we mean an AtaLinkedList with two AtaNodes, where AtaLinkedList’s head points to an AtaNode with data = 1.1, and that node’s next points to another AtaNode with data = 2.2. The node with data = 2.2 is the tail node, because it’s next points to null.

And here is some of the starter code for AtaLinkedList and AtaNode.
AtaLinkedList.java:

```
/**
 * A bare-bones singly-linked list implementation
 */
public class AtaLinkedList {
    private AtaNode head;
    private AtaNode tail;

    /**
     * Constructs a new, empty linked list.
     */
    public AtaLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Methods such as addFirst, addLast, etc.
}
AtaNode.java:
/**
 * An individual node in a singly-linked AtaLinkedList, containing a Double
 * as the data of each element.
 */
public class AtaNode {
    private Double data;
    private AtaNode next;

    /**
     * Constructs a new node.
     * @param data The data to be contained in the node
     * @param next Reference to the next node in the list
     */
    public AtaNode(final Double data, final AtaNode next) {
        this.data = data;
        this.next = next;
    }

    // GETTERS and SETTERS
}
```

#### Questions 
  - What is the size (how many node objects are in the list) of the AtaLinkedList represented by [1.1] → null?
  - What is the value of head in the AtaLinkedList represented by [1.1] → null?
  - Which member variables does AtaNode contain? What is each for?
  - For the head AtaNode in the AtaLinkedList represented by [1.1] -> [2.2] -> [3.3] -> null, what is the value of next?
  - For the head AtaNode in the AtaLinkedList represented by [1.1] -> null, what is the value of next?
  - Does a single AtaNode in an AtaLinkedList know the following items:
  - Does it know if it is the head of the list?
  - Does it know if it is the tail of the list?
  - Does it know the total length of the list?
  - If we had a reference to an AtaNode, how could we find the last node in the list?

### Phase 2 : Recursively defining sum()

Here is a little more of the implementation of AtaLinkedList:

```
AtaLinkedList.java:
/**
 * A bare-bones singly-linked list implementation
 */
public class AtaLinkedList {
    private AtaNode head;
    private AtaNode tail;

    /**
     * Constructs a new, empty linked list.
     */
    public AtaLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Add an entry as the new first element in the list
     * @param data The new value to add at the head of the list
     */
    public void addFirst(final Double data) {
        AtaNode newHead = new AtaNode(data, head);
        this.head = newHead;
        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    /**
     * Add an entry as the new last element in the list
     * @param data The new value to add at the tail of the list
     */
    public void addLast(final Double data) {
        AtaNode ataNode = new AtaNode(data, null);

        if (this.head == null) {
            this.head = ataNode;
            this.tail = head;
        } else {
            this.tail.setNext(ataNode);
            this.tail = this.tail.getNext();
        }
    }

    /**
     * Computes and returns the sum of all Double elements in the list
     * @return The sum
     */
    public Double sum() {
        // implementation
    }
   
    // Additional methods
}
```

#### Questions 
  - What is the sum of the AtaLinkedList represented by [1.1] -> [2.2] -> [3.3] → null?
  - We add AtaNode newNode at the head of the [1.1] -> [2.2] -> [3.3] → null list. What is the new sum? Write your response in terms of newNode.getData() and sum (to represent the sum computed in the previous question).
  - What data type do I need to pass to my recursive method?
  - Take a look at the sum() method header specified above. This method header can’t be changed. Does that mean we can use the sum() method for our recursive cases or do we need to create a helper method that sum() calls?
  - What is the base case of this recursive algorithm of computing the sum of an AtaLinkedList?
  - What is the return value in the base case?


### Phase 3 : Implementing sum()

Write pseudocode for a recursive algorithm to compute the sum of a list specified by the head AtaNode of the list.
Take a look at the sum() method declaration in AtaLinkedList. Note that sum() will have no input arguments, so you are now defining a recursive helper method that sum() will call. Let’s name your recursive method sumRecursive().

You may use node.getData(), node.getNext(), and sumRecursive() in your pseudocode if you like.
Individually implement sum() in the AtaLinkedList class in the com.amazon.ata.recursion.classroom package. You can use the SumTest file to test if your algorithm is working correctly. If the tests never finish running it probably means you are missing a base case and are trying to recurse infinitely. 

### Phase 4 : Bring it back now y’all

Next, we’ll implement reverse(), which returns a new list with the same elements in reverse order. This means that you should not modify the original list or manipulate the AtaNode objects directly, including changing head, tail, any next pointers, or data values.

#### Questions
  - What is the reverse of the AtaLinkedList represented by [1.1] -> [2.2] -> [3.3] -> null?
  - What is the reverse of the AtaLinkedList represented by [1.1] → null?
  - What is the reverse of an empty AtaLinkedList?
  - What is the head value of an empty AtaLinkedList?
  - What might be the base case? What would be the easiest possible list to “reverse”?
  - What should we return in the base case?
  - What should we pass to our recursive case? How can we make this problem smaller step by step?
  - Take a look at the reverse() method in the AtaLinkedList class. Does this match the input type to the reverse() method or do we need to define a recursive helper method?
  - Take a look at the addFirst and addLast methods of AtaLinkedList. What is the type of the method parameters?
   - If we had the head node, and someone magically gave us the reverse of rest of the list as a variable reversedList, what would we do with the head node to finish reversing the list?


### Phase 4 Extension
Let’s take this approach, where we build the list from the tail first, but is there another approach we could take where we start by adding the head node to the reversed list first? What would that look like?

### Phase 5 : REVERSE! REVERSE!

Individually implement reverse() in the AtaLinkedList class in the com.amazon.ata.recursion.classroom package. You can use the ReverseTest file to test if your algorithm is working correctly. If the tests never finish running or have an OutOfMemoryError, it probably means you are missing a base case and are trying to recurse infinitely. If your tests are failing without any error message, you may need to click on a link to see the OutOfMemoryError. If you’re done early check with your teammates to see if you can help.

### Extensions

Done early? Consider these questions:

  - Draw the stack frame when calling the recursive sum() implementation on a list represented by [1.1] -> [2.2] -> [3.3] -> null immediately before the base case returns.
  - How could you use recursion to calculate the number of leaves on a tree? (Think about the root and trunk, leading to branches which then branch off again and again until you get to the leaves.)
  - Implement the following methods recursively on the AtaLinkedList:
    - size(), which calculates how many elements are present in the AtaLinkedList
    - contains(double number), which determines if the number specified is contained in the AtaLinkedList
    - max(), which returns the largest Double in the AtaLinkedList
  - Update hashCode() to a recursive implementation.
  - Update equals(Object o) to a recursive implementation. This one is more challenging!
  - Update toString() to a recursive implementation.
  - Write a main method or unit tests to validate your implementation.
  - Try writing a recursive implementation of merge sort
