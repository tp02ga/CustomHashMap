package hashmap;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class HashMapTests
{
  @Test
  public void should_insert_value_into_hashmap_and_retrieve_it ()
  {
    HashMap<String, Integer> sut = new HashMap<> ();
    
    sut.put("My First String", 1);
    
    assertThat(sut.get("My First String"), is(1));
  }
  
  @Test
  public void should_insert_multiple_values_into_hashmap_and_retrieve_it ()
  {
    HashMap<String, Integer> sut = new HashMap<> ();
    
    sut.put("My First String", 1);
    sut.put("My Second String", 2);
    sut.put("My Third String", 3);
    sut.put("My Seventh String", 7);
    
    assertThat(sut.get("My First String"), is(1));
    assertThat(sut.get("My Second String"), is(2));
    assertThat(sut.get("My Third String"), is(3));
    assertThat(sut.get("My Seventh String"), is(7));
  }
  
}
