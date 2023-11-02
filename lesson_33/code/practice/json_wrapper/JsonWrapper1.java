package practice.json_wrapper;

   // имя: Леонид, возраст: 59 - это данные в одной программе
   // {name: Leonid, age: 59} - это Json, который передаёт другой программе и она его может "прочитать" (parcing)
public class JsonWrapper1 {
    // поля класса
    private Object value;

    // конструктор
    public JsonWrapper1(Object value) {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }

       @Override
       public String toString() {
           return "{value: " + value +"}";
       }
   }
