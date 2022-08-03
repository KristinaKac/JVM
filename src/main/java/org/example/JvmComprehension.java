package org.example;

public class JvmComprehension {
//    ClassLoader - JvmComprehension;

    public static void main(String[] args) {
//        Создается frame в стеке, в момент запуска (main());

//        1. примитивное значение, будет храниться в stack memory;
        int i = 1;

//        2. ссылочная переменная о типа Object будет создана в памяти stack memory
//         но будет указывать на объект, расположенный в heap;
        Object o = new Object();

//        3. ссылочный тип данных Integer расположен в куче, а переменная,
//        указывающая на ссылку (ii) расположена в stack memory;
        Integer ii = 2;

//        4. в методе main() вызывается метод printAll() для которого будет выделен блок памяти:
//        o - переменная (расположена в stack), ссылающаяся на объект Object (расположен в heap),
//        i - примитивное значение (расположена в stack);
//        ii - переменная (расположена в stack), ссылающаяся на Integer (расположен в heap);
        printAll(o, i, ii);

//        7. создается новый фрейм в стеке;
        System.out.println("finished");
    }

    private static void printAll(Object o, int i, Integer ii) {
//        Создается frame в стеке, в момент вызова метода (printAll());

//        5. ссылочный тип данных Integer расположен в куче, а переменная,
//        указывающая на ссылку (uselessVar) расположена в stack memory.
//        Garbage Collector - переменная не используется в программе;
        Integer uselessVar = 700;

//        6. создается новый фрейм в стеке, куда передается ссылка на o,ii
//        и передается примитивная переменная i;
        System.out.println(o.toString() + i + ii);
    }
}