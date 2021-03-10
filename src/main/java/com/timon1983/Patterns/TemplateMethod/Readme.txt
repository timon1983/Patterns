Шаблон проектирования Шаблонный метод(TemplateMethod).
-Классы Work и Study реализуют абстрактный класс GeneralCommand и переопределяют его метод doSomthing().
-В классе GeneralCommand определен метод myDay() в котором также реализуется метод doSomthing().
-В клиенте созданы два объекта GeneralCommand(Work и Study), при вызове метода myDay() каждый объект по
своему реализует метод doSomthing().