package Behavioural;

public class AndroidCompiler extends CrossCompiler {
  protected void collectSource() {
    System.out.println("Android collect source method");
  }
  protected void compileToTarget() {
    System.out.println("Android compile to target method");
  }
}