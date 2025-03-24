# shortener

## 1. Описание

URL shortener.

## 2. Структура проекта

- `application.properties`: Настройки приложения, которые можно поменять для разных окружений;

## 3. Сборка

```sh
./gradlew build
```

Для постоянной сборке в фоне, запустить:

```sh
./gradlew build --continuous
```

## 4. Запуск

```sh
./gradlew bootRun
```

Запущенный проект будет доступен по адресу <http://localhost:8080/>.
Проверить его можно, выполнив:

```sh
curl http://localhost:8080/health_check
```

Выведет, например:

```plaintext
Mon Mar 24 19:36:10 MSK 2025
```
