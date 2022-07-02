Описание: P2P переводы
Средства разработки: Java (jdk 1.8)
Framework: springBootVersion = '2.0.0.RELEASE'
Cистема автоматической сборки: Gradle
База данных: PostgreSQL
Протокол: HTTP, порт 40

1.	Авторизация
      •	Создать JWT авторизацию (Spring security)

2.	 Подготовить 2 проекта (2 приложение банка)
       •	Узбекский банк
       Сервисы Карт:
    - Uzcard
    - Humo
    - Visa
      У всех должно быть Таблица с этими данными Card
      ![img_4.png](images/img_4.png)
      •	Российский банк
      Сервисы Карт:
    - МИР
    - Visa
      У всех должно быть Таблица с этими данными Card
      ![img_5.png](images/img_5.png)
      Общая таблица для хранений карт Card:
      ![img_7.png](images/img_7.png)
      ![img_8.png](images/img_8.png)
