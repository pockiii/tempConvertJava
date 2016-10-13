import java.util.*;

class tempconvert {
  public static void main(String[] args) {
    String[] unitList = new String[2];
    getUnits(unitList);
    Double val = getVal();
    Double result = conversion(unitList, val);
    if(result == 0.0)
    System.exit(0);
    System.out.println("You have decided to convert "+val+" "+unitList[0]+" to "+unitList[1]);
    System.out.println(result);
  }
  public static String[] getUnits(String[]unitList){
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Please type in your initial unit");
    unitList[0] = scan1.nextLine();
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Please type in the unit you would like to convert to");
    unitList[1] = scan2.nextLine();
    return unitList;
  }
  public static Double getVal(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type in the value you would like to convert");
    Double val = scan.nextDouble();
    return val;
  }
  public static Double conversion(String[]unitList, Double val){
    if(unitList[0].equals("Kelvin")){//Kelvin to x
      if(unitList[1].equals("Celsius"))
        return val - 273.15;
      else if(unitList[1].equals("Fahrenheit"))
        return val * ((double)9/5) - 459.67;
      else
        System.out.println("Measuement not valid");
    }
    else if(unitList[0].equals("Fahrenheit")){//Fahrenheit tox
      if(unitList[1].equals("Celsius"))
        return (val - 32) * ((double)5/9);
      else if(unitList[1].equals("Kelvin"))
        return (val + 459.67) * (double)5/9;
      else
        System.out.println("Measuement not valid");
    }
    else if(unitList[0].equals("Celsius")){//Celsius to x
      if(unitList[1].equals("Kelvin"))
        return val +273.15;
      else if(unitList[1].equals("Fahrenheit"))
        return val * (double)9/5 + 32;
      else
        System.out.println("Measuement not valid");
    }
    else if(!unitList[0].equals("Celsius")||!unitList[0].equals("Fahrenheit")||!unitList[0].equals("Kelvin"))
        System.out.println("Measuement not valid");
    else if(unitList[0].equals(unitList[1]))
        System.out.println("The two units entered are the same, please enter two different measurements next time");
    return 0.0;
  }
}
