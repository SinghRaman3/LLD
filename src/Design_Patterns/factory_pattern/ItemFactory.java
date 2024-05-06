package Design_Patterns.factory_pattern;

public class ItemFactory {

     public ElectronicItem searchItem(String item){
         if(item.equalsIgnoreCase("Television")){
             ElectronicItem television = new Television();
             return new Television();
         }
         else if(item.equalsIgnoreCase("Refrigerator")){
             return new Refrigerator();
         }
         else return null;
     }
}
