package com.tnsif.nonaccessmodifiers;

final class FinalDemo {

    final int Var = 100;

    final void display() {
        System.out.println("Show the value of Var: " + Var);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();
        // fd.Var = 200; // ❌ Not allowed because Var is final
    }
}
