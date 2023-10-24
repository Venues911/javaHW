package qaQuru22;

public class Main {
    public static void main(String[] args) {
         // Существуют примитивные и ссылочные типы данных

        // Целочисленные
        byte Bytetype = 100 ; // 2^8
        short ShortType = 10001 ; // 2^16
        int IntType = 1000000002 ; // 2^32
        long LongType = 1000000003 ; // 2^64

        // Плавающаю точка
        float FloatType = 1.5f ; // 2^32
        double DoubleType = 1.4 ; // 2^64

        // Символьный
        char CharType = 'S'; //2^16
        // Логический
        boolean BooleanType = true ; // or false

        // Ссылочные типы данных
        // class

        //Операторы
        // Присвоение =
        // Арифметическое + - * / %

        // Логические > < => <= == !=

        // Операторы && AND - || OR

        // Тернальные операторы

        char pol = 'm';

        String name = pol == 'm'
                ? "mName"
                : "wName";


        byte maxByte = Byte.MAX_VALUE ;
        byte minByte = Byte.MIN_VALUE ;

        float MaxFloat = Float.MAX_VALUE ;
        float MinFloat = Float.MIN_VALUE ;

        double DoubleMax = Double.MAX_VALUE;
        double DoubleMin = Double.MIN_VALUE;

        int IntMax = Integer.MAX_VALUE;
        int IntMin = Integer.MIN_VALUE;

        System.out.println( DoubleMin + IntMin );
        System.out.println(IntMax - MinFloat);
        System.out.println(DoubleMin * maxByte);
        System.out.println(DoubleMax % minByte);

        if (LongType >= IntType && name == "mName" || Bytetype <= MaxFloat) {
            System.out.println(BooleanType);
        } else {
            System.out.println("False");
        }



    }
}


