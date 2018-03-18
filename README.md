
# react-native-email-launcher

## Getting started

`$ npm install react-native-email-launcher --save`

### Mostly automatic installation

`$ react-native link react-native-email-launcher`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNEmailLauncherPackage;` to the imports at the top of the file
  - Add `new RNEmailLauncherPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-email-launcher'
  	project(':react-native-email-launcher').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-email-launcher/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-email-launcher')
  	```


## Usage
```javascript
import RNEmailLauncher from 'react-native-email-launcher';

// TODO: What to do with the module?
RNEmailLauncher;
```
  # EmailLauncher
# EmailLauncher
