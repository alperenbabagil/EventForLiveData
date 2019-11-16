# Event For Live Data
Simple event structure for single-time events like showing popup observed from LiveData

Taken from [JoseAlcerreca](https://github.com/JoseAlcerreca)'s medium post and packaged into gradle library for ease of use.

https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150

## Installing

**Step 1.** Add it in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
  
**Step 2.** Add the dependency

```
dependencies {
  implementation 'com.github.alperenbabagil:EventForLiveData:1.1.1'
}
```

## Usage

Wrap your data with `Event<T>` class. Then use it in `LiveData`

`val observeMe : LiveData<Event<MyAwesomeModel>>`

Then observe your viewModel with `EventObserver<T>`

```
viewModel.observeMe.observe(this,EventObserver{ myAwesomeModel -> 
    // Every Event instance observed here once
})
```

or just use `observeEvent` extension function of `LiveData`

```
viewModel.observeMe.observeEvent(this){ myAwesomeModel ->
    // Every Event instance observed here once
}
```
  
  






