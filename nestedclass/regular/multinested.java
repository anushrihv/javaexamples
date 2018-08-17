//prints middle

class A { void m() { System.out.println("outer"); } }

 class TestInners {
 public static void main(String[] args) {
 new TestInners().go();
 }
 void go() {
 new A().m();
 class A { void m() { System.out.println("inner"); } }    //has to be called after this line
 }
 class A { void m() { System.out.println("middle"); } }
 }
