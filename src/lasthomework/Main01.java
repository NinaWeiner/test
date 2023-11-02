package lasthomework;
// metod kotoryj budet obedinqtj massiv
public class Main01 {
  // написать метод, к-ый считает целую степень числа,т.е.наприме 2 в степени 3
  // 2*2*2=8.
  public static double power(double base,int pow){
    if (pow == 0){ //если степень 0,
      return 1; // то результат всегда 1.
    }
    if (pow < 0) { // если степень < 0,    т.е. она отрицательная
      base = 1 / base;  // то число переворачиваем,т.е. 1/число. пишем в знаменатель
      pow *= -1;
    }
    double res = 1;
    for (int i = 0; i < pow; i++){
      res *= base; // res = res * base
    }
    return res;
  }
  public static void main(String[] args) {
    System.out.println(power(2, -3)); // 2 в степени -3
  }
}


