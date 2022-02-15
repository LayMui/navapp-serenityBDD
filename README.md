# serenityBDD-navapp

Need to change the path pointing to the artefact app and ipa in the serenity.properties file

Issues with applitools:
Scrolling effect


At a terminal, start appium
```
appium 
```

Run the script
```
./serenity.sh iOS
```


Update chromedriver version:
```
brew install chromedriver
chromedriver --version
xattr -r  -d com.apple.quarantine /usr/local/bin/chromedriver
```
Note:
Serenity version 3.2.0 is out (https://github.com/serenity-bdd/serenity-core/blob/master/docs/release-notes/3.2.0.md).