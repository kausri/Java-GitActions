public class MyCalcMain {
    public static void main(String[] args){
        CalcClassForJunit myCalc = new CalcClassForJunit(18, 36);
        System.out.println("Sum = " + myCalc.sumThemUp());
        System.out.println("Dif = " + myCalc.subThemUp());
        System.out.println("Product = " + myCalc.mulThemUp());
        System.out.println("Div = " + myCalc.divThemUp());
    }
}
