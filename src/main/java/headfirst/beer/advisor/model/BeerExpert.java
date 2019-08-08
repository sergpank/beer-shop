package headfirst.beer.advisor.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BeerExpert
{
  @Autowired
  @Qualifier("light")
//  @Value("${light.brand}")
  private String lightBrand;

  @Autowired
  @Qualifier("amber")
//  @Value("${amber.brand}")
  private String amberBrand;

//  @Autowired
//  @Qualifier("brown")
  @Value("${brown.brand}")
  private String brownBrand;

//  @Autowired
//  @Qualifier("dark")
  @Value("${dark.brand}")
  private String darkBrand;

  public List<String> getBrands(String color)
  {
    List<String> brands = new ArrayList<>();
    switch (color)
    {
      case "light":
        brands.add("Paulaner");
        brands.add("Weissburg");
        brands.add("Freebird White");
        brands.add(lightBrand);
        break;
      case "amber":
        brands.add("Abbaye d'Aulne (ADA) Ambree ");
        brands.add("Omnipollo Leon");
        brands.add("Lowenbrau Original");
        brands.add(amberBrand);
        break;
      case "brown":
        brands.add("Newcaste");
        brands.add("Grimbergen");
        brands.add("Pernstejn Granat");
        brands.add(brownBrand);
        break;
      case "dark":
        brands.add("Guiness Draught");
        brands.add("Leffe Brune");
        brands.add("Franziskaner Dunkel");
        brands.add(darkBrand);
        break;
      default:
        brands.add("H2O");
    }
    return (brands);
  }
}
