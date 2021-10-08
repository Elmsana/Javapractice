package Com.javaConceptsQuestions;

public class collectionsFramework {
/*
    Collections FrameWork
    All collections are iterable(for set it’s an advanced loop).
    And all collections are core interface. sync(means slow) not sync(means fast)

    LIST: Can store duplicate values, maintains /keeps the insertion order.
    It allows any number of null values, from list we can read a certain value by index.
            • ArrayList(not sync), LinkedList(not sync, can work as stack,queue and dequeue)
         and Vector(sync)=>(all are class and it implements list)

    SET: can only store unique values (no duplicates), and does not maintain order
• HashSet(not sync, no order, allow null),
    LinkedHashSet(no sync, ordered, allow null, and maintains double LinkedList)
    and TreeSet(sorted in ascending order(S-L))=>(all are class and it implements Set).
    Sorted set(not sync, ordered, comparable interface and it extends Set )

• I have used Tree set to print dropdown list in for non duplicate values and ascending order
• SortedSet<String> name = new TreeSet<>();


    MAP : is a key+value format and keys are always unique, and value can be duplicated.
    Map read value by passing key, map can have single null key but multiple null values.
• HashTable(sync, no null key or value), LinkedHashMap,HasHMap(not sync, 1 null key,
    multiple null values), TreeMap(sorted in ascending order)=>(all implements Map)

 */
}
