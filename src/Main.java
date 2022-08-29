import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String vir = scanner.nextLine();
        String[] virArr = vir.split(" ");
        String num1 = virArr[0];
        String act = virArr[1];
        String num2 = virArr[2];




            int quantity = virArr.length;
            if (quantity != 3 || Active.provAct(act)) {
                throw new IllegalArgumentException("Не корректно набранно выражение");
            }

            if (Arab.arabNumProv(num1) && Arab.arabNumProv(num2)) {
                int num1Arab = Integer.parseInt(num1);
                int num2Arab = Integer.parseInt(num2);
                if (((num1Arab) > 0) && ((num2Arab) > 0) && ((num1Arab) <= 10) && ((num2Arab) <= 10)) {
                    int res = Result.resultArab(num1Arab, num2Arab, act);
                    System.out.println("Равно " + res);
                } else {
                    throw new IllegalArgumentException("Чилсо должно быть больше 0 и не больше 10");
                }
            } else if (RomNumbers.znachRom(num1) && RomNumbers.znachRom(num2)) {
                int romNum1 = RomNumbers.provRomNum(num1);
                int romNum2 = RomNumbers.provRomNum(num2);
                int res = Result.resultArab(romNum1, romNum2, act);
                String resNum = RomNumbers.resArabToRom(res);
                if (res > 0) {
                    System.out.println("равно " + resNum);
                }
            } else { throw new IllegalArgumentException("Не коректные значения чисел");
                }
            }


    }
}
