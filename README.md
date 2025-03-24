# url-shortener

## 1. Описание

Простой сервис для создания коротких ссылок.

## 2. Структура проекта

- `application.properties`: Настройки приложения, которые можно поменять для разных окружений;

## 3. Сборка

```sh
./gradlew build
```

Для постоянной сборке в фоне (проект всё равно придётся перезапускать вручную), запустить:

```sh
./gradlew build --continuous
```

## 4. Запуск

```sh
./gradlew bootRun
```

## 5. Проверка работы

Запущенный проект будет доступен по адресу <http://localhost:8080/>.
Проверить его можно, выполнив:

```sh
curl --request POST \
  --url http://localhost:8080/shortUrl \
  --header 'content-type: application/json' \
  --data '{
  "longUrl": "https://ya.ru"
}'
```

Можно также выполнить соответствующий запрос в Bruno, открыв в нём папку `bruno_tests`.

Выполнив данный запрос, получим ответ:

```json
{
  "shortUrl": "http://localhost:8080/ea8cad7a"
}
```

Перейдя по этой ссылке в браузере (в Bruno на момент 2025-03-24 не получится - ошибка `ECONNREFUSED`), произойдёт перенаправление на <https://ya.ru>. Проверить также можно в консоли:

```sh
curl --head --request GET --url http://localhost:8080/ea8cad7a
```

Выведет:

```plaintext
HTTP/1.1 302
Location: https://ya.ru
Connection: close
Content-Length: 0
Date: Mon, 24 Mar 2025 18:06:40 GMT
```
