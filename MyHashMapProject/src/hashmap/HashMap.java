package hashmap;

public class HashMap <K, V>
{
  Object[] elements;
  
  public HashMap ()
  {
    elements = new Object[15];
  }
  
  @SuppressWarnings("unchecked")
  public void put(K key, V value)
  {
    // 1. hash it
    // 2. get an index
    // 3. put it into array
    
    int hashCode = key.hashCode();
    
    int index = Math.abs(hashCode % elements.length);
    
    Entry<K, V> entry = new Entry<>(hashCode, key, value);
    
    if (elements[index] == null)
    {
      elements[index] = entry;
    }
    else
    {
      Entry<K,V> node = (Entry<K, V>) elements[index];
      while (node.getNext() != null)
      {
        node = node.getNext();
      }
      node.setNext(entry);
    }
    
  }

  @SuppressWarnings("unchecked")
  public V get(K key)
  {
    // 1. hash it
    // 2. get an index
    // 3. search for correct hashcode/key in Entry LinkedList
    int hashCode = key.hashCode();
    
    int index = Math.abs(hashCode % elements.length);
    
    if (elements[index] != null)
    {
      Entry<K,V> node = (Entry<K, V>) elements[index];
      Entry<K,V> next = node.getNext();
      while (node != null)
      {
        if (node.getHashCode() == hashCode)
        {
          if (key.equals(node.getKey()))
          {
            return node.getValue();
          }
        }
        node = next;
        next = next.getNext();
      }
    }
    return null;
    
    
  }

}
