package hashmap;

import org.junit.Test;

public class LearningTests
{
  @Test
  public void hash_code_checking ()
  {
    int first = "My First String".hashCode();
    System.out.println(first);
    System.out.println(Math.abs(first % 15));
    int second = "My Second String".hashCode();
    System.out.println(second);
    System.out.println(Math.abs(second % 15));
    int third = "My Third String".hashCode();
    System.out.println(third);
    System.out.println(Math.abs(third % 15));
    int seventh = "My Seventh String".hashCode();
    System.out.println(seventh);
    System.out.println(Math.abs(seventh % 15));
    
  }
}
