# Restaurant [![Release](https://img.shields.io/github/release/SandroMachado/Restaurant.svg?label=jitpack)](https://jitpack.io/#SandroMachado/Restaurant) <a href="http://www.methodscount.com/?lib=com.github.SandroMachado%3Arestaurant%3A0.2.0"><img src="https://img.shields.io/badge/Methods count-core: 50 | deps: 18621-e91e63.svg"></img></a>

An extension to the Snackbar view available at the Android Design Support Library.

Restaurant wraps the `Snackbar` implementation to easily allow more customization. With Restaurant you can change the text and background color of the `Snackbar` just calling a method. Restaurant can also detect the correct view to attach the Snackbar just receiving the activity.

# Gradle Dependency

### Repository
First, add the following to your app's `build.gradle` file:

```Gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

Them include the Restaurant dependency:

```gradle
dependencies {

    // ... other dependencies here.
    // Set the transitive = false if you already have the Design Support Library dependency.
    compile('com.github.SandroMachado:restaurant:0.2.0@aar') {
        transitive = true
    }
}
```

# Usage

Show a Snackbar with a custom background color:

![Snackbar with custom background color](screenshots/custom_background.png)

```Java
new Restaurant(MainActivity.this, "Snackbar with custom background color", Snackbar.LENGTH_LONG)
    .setBackgroundColor(Color.GRAY)
    .show();
```

Show a Snackbar with a custom text color:

![Snackbar with custom text color](screenshots/custom_text.png)

```Java
new Restaurant(MainActivity.this, "Snackbar with custom text color", Snackbar.LENGTH_LONG)
    .setTextColor(Color.GREEN)
    .show();
```

Show a Snackbar with a custom text colors:

![Snackbar with custom text colors](screenshots/custom_text_colors.png)

```Java
new Restaurant(MainActivity.this, "", Snackbar.LENGTH_LONG)
    .appendText("RED", Color.RED)
    .appendText("GREEN", Color.GREEN)
    .appendText("BLUE", Color.BLUE)
    .appendText("WHITE", Color.WHITE)
    .show();
```

Show a custom Snackbar:

![Snackbar with custom](screenshots/custom.png)

```Java
new Restaurant(MainActivity.this, "Snackbar with custom background and text color", Snackbar.LENGTH_LONG)
    .setBackgroundColor(Color.GRAY)
    .setTextColor(Color.GREEN)
    .show();
```