public class RomNumbers {
    public static boolean znachRom(String x){
        switch (x){
            case "I":

            case "II":

            case "III":

            case "IV":

            case "V":

            case "VI":

            case "VII":

            case "VIII":

            case "IX":

            case "X":
                return true;
        }
        return false;
    }
    public static int provRomNum(String x){
        switch (x){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                int i = 0;
        }
        return 0;
    }
    public static String resArabToRom(int res){
        StringBuilder resStr = new StringBuilder();
        while(res > 0){
            if ((res/100) >= 1){
                resStr.append("C");
                res = res - 100;
            } else if ((res/90) >= 1){
                resStr.append("XL");
                res = res - 90;
            }else if ((res/50) >= 1){
                resStr.append("L");
                res = res - 50;
            } else if((res/40) >= 1){
                resStr.append("XL");
                res = res - 40;
            }else if ((res/10) >= 1){
                resStr.append("X");
                res = res - 10;
            } else{
                switch (res){
                    case 9:
                        resStr.append("IX");
                        res -= 9;
                        break;
                    case 8:
                        resStr.append("VIII");
                        res -= 8;
                        break;
                    case 7:
                        resStr.append("VII");
                        res -= 7;
                        break;
                    case 6:
                        resStr.append("VI");
                        res -= 6;
                        break;
                    case 5:
                        resStr.append("V");
                        res -= 5;
                        break;
                    case 4:
                        resStr.append("IV");
                        res -= 4;
                        break;
                    case 3:
                        resStr.append("III");
                        res -= 3;
                        break;
                    case 2:
                        resStr.append("II");
                        res -= 2;
                        break;
                    case 1:
                        resStr.append("I");
                        res -= 1;
                        break;


                }
            }

        }

        if (res < 0) {
            throw new IllegalArgumentException("Не может быть негативных  римских чисел чисел");
        }

        return resStr.toString();
    }
}
