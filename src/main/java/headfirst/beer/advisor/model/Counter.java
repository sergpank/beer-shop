package headfirst.beer.advisor.model;

public class Counter
{
  private static int CNT;

  public static int getCount()
  {
    return ++CNT;
  }
}
