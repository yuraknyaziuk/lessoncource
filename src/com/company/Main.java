package com.company;

public class Main {

    public static void main(String[] args) {
  /*1.Создайте новый проект (при создании проекта, можно поставить галочку “Create from template”)
2.Увяжите локальный проект с удаленным репозиторием (github) и добавьте файл .gitignore и сделайте коммит
3.Заведите 3 переменные типа int с названиями yearOfBirthday, monthOfBirthday, dayOfBirthday. Проинициализируйте переменные своими годом, месяцем и днем рождения
4.Заведите переменную sum типа int. Проинициализируйте ее суммой 3-ех предыдущих переменных
5.Выведите на консоль полученное значение + строку, которая поясняет выведенное значение (см. пример вывода ниже)
6.Заведите переменную monthBiggerDay типа boolean. Сравните переменные monthOfBirthday и dayOfBirthday на предмет того, что первое больше второго
7.Результат выведите на консоль (см. пример вывода ниже)
8.Создайте массив типа char размерностью равной длине вашего имени
9.Проинициализируйте его буквами вашего имени и выведите на экран (должно просто вывестись ваше имя)
10.Заведите переменную myAge типа double. Проинициализируйте ее числом ваших полных лет
11.Заведите переменную partYear типа double. Проинициализируйте ее количеством полных месяцев прошедших с вашего дня рождения деленных на 12 (например, double partYear = 7.0 / 12.0)
12.Добавьте полученное значение к myAge
13.Выведите результат на экран
14.Залейте свой код в репозиторий и сбросьте ссылку на репозиторий преподавателю
*/
        int yearOfBirthday = 1995 ;
        int monthOfBirthday =  4;
        int dayOfBirthday =  5;

        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        String text = "Сумма моего года, месяца и дня рождения: ";
        System.out.println(text + sum);

        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        String text2 = "Месяц моего рождения больше даты рождения: ";
        System.out.println(text2 + monthBiggerDay);

        String text3 = "Массив с моим именем: ";
        System.out.print(text3);
        char [] myName = {'Y','u','r','y'};
        for (int i = 0; i < myName.length; i++){
            char name = myName[i];
            System.out.print(name);
        }
        System.out.println(" ");
        double myAge = 25;
        double partYear = 11.0 / 12.0;
        double sumAge = myAge + partYear;
        String result = String.format("%.2f",sumAge);
        System.out.println("Мне " + result + " лет");




    }
}
