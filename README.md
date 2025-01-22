# Intent APP

This repository contains the source code for an Intent-based application developed using the Kotlin language within the Android Studio environment.

<hr><br>

## Purpose of This Repository

To provide a practical example of how to implement and utilize Intents within an Android application built using the Kotlin programming language.

<hr><br>

## Demo

### Program Function Demonstration

Here is a demonstration of a function from the project that shows how to move to another page using an Intent:

```kotlin
// filepath: /home/guan/Documents/Code/IntentAPP/app/src/main/java/com/example/intentapp/MainActivity.kt
fun moveToAnotherPage(view: View) {
    val intent = Intent(this, AnotherActivity::class.java)
    startActivity(intent)
}
```

<hr><br>

## Features

- Demonstrates the use of explicit and implicit Intents
- Simple and clean user interface
- Easy to understand and extend

<hr><br>

## Technologies Used

- Kotlin
- Android Studio
- XML for UI design

<hr><br>

## Project Setup

1. **Ensure you have Android Studio installed on your machine.**
2. **Clone this Repository**

```bash
git clone https://github.com/guanshiyin28/IntentAPP.git
```

3. **Open the project in Android Studio**

<hr><br>

## Steps to Run

1. **Build the project**
2. **Run the project on an emulator or a physical device**

<hr><br>

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

<hr><br>

<div align="center">
  <a href="https://www.instagram.com/guanshiyin_/">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=100:FF0000,20:F0F0F0&section=footer&reversal=false&textBg=false&fontAlignY=50&descAlign=48&descAlignY=59"/>
  </a>
</div>
