package Lab4;

 class Complex{
     private double real;
     private double imaginary;
    
     public Complex(){
       real = 0.0;
       imaginary = 0.0;
     }
     public Complex(double real, double imaginary){
       this.real = real;
       this.imaginary = imaginary;
     }
     public Complex add(Complex c){
       double newReal = this.real + c.real;
       double newImaginary = this.imaginary + c.imaginary;
       Complex newComplex = new Complex(newReal,newImaginary);
       return newComplex;
     }
     public void display(){
         if(imaginary>=0)
       System.out.println(real+"+"+imaginary+"i");
       else
       System.out.println(real+"-"+imaginary+"i");
     }
   }
  
   public class LabActivity2 {
       public static void main(String[] args) {
         Complex c1 = new Complex(2,3);
         Complex c2 = new Complex(4,5);
         c1.display();
         c2.display();
         Complex c3 = c1.add(c2);
         c3.display();
         System.out.println(c1);
  
     }
   }


