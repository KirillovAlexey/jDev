public class MainClass {
    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    byte bValue = 127;
    short sValue = -32768;
    int iValue = 2147483647;
    long lValue = -9223372036854775808L;
    char cValue = '\uffff';
    float fValue = 6.15F;
    double dValue = 7.25;
    boolean boolValue = true;

    String str = "6";

    public static void main(String[] args) {
        mathOperation(8.7, 5.5, 8.6, 4.1);
        checkSumValue(10, 1);
        writeToConsole(-100);
        checkValue(-8);
        printHelloName("Алексей");
        checkEars(2120);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static double mathOperation(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public static boolean checkSumValue(int a, int b) {

        return Math.addExact(a, b) > 10 && Math.addExact(a, b) <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    //Замечание: ноль считаем положительным числом.
    public static void writeToConsole(int a) {
        if (a >= 0)
            System.out.println("Переданное число является положительным");
        else System.out.println("Переданное число является отрицательным");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean checkValue(int a) {
        return a >= 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void printHelloName(String string) {
        System.out.println("Привет, " + string + "!");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkEars(int ears) {
        if (ears % 400 == 0) {
            System.out.println("Год високосный");
        } else if (ears % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (ears % 4 == 0) {
            System.out.println("Год високосный");
        } else if (ears > 0) System.out.println("Год не високосный");
        else System.out.println("Некорректный год");
    }
}
