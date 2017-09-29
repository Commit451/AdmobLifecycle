# AdmobLifecycle
Prebuilt Admob ad view lifecycle observers

[![Build Status](https://travis-ci.org/Commit451/AdmobLifecycle.svg?branch=master)](https://travis-ci.org/Commit451/AdmobLifecycle) [![](https://jitpack.io/v/Commit451/AdmobLifecycle.svg)](https://jitpack.io/#Commit451/AdmobLifecycle)

# Usage
To start listening for connectivity change events:
```kotlin
val adView = findViewById<AdView>(R.id.adview)
val lifecycleObserver = AdViewLifecycleObserver(adView)
// within support v26.1.0, AppCompatActivity
lifecycle.addObserver(lifecycleObserver)
```

License
--------

    Copyright 2017 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
