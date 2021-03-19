public class Geometry {

    
    public static void main(String[] args) {
        
         Formulas fmla = new Formulas();
         
         //Made By Rechiang Cayabyab
         System.out.println(fmla.areaOfCircle(4.0));
         System.out.println(fmla.areaOfTriangle(5.0,7.0));

	//Made by Angel Ann Ibay
         System.out.println(fmla.areaOfSquare(6.5));
         System.out.println(fmla.areaOfRectangle(4.5,3.5));

         //Made by Ezekiel Benigno
         System.out.println(fmla.perimeterOfCircle(7.0));
         System.out.println(fmla.perimeterOfSquare(6.0));

         //Johnuel Quintos
         System.out.println(fmla.perimeterOfRectangle(10.0,9.0));
         System.out.println(fmla.perimeterOfParallelogram(4.0,6.5));

	//Made by RexJasper Polintang
         System.out.println(fmla.volumeOfCone(15.0,12.0));
         System.out.println(fmla.volumeOfSphere(10.0));
}
}


class Formulas{
    
    //Method 1 and 2 Rechiang Cayabyab
    public double areaOfCircle(double r){
        double pi =  3.1415;
        double area = (pi*(r*r));
        return area;
    }
    public double areaOfTriangle(double b, double h){
        double area = (b*h)/2;
        return area;
    }

	//Method 3 and 4 Angel Ann Ibay
    public double areaOfSquare(double a){
        double area = (a*a);
        return area;
    }
    public double areaOfRectangle(double b, double h){
        double area = (b*h);
        return area;
    }
    //Method 5 and 6 Ezekiel Benigno
    public double perimeterOfCircle(double r){
        double pi =  3.1415;
        double perim = ((2*pi)*(r));
        return perim;
    }
    public double perimeterOfSquare(double a){
        double perim = (4*a);
        return perim;
    }
   //Method 7 and 8 Johnuel Quintos
    public double perimeterOfRectangle(double b, double h){
        double perim = 2*(b + h);
        return perim;
    }
    public double perimeterOfParallelogram(double b, double h){
        double perim = 2*(b + h);
        return perim;
    }
   //Method 9 and 10 RexJasper Polintang
    public double volumeOfSphere(double r){
        double pi =  3.1415;
        double vol = (1.3333)*(pi*(r*r*r));
        return vol;
    }
    public double volumeOfCylinder(double r, double h){
        double pi =  3.1415;
        double vol = (pi)*(r*r)*(h);
        return vol;
    }


}

