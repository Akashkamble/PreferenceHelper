# PreferenceHelper

PreferenceHelper makes sharedpreferences more easier.

## Installation
**Step 1:** Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2:** Add the dependency


```gradle
compile 'com.github.Akashkamble:PreferenceHelper:1.0.1'
```
## How to use
First initialize PreferenceHelper then you are ready to go.

```Java
PreferenceHelper.initialize(<-CONTEXT->);
```

Save values in SharedPreferences

You can store 
- String
- int
- float
- long

```Java
PreferenceHelper.save(<-KEY->, <-VALUE->);
```

Check if key already present in SharedPreferences
```Java
PreferenceHelper.contains(<-KEY->);
```

Get value of particular key from SharedPreferences
```Java
PreferenceHelper.get(<-KEY->)
```

Remove key from SharedPreferences
```Java
PreferenceHelper.removeKey(<-KEY->);
```
