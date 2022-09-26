package ScopeCheck;

public class ScopeCheck {
    public int publicVar = 0;
    public int var1 = 1;

    public ScopeCheck(){
        System.out.println("Scopecheck created, publicvar = " + publicVar + ": varOne = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo(){
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i*var2);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 fom outer class: " + innerClass.var3);
    }

    public class InnerClass{
        public int var3 = 3;

        public InnerClass(){
            System.out.println("InnerClass created, var1 is " + var3 + " is  " + var3);
        }

        public void timesTwo(){
            System.out.println("var one is still available here " + var1);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i*var3);
            }
        }

    }
}
