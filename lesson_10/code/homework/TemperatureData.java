package homework;
// Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.
public class TemperatureData {
    public static void main(String[] args) {
        // Создаём массив с данными о дневной температуре
        int[] temperatureData = {25, 27, 26, 28, 24, 23, 22};

        // Выводим температуру во вторник и четверг
        System.out.println("Temperature on Tuesday: " + temperatureData[1]);
        System.out.println("Temperature on Thursday: " + temperatureData[3]);

        // Вычисляем среднюю температуру за прошедшую неделю
        int sum = 0;
        for (int temperature : temperatureData) {
            sum += temperature;
        }
        int averageTemperature = sum / temperatureData.length;
        System.out.println("Average temperature for the past week: " + averageTemperature);

    }
}
