public class TestArray {
    public static void main(String[] args) {

//вывести на экран элементы массива
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        //Нахождение среди элементов массива наибольшего
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Наибольший элемент: " + max);


        double[] myList1 = {1.9, 2.9, 3.4, 3.5};
        for (double e : myList1) {
            System.out.println(e);
        }
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.6, 11.1, 10, 9};
        // Переменной max задаем минимальное double-значение.
        double max1 = Double.MIN_VALUE;
        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной max с помощью метода Math.max() присваиваем максимальное значение
            // путем выбора наибольшего из двух значений ("старого" значения max и значения элемента).
            max1 = Math.max(max, myArray[i]);
        }
        System.out.println("Максимальный элемент " + max1);

        double[] myArray1 = {11, 5.8, 11.1, 10.9};
        // Переменной max задаем значение нулевого элемента.
        double max2 = myArray1[0];
// Перебираем все элементы массива.
        for (int i = 0; i < myArray1.length; i++) {
// Сравниваем значение переменной max со значениями элемента массива.
            // Если значение элемента массива больше значения переменной max,
            // то новое значение переменной max будет равно значению этого элемента.
            if (myArray1[i] > max) {
                max = myArray1[i];
            }
        }

        double[] myArray3 = {11, 5.8, 11.1, 10.9};
        // Переменной min задаем значение нулевого элемента.

        double min = myArray3[0];
        // Перебираем все элементы массива.

        for (int z = 1; z < myArray3.length; z++) {
// Сравниваем значение переменной min со значениями элемента массива.
            // Если значение элемента массива меньше значения переменной min,
            // то новое значение переменной min будет равно значению этого элемента.
            if (myArray3[z] < min) {
                min = myArray3[z];
            }
        }
        System.out.println("Минимальное значение в массиве myArray: " + min);


        double[] myList2 = {2.6, 1.8, 1.3, 6.5, 22.8};

        double total1 = 0;
        // Прибавляем к переменной total каждый элемент массива.
        for (int x = 0; x < myList2.length; x++) {
            total1 += myList2[x];
        }
        System.out.println("Сумма элементов массива myList2: " + total1);

        // Получение суммы элементов в массиве myArray из 5 элементов типа double.
        double[] myList3 = {2.5, 1.8, 1.3, 6.5, 22.8};
        // Инициализируем переменную total.
        double total2 = 0;
        // Прибавляем к переменной total каждый элемент массива с помощью улучшенного цикла for.
        for (double element : myList3) {
            total2 += element;
        }
        System.out.println("Сумма массива myList3 " + total2);

        // Вывод на экран массива myArray из 5 элементов типа double.
        double[] myList4 = {11.5, 1.9, 5.32, 8.8, 15.8};
        // Вывод массива на экран с помощью улучшенного цикла for.
        System.out.println("Вывод элементов массива myList4: ");
        for (double element1 : myList4) {
            System.out.print(element1 + ", ");
        }
        // Вывод элементов массива на экран.
        for (int j = 0; j < myList4.length; j++) {
            System.out.print(myList4[j] + ", ");
        }

        // Массива myArray из 5 элементов типа double.
        double[] myList5 = {2, 2.7, 3, 12, 23.8};
        // Вывод четных элементов массива на экран.
        System.out.println("Четные элеенты массива myList5: ");
        for (int ii = 0; ii < myList5.length; ii++) {
            if (myList5[ii] % 2 == 0){
                System.out.println(myList5[ii] + ", ");
            }
        }
        // Вывод нечетных элементов массива на экран.
        System.out.println("Нечетные элементы массива myList5: ");
        for (int jj = 0; jj < myList5.length; jj++) {
            if (myList5[jj] % 2 != 0){
                System.out.println(myList5[jj] + ", ");
            }
        }

        double[] myList7 = {11.5, 1.9, 5.32, 8.8, 15.8};
        // Вывод элементов массива с четным индексом на экран.
        System.out.print("Элементы массива myList с четным индексом: ");
        for (int i = 0; i < myList.length; i++) {
            if(i%2 == 0){
                System.out.print("индекс " + i + " = " + myList[i] + ", ");
            }
        }
        // Вывод элементов массива с нечетным индексом на экран.
        System.out.print("\nЭлементы массива myList с нечетным индексом: ");
        for (int i = 0; i < myList.length; i++) {
            if(i%2 != 0){
                System.out.print("индекс " + i + " = " + myList[i] + ", ");
            }
        }

    }
}
