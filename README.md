# 🚀 Minecraft Protobuf Fabric Demo

## 🎮 Описание мода
Демонстрационный мод для **Minecraft Fabric**, показывающий, как использовать **Google Protocol Buffers (Protobuf)** для обмена данными между клиентом и сервером.  
Создан для тестирования сериализации и быстрого обмена структурированными сообщениями в Minecraft 1.21.1.

---

## ⚙️ Сборка и запуск

### 🧩 Требования
- **Java 21+**
- **Gradle 8.8+**
- **Fabric Loom 1.7.4**
- **Minecraft 1.21.1**

### 🛠️ Сборка проекта
```bash
./gradlew clean build
## 📦 Структура проекта

minecraft-protobuf-fabric-demo/
├── app/ # Основное приложение мода
│ ├── build.gradle.kts # Скрипт сборки для модуля
│ ├── src/ # Исходный код мода (main/java + resources)
│ └── ...
│
├── proto/ # Файлы описания Protocol Buffers (.proto)
│ └── messages.proto
│
├── build.gradle.kts # Корневой Gradle-скрипт
├── settings.gradle.kts # Настройки многомодульного проекта
├── gradle/ # Конфигурация Gradle wrapper
│ └── wrapper/
│
├── gradlew # Unix-скрипт Gradle wrapper
├── gradlew.bat # Windows-скрипт Gradle wrapper
├── .gitignore # Игнорируемые файлы для Git
└── README.md # Документация проекта

yaml
Копировать код

---

Эта структура помогает быстро понять, где искать код, сборочные скрипты и протобуф-файлы.


🧠 Технологии

Fabric Loader — загрузчик модов для Minecraft

Fabric Loom — система сборки и маппинга для Fabric

Google Protobuf — сериализация бинарных данных

Java 21 (toolchain) — современная версия Java для Minecraft 1.21+

Gradle Kotlin DSL (build.gradle.kts) — типобезопасная настройка сборки

🚀 Как внести вклад

💡 Pull Requests приветствуются!

Сделай форк репозитория

Создай ветку для своей фичи:

git checkout -b feature/my-feature


Внеси изменения, протестируй сборку:

./gradlew clean build


Отправь PR с чётким описанием изменений 🚀

🧾 Автор

rolloerro — Minecraft developer 🥷
GitHub: github.com/rolloerro
