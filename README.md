# HW1 — учебный репозиторий по Java

Репозиторий с лабораторными работами и задачами на Java:
- `lr1` — базовые задания (ввод/вывод, условия, циклы)
- `lr2` — ООП и структуры данных (классы, наследование, композиция)
- `timus` — решения задач онлайн-архива Timus

## Структура

```text
src/
  Main.java
  lr1/
    Example1..5.java
    Task1..10.java
  lr2/
    Task1.java
    Task2.java
    Task3.java
    Task4/ (Person.java)
    Task5/ (Rectangle.java)
    Task6/ (Shape, Circle, Square, Triangle)
    Task7/ (BankAccount, BankOperations)
    Task8/
      Animal/ (Animal, Dog, Cat, Bird, Main)
      Shape/ (Shape, Circle, Square, Triangle, Main)
  timus/
    task_1264.java
    task_1293.java
    task_1409.java
    task_1785.java
    task_1787.java
    task_1877.java
    task_2001.java
    task_2012.java
```

## Как запускать

### Вариант 1 (рекомендуется): IntelliJ IDEA

1. Откройте проект `HW1`.
2. Выберите нужный класс с `main`.
3. Нажмите `Run`.

Это самый простой вариант для текущей структуры проекта.

### Вариант 2: через терминал (`javac`/`java`)

Из корня проекта:

```bash
mkdir -p out
javac -d out src/lr2/Task1.java
java -cp out lr2.Task1
```

Пример для пакета `timus`:

```bash
javac -d out src/timus/task_1264.java
echo "1 1" | java -cp out timus.task_1264
```

## Важное замечание

В ряде файлов раздела `lr1` (и в `timus/task_1877.java`) метод входа объявлен как `static void main(...)` без `public`.

Для запуска через `java` обычно нужен метод:

```java
public static void main(String[] args)
```

Поэтому эти файлы удобнее запускать из IDE, либо при необходимости заменить сигнатуру `main` на `public static void main`.

## Назначение репозитория

Репозиторий предназначен для практики:
- базового синтаксиса Java
- объектно-ориентированного подхода
- решения алгоритмических задач
