package by.jd2.servletJspJstl;

import java.util.*;


public class DB {
    //ленивая реализация синглтон
    //приватное статическое поле, содержащее одиночный объект
    private static DB db;

    //приватный конструктор по умолчанию
    private DB() {
    }

    //статический создающий метод для получения одиночки
    public static DB getDB() {
        if (db == null) {
            db = new DB();
        }
        return db;
    }

    private List<User> users = Arrays.asList(new User("Anna", "123"),
            new User("Hanna", "321"));

    //проверка на наличие пользователя в базе
    public boolean userIsExist(String login, String password) {
        boolean result = false;
        for (User user : users) {
            if (user.getName().equals(login) && user.getPassword().equals(password)) {
                result = true;
                break;
            }
        }
        return result;
    }

    //добавление пользователя в базу
    public void addUser(String login, String password) {
        users.add(new User(login,password));
    }
}
