public class Main {
    public static void main(String[] args) {
        // write your code here
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);
        var dog1 = dog - 3.5;
        var cat1 = cat - 1.6;
        var paper1 = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " +totalWeight+ " кг.");
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разницу между весами бойцов " +weightDifference+ " кг.");
        var weightDifference1 = boxerTwo - boxerOne;
        System.out.println("Разницу между весами бойцов " +weightDifference1+ " кг.");
        var weightDifference2 = boxerTwo % boxerOne;
        System.out.println("Разницу между весами бойцов " +weightDifference2+ " кг.");
        var hoursOperation = 640;
        var employeesWork = 8;
        var totalEmployees = hoursOperation / employeesWork;
        System.out.println("Всего работников в компании – " +totalEmployees+ " человек.");
        var human = 94;
        var intotalEmployees = totalEmployees + human;
        var numberHours = human * employeesWork + hoursOperation;
        System.out.println("Если в компании работает " +intotalEmployees+ " человек, то всего " +numberHours+ " часов работы может быть поделено между сотрудниками.");

    }
}