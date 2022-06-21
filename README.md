DEMO проект к  https://github.com/dtuchs/4-class-infra
=================

## Доклад на Heisenbug 2022 Spring offline
### Описание доклада
Опыт «разработки и поддержки QA-фреймворка» в резюме автоматизатора — скорее недостаток, чем преимущество. В докладе представлен авторский взгляд на QA-фреймворки. Вы узнаете, почему «идеальный» фреймворк должен иметь около 4-х публичных классов.
Рассматриваются практические вопросы по работе с базами данных (JPA/Hibernate), с REST и gRPC. Обсуждается, насколько справедлива мысль: «У нас чистый Selenium: без своего фреймворка не обойтись!»

Спойлер: Selenide или Playwright не предлагаются.

### Видео доклада
    (coming soon)

### Презентация
    (coming soon)

## Запуск БД в докере
```bash
docker pull postgres
docker run --name some-postgres -p 5432:5432 -e POSTGRES_PASSWORD=secret -d postgres
```
## Создание схемы БД
- выполнить скрипт 
```
/heisenbug-2022-piter-demo/src/test/resources/hb_datatbase.sql
```