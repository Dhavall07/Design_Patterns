package Behavioural;

public class IPhoneCompiler extends CrossCompiler {
    protected void collectSource() {
      System.out.println("IPhone collect source method");
    }
    protected void compileToTarget() {
        System.out.println("IPhone compile to target method");
    }
  }