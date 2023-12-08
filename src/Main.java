import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру которую хотите сравнить");
        System.out.println("R - Rectangle\tT - Triangle\tC - Circle");
        boolean flag1 = true;

        GO [] array = new GO [2];

        while (flag1) {
            switch (scanner.nextLine()) {
                case "R":
                    System.out.println("Введите длину: ");
                    double a = scanner.nextDouble();
                    System.out.println("Введите ширину: ");
                    double b = scanner.nextDouble();
                    Rectangle rectangle1 = new Rectangle(a, b);
                    array[0] = rectangle1;
                    flag1 = false;
                    break;
                case "T":
                    System.out.println("Введите 1-ю сторону: ");
                    double d = scanner.nextDouble();
                    System.out.println("Введите 2-ю сторону: ");
                    double e = scanner.nextDouble();
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Введите 3-ю сторону: ");
                        double f = scanner.nextDouble();
                        if (f >= d + e) {
                            System.out.println("3-я сторона должна быть меньше суммы 2-х других");
                            continue;
                        } else if ((d >= f + e) || (e >= f + d)) {
                            System.out.println("Сумма 2-х сторон должна быть больше 3-ей");
                            continue;
                        } else {
                            Triangle triangle1 = new Triangle(d, e, f);
                            array[0] = triangle1;
                            flag = false;
                        }
                        flag1 = false;
                        break;
                    }
                    break;
                case "C":
                    System.out.println("Введите радиус: ");
                    double r = scanner.nextDouble();
                    Circle circle1 = new Circle(r);
                    array[0] = circle1;
                    flag1 = false;
                    break;
                default:
                    System.out.println("Некорректные данные!");
                    flag1 = true;
                    break;
            }
        }

        System.out.println("Введите фигуру, с которой хотите сравнить:");
        System.out.println("R - Rectangle\tT - Triangle\tC - Circle");

        flag1 = true;

        while (flag1) {
            switch (scanner.nextLine()) {
                case "R":
                    System.out.println("Введите длину: ");
                    double a = scanner.nextDouble();
                    System.out.println("Введите ширину: ");
                    double b = scanner.nextDouble();
                    Rectangle rectangle2 = new Rectangle(a, b);
                    array[1] = rectangle2;
                    flag1 = false;
                    break;
                case "T":
                    System.out.println("Введите 1-ю сторону: ");
                    double d = scanner.nextDouble();
                    System.out.println("Введите 2-ю сторону: ");
                    double e = scanner.nextDouble();
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Введите 3-ю сторону: ");
                        double f = scanner.nextDouble();
                        if (f >= d + e) {
                            System.out.println("3-я сторона должна быть меньше суммы 2-х других");
                            continue;
                        } else if ((d >= f + e) || (e >= f + d)) {
                            System.out.println("Сумма 2-х сторон должна быть больше 3-ей");
                            continue;
                        } else {
                            Triangle triangle2 = new Triangle(d, e, f);
                            array[1] = triangle2;
                            flag = false;
                        }
                        flag1 = false;
                        break;
                    }
                    break;
                case "C":
                    System.out.println("Введите радиус: ");
                    double r = scanner.nextDouble();
                    Circle circle2 = new Circle(r);
                    array[1] = circle2;
                    flag1 = false;
                    break;
                default:
                    System.out.println("Некорректные данные!");
                    flag1 = true;
                    break;
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        switch (array[0].compareTo(array[1])) {
            case 1:
                System.out.println("1-я фигура больше 2-й");
                break;
            case -1:
                System.out.println("1-я фигура меньше 2-й");
                break;
            case 0:
                System.out.println("Фигуры равны");
                break;
        }

    }
}