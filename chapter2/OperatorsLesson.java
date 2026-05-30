public class OperatorsLesson {
    public static void main(String[] args) {
        int a = +10;
        int b= -(5);
        boolean isActive = false;
//      ++b++ or --a-- ❌
        // a= +a++; ✅
        System.out.println(--a+ ++a); //9+ 10
        System.out.println(a);
        System.out.println(-b);
        System.out.println(!!!!!isActive);
        System.out.println(5/2);
        System.out.println(5%2);
        System.out.println("3<<2="+(3<<2));
        //0  0   0  0   1   1   0   0
        //              8   4   2   1
        //              1   1   0   0 = 12
        
        System.out.println("18>>3="+(18>>3));
        //0  0   0  1   0   0   1   0
        //         16   8   4   2   1 
        
        //0  1   0   0  0   0   1   0 = 2
        System.out.println("5>>>3="+(5>>>3));
        System.out.println(5/5.0); //5-> 5.0 -> 5.0/5.0
        short x = 10;
        short y = 5;
        
        long x2 =10;
        int y2 = 5;
        y2 *= x2; // y2 =(type y2)(y2*x2);
        boolean isFailed = false, isFailed3;
        boolean isFailed2=isFailed3=isFailed=true; 
        System.out.println(isFailed);
        System.out.println(isFailed2);
        System.out.println(isFailed3);

    }

}