/**
 * Это класс с дженериком
 *
 * @param <T>
 * @author Pukin Alexey
 * @version 13.03.2020
 */
public class Box<T> {
    private T val;

    // конструктор дженерика
    public Box(T arg) {
        val = arg;
    }

    // получение значения
    public T getValue() {
        if (this.val != null) {
            return this.val;
        } else {
            System.out.println("В данной коробке ничего нет");
            return null;
        }
    }

    // придать значение
    public void putValue(T value) {
        val = value;
    }

    // удалить значение
    public void delValue() {
        val = null;
    }
}
