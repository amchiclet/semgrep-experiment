class C {
    int f() {
        return input()
    }
    int g() {
        int y = f();
    }
    int h() {
        int y = input();
    }
    int i() {
        int y = 0;
    }
    int j() {
        int y = new D().f();
    }
    int k() {
        int y = new E().f();
    }
}
