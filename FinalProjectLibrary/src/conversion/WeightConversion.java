
package conversion;

public class WeightConversion {
   //1
    public double OunceToGram (int a){
        double gram = a * 28.35;
        return gram;
    }
    //2
     public double GramToOunce (int a){
        double ounce = a / 28.35;
        return ounce;
    }
     //3
      public double KilogramToPound (double a){
        double pound = a * 2.205;
        return pound;
    }
      //4
       public double PoundToKilogram (double a){
        double kilogram = a / 2.205;
        return kilogram;
    }
       //5
        public double TonneToStone (double a){
        double stone = a * 157.473;
        return stone;
    }
        //6
         public double StoneToTonne (double a){
        double tonne = a / 157.473;
        return tonne;
    }
      
}
