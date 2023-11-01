package classwork;

public class Main03 {
  // на вход подаётся массив,в к-ом записанныы только цифры.
  // Объединить этот массив в одно число.
  // Вывод: 4 8 1 2 3
  // Результат 48123
  // 3*1 + 2*10 + 1*100 + 8*1000 + 4*10000 - это разряды
  public static int concat(int[] arr){ //создали метод concat сдвумя параметрами
    int res = 0;   // савели перем-ю res, и инициализировали =0
    for (int i = 0, j = arr.length-1; i< arr.length; i++, j--){ // тут нов.счетчик j,
      // к-й считает сконца в начало  j = arr.length-1; j--; кол-во нулей
      res += arr[i] * Math.pow(10, j); //число (arr[i]) умножаем
      // на 10 в степени j Math.pow(10, j);
    }
    return res;  // возвращаем результат
  }
  public static void main(String[] args) {
    int[] arr = {4,8,1,2,3};
    System.out.println("chislo is massiva: ");
    System.out.println(concat(arr));
  }
}
