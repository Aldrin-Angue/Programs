
package conversion;

public class VolumeConversion {
    //15
    public double HectoliterToPeck (double a){
        double peck = a * 11.351;
        return peck;
    }
    //16
    public double PeckToHectoliter (double a){
        double hec = a / 11.351;
        return hec;
    }
    //17
    public double PintToCup (double a){
        double cup = a * 1.972;
        return cup;
    }
    //18
    public double CupToPint (double a){
        double pint = a / 1.972;
        return pint;
    }
    //19
    public int TablespoonToTeaspoon (int a){
        int ts = a * 3;
        return ts;
    }
    //20
     public double TeaspoonToTablespoon (double a){
        double tbsp = a / 3;
        return tbsp;
    }
     //21
      public int GallonToQuart (int a){
          int quart = a * 4;
          return quart;
    }
      //22
      public double QuartToGallon (double a){
          double gallon = a / 4;
          return gallon;
      }
}
