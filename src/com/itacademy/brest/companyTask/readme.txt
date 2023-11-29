1)	Создать class Company
2)	Cписок abstract Staff (4 должности сотрудников enum Title - ACCOUNTANT, DEVELOPER, LEAD, HEAD)
(продумать абстракцию), Integer workingHours
3)	Список проектов Project(name, List<Integer> staffIds
4)	Метод добавления сотрудника к проекту addToProject(Staff staff)(добавлять может только head в остальных случаях бросаем
наш кастомный exception NoPermissionsException, добавлять можем только разработчика или лида иначе some custom exception)
5)	Остальные методы взаимодействия
6)	У бухгалтеров есть status HEAD_OF_DEPARTMENT and ACCOUNT
7)	У каждого сотрудника есть id, title, People(name, address), AccountData(salaryPerHour)
8)	У разработчика поле String code;
9)	Создать interface Countable с методом count(Staff staff); (подумать кто ответственный за расчет)
10)	Создать реализации для каждой должности с учетом коэффициента ACCOUNTANT =1, DEVELOPER=1, LEAD=2, HEAD=3;
11)	Бухгалтер должен уметь рассчитывать зарплату, разработчик писать код, лид проверять код,
head запрашивать отчет о зарплате у бухгалтера(HEAD_OF_DEPARTMENT) и о проверке кода у лида;
String getReport(String projectName, Title title) - для бухгалтера отчет о зарплате для всех сотрудников проекта;
для лида (получить код у разработчика и вернуть этот код с текстом «Code verified»)
String getReport(Title title) – для бухгалтера отчет о зарплате для всех сотрудников,
 для лида (получить код у разработчика и вернуть этот код с текстом «Code verified») для всех проектов где он является лидом)

 (реализовать interface Reportable) обработать случаи для тех кто не уполномочен писать отчет)

