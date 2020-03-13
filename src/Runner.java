/**
 * Этот класс запускает программу
 *
 * @author Pukin Alexey
 * @version 13.03.2020
 */
public class Runner {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(45);
        System.out.println("В коробке находится число " + box.getValue());

        // удаление значения и проверка на получение значения
        box.delValue();
        box.getValue(); // метод говорит нам о том, что в экземпляре ничего нет, следвательно он ничего не выводит

        // установление нового значения и его получение
        box.putValue(100);
        System.out.println("Теперь в коробке находится число " + box.getValue());

    }
}
