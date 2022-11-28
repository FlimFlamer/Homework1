public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6f;
        var paper = 763789;
        var friend = 19;
        var frog = 3.5;
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var timeWork = 640;
        var personalTime = 8;

        System.out.println(dog); //задание 1,2,3;
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = (int) (dog - 3.5);
        cat = (float) (cat - 1.6);
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println(friend); //задание 4,5;
        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var weightAllBoxer = weightFirstBoxer + weightSecondBoxer; //задание 6,7,8;
        System.out.println("Общий вес бойцов сосотавляет " + weightAllBoxer + " кг.");
        var weigthDifference = (weightFirstBoxer - weightSecondBoxer);
        System.out.println("Разница между бойцами состовляет " + weigthDifference + " кг.");

        weigthDifference = (weightSecondBoxer - weightFirstBoxer) % weightAllBoxer;
        System.out.println("Разница между бойцами составляет " + weigthDifference + " кг.");
        System.out.println();

        var personal = timeWork / personalTime;
        System.out.println("Всего работников в компании - " + personal + " человек." );
        personal = personal + 94;
        System.out.println("Если в компании работает " + personal + " человек, то всего " + (timeWork/personal) + " часов работы может быть поделено между сотрудниками.");
    }
}

