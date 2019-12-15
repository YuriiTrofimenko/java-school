package org.tyaa.schooljavaapp.entity; // Имя пакета, к кторому относится класс Dept
// Заголовок класса Dept
public class Dept {

    private Integer id; // Поле (переменная) класса Dept типа Integer с именем id
    public String name; // Поле (переменная) класса Dept типа String с именем name
    // Метод установки значения поля id
    public void setId(Integer _id) throws Exception{
        // Проверка на вхождение переданного значения в допустимый диапазон
        if (_id > 0) {
            id = _id;
        } else {
            // Выброс исключения (объекта ошибки), который прерывает работу программы
            throw new Exception("Id must be > 0");
        }
    }
    // Метод получения значения поля id
    public Integer getId(){
        return id;
    }
}
