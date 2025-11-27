# 🧩 Minecraft Protobuf Fabric Demo  
**Интеграция Minecraft (Fabric) + Protocol Buffers + внешние сервисы**

[![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=openjdk)](#)
[![Fabric](https://img.shields.io/badge/FabricMC-Mod_Loader-434343?style=for-the-badge&logo=fabric)](#)
[![Gradle](https://img.shields.io/badge/Gradle-Build_System-02303A?style=for-the-badge&logo=gradle)](#)
[![Protobuf](https://img.shields.io/badge/Protocol_Buffers-Google-4285F4?style=for-the-badge&logo=google)](#)

Демонстрационный мод на **Fabric + Java + Protocol Buffers**, показывающий, как можно сериализовать игровые данные, передавать их через бинарный протокол и интегрировать игровой мир Minecraft с внешними backend-сервисами.

Хороший пример гибридной архитектуры:  
**Minecraft → Protobuf → Backend → AI / логирование / телеметрия / аналитика**

---

## 🚀 Возможности

- 🔄 **Сериализация данных игрока** (координаты, состояние, инвентарь) через Protocol Buffers  
- 📡 **Отправка бинарных сообщений** на внешний сервер  
- 🧰 **Пример Fabric-мода для интеграции с backend-микросервисами**  
- 🛠 База для расширения: AI-анализ действий, телеметрия, сбор игрового поведения  
- 🎓 Отличный демонстрационный проект для портфолио

---

## 🧰 Стек технологий

| Компонент | Используется |
|----------|--------------|
| ☕ Java | 17+ |
| 🧵 Fabric Loader | мод-загрузка |
| 🧶 Fabric API | Minecraft моддинг |
| 🛰 Protocol Buffers (protobuf) | бинарная сериализация |
| 🛠 Gradle | сборка |
| 🌐 (опционально) Node.js / Rust backend | обработка данных |

---

## 📁 Структура проекта

```
minecraft-protobuf-fabric-demo/
│
├── src/                     # Исходники мода (Java)
├── primitives/              # .proto схемы Protobuf
├── build.gradle             # Сборка + зависимости
├── gradle/                  # Gradle wrapper
├── README.md                # Документация
└── .gitignore
```

---

## 🧪 Пример использования Protobuf

Схема сообщения (пример):

```proto
message PlayerState {
  string username = 1;
  float x = 2;
  float y = 3;
  float z = 4;
  int32 health = 5;
}
```

Сериализация:

```java
PlayerState state = PlayerState.newBuilder()
        .setUsername(player.getName().getString())
        .setX(player.getX())
        .setY(player.getY())
        .setZ(player.getZ())
        .setHealth((int) player.getHealth())
        .build();

byte[] data = state.toByteArray();
```

---

## ⚙️ Как запустить локально (dev)

### 1) Установи зависимости

- JDK 17  
- Fabric MC Development Environment  

### 2) Склонируй репо

```bash
git clone https://github.com/rolloerro/minecraft-protobuf-fabric-demo
cd minecraft-protobuf-fabric-demo
```

### 3) Собери и запусти Minecraft с модом

```bash
./gradlew clean build
./gradlew runClient
```

### 4) Проверь логи — там появятся protobuf-сообщения.

---

## 🎯 План расширений (Roadmap)

- [ ] Пример backend-сервиса, принимающего protobuf (Node.js / Rust / Python)  
- [ ] WebSocket/HTTP-интеграция с внешним сервером  
- [ ] Сериализация событий мира  
- [ ] Отправка данных по интервалу (tick-tracker)  
- [ ] AI-анализ игровой телеметрии  
- [ ] CI/CD + автосборки артефактов  

---

## 📊 GitHub-статистика (опционально)

![GitHub stats](https://github-readme-stats.vercel.app/api?username=rolloerro&show_icons=true&theme=tokyonight)

---

## 📝 Лицензия

MIT License  
(можем заменить при желании)

---

## 📬 Контакты / автор

**Владимир Копылов**  
Digital WM Core  
Telegram: https://t.me/MSL72Rph 

---

*README сделан в стиле продакшен-open-source от твоего брата-архитектора ❤️*  
