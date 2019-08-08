package headfirst.beer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TEST
{
  public static void main(String[] args)
  {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:appContext.xml");
    ctx.refresh();

    String property1 = ctx.getBean("property1", String.class);
    String property2 = ctx.getBean("property2", String.class);

    System.out.println(property1);
    System.out.println(property2);
  }
}
