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
    int f2() {
        return 1;
    }
    int g2() {
        return x;
    }
    int h2() {
        return B.x;
    }
    int i2(int y) {
        return y;
    }
    int j2() {
        i2(1);
    }
}
