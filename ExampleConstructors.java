class A {
  int x;
  A(int x) {
    x = x;
  }
  int getXWithThis() { return this.x; }
  int getXWithoutThis() { return x; }
  int getXWithThisXParam(int x) { return this.x; }
  int getXWithoutThisXParam(int x) { return x; }
}

class B {
  int x;
  B(int x) {
    x = this.x;
  }
  int getXWithThis() { return this.x; }
  int getXWithoutThis() { return x; }
  int getXWithThisXParam(int x) { return this.x; }
  int getXWithoutThisXParam(int x) { return x; }
}

class C {
  int x;
  C(int x) {
    this.x = x;
  }
  int getXWithThis() { return this.x; }
  int getXWithoutThis() { return x; }
  int getXWithThisXParam(int x) { return this.x; }
  int getXWithoutThisXParam(int x) { return x; }
}

class ExampleConstructors {
  A a = new A(100);
  int aWithThis          = a.getXWithThis();
  int aWithoutThis       = a.getXWithoutThis();
  int aWithThisXparam    = a.getXWithThisXParam(500);
  int aWithoutThisXParam = a.getXWithoutThisXParam(500);

  B b = new B(100);
  int bWithThis          = b.getXWithThis();
  int bWithoutThis       = b.getXWithoutThis();
  int bWithThisXparam    = b.getXWithThisXParam(500);
  int bWithoutThisXParam = b.getXWithoutThisXParam(500);

  C c = new C(100);
  int cWithThis          = c.getXWithThis();
  int cWithoutThis       = c.getXWithoutThis();
  int cWithThisXparam    = c.getXWithThisXParam(500);
  int cWithoutThisXParam = c.getXWithoutThisXParam(500);

}
