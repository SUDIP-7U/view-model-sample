The key benefits of the ViewModel class are essentially two:

It allows you to persist UI state.
It provides access to business logic.
![image](https://github.com/user-attachments/assets/7a40645d-1b2e-4b50-8c3a-0c8d99d3e6ae)

know more about -->> view-model & live data
https://developer.android.com/jetpack/androidx/releases/lifecycle


//set up viewmodel 

Dependency {

val lifecycle_version = "2.8.7"
        val arch_version = "2.2.0"
        // ViewModel
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
}
