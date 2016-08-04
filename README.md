# PreferenceLibrary

修改自[MaterialPreferenceLibrary](https://github.com/AndroidDeveloperLB/MaterialPreferenceLibrary)

增加了添加toolbar的功能

# build
```
git clone https://github.com/Ahaochan/PreferenceLibrary
cd PreferenceLibrary
./gradlew app:assembleDebug
```

## Maven
```
<dependency>
  <groupId>com.ahaochan</groupId>
  <artifactId>PreferenceLibrary</artifactId>
  <version>0.0.1</version>
  <type>pom</type>
</dependency>
```
## Gradle
```
compile 'com.ahaochan:PreferenceLibrary:0.0.1'
```
## Ivy
```
<dependency org='com.ahaochan' name='PreferenceLibrary' rev='0.0.1'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

# use
```
public class SettingActivity extends AppCompatPreferenceActivity {
	.....
}
```