package hashmap;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class HashMapTests
{
  private static final int BIG_TEST_SIZE = 5000;

  @Test
  public void should_insert_value_into_hashmap_and_retrieve_it()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);

    assertThat(sut.get("My First String"), is(1));
  }

  @Test
  public void should_insert_multiple_values_into_hashmap_and_retrieve_it()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);
    sut.put("My Second String", 2);
    sut.put("My Third String", 3);
    sut.put("My Seventh String", 7);

    assertThat(sut.get("My First String"), is(1));
    assertThat(sut.get("My Second String"), is(2));
    assertThat(sut.get("My Third String"), is(3));
    assertThat(sut.get("My Seventh String"), is(7));
  }

  @Test
  public void should_remove_an_element_from_hashmap()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);
    sut.remove("My First String");
    
    assertNull(sut.get("My First String"));
    
  }
  
  @Test
  public void should_insert_and_remove_multiple_values_from_hashmap()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);
    sut.put("My Second String", 2);
    sut.put("My Third String", 3);
    sut.put("My Seventh String", 7);

    sut.remove("My Third String");
    
    assertThat(sut.get("My First String"), is(1));
    assertThat(sut.get("My Second String"), is(2));
    assertNull(sut.get("My Third String"));
    assertThat(sut.get("My Seventh String"), is(7));
  }
  
  @Test
  public void should_insert_and_remove_multiple_values_from_hashmap_2()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);
    sut.put("My Second String", 2);
    sut.put("My Third String", 3);
    sut.put("My Seventh String", 7);

    sut.remove("My Seventh String");
    
    assertThat(sut.get("My First String"), is(1));
    assertThat(sut.get("My Second String"), is(2));
    assertThat(sut.get("My Third String"), is(3));
    assertNull(sut.get("My Seventh String"));
  }
  
  @Test
  public void should_insert_and_remove_lots_of_elements ()
  {
    HashMap<Integer, Integer> sut = new HashMap<>();
    
    for (int i=0; i<BIG_TEST_SIZE; i++)
    {
      sut.put(i, i+10);
    }
    
    for (int i=0; i<BIG_TEST_SIZE; i++)
    {
      assertThat(sut.get(i), is(i+10));
    }
    
    for (int i=BIG_TEST_SIZE-1; i>=0; i--)
    {
      sut.remove(i);
    }
    
    for (int i=0; i<BIG_TEST_SIZE; i++)
    {
      assertNull(sut.get(i));
    }
  }
  
  @Test
  public void should_try_to_remove_element_that_doesnt_exist ()
  {
    HashMap<String, Integer> sut = new HashMap<>();

    sut.put("My First String", 1);
    sut.put("My Second String", 2);
    sut.put("My Third String", 3);
    sut.put("My Seventh String", 7);
    
    sut.remove("My String");
    
    assertThat(sut.get("My First String"), is(1));
    assertThat(sut.get("My Second String"), is(2));
    assertThat(sut.get("My Third String"), is(3));
    assertThat(sut.get("My Seventh String"), is(7));
  }

}
