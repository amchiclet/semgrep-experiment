class A {
    static final int x = 1;
    int f() {
        return 1;
    }
    int g() {
        return x;
    }
    int h() {
        return B.x;
    }
    int i(int y) {
        return y;
    }
    int j() {
        i(1);
    }
}
