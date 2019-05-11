package br.com.mtmn.kotlincoursera.week02;

public class JavaUsage {

    public static void main(String[] args) {
        int i = ClassNameToBeUsed.foo();

        NamedDefaultArgs nda = new NamedDefaultArgs();
        System.out.println(nda.sum(1, 2));
    }
}
