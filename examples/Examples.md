# Prep

Before starting ensure that:
1. all `antBuild`, `lib`, `target` and `build` directories have been deleted out of the examples folder
2. ant work with ivy installed
3. mvn works
4. gradle works
5. all programs with notifications are closed
6. no updates are going to start during the presentation

Prep in the room by:
1. Setting your shell to the correct examples directory
2. enlarging your shell font so that it can be seen at the back of the room
3. enlarging your text editor font so that it can be seen at the back of the room

# compare-basic
1. Go through build.xml file, run `ant`, show `antBuild` directory exists
2. Go through pom.xml file, run `mvn install`, show `target` directory exists
3. Go through build.gradle, run `gradle build`, show `build` directory exists

# compare-unittest
1. Go through build.xml & ivy.xml files, run `ant`, show `antBuild` & `lib` directory exists
2. Go through pom.xml file, run `mvn install`, show `target` directory exists
3. Go through build.gradle, run `gradle build`, show `build` directory exists

# convert-maven
1. Show that we have a working maven project by running `mvn install`
2. Convert to gradle using `gradle init --type pom`
3. Show all the files and explain what they do
  1. build.gradle
  2. settings.gradle
  3. gradlew

# standardJava
1. settings.gradle - used to set the project name, executes during intialization phase
2. gradle.properties - used to setup variables, these can be overriden on the command line with a `-P`
3. build.gradle
  1. Go through the plugins and what each one does
  2. Explain default task
  3. skim dependencies because it has already been covered
  4. Explain that Gradle still doesn't support publishing Source & Javadoc so it should be setup manually
  5. `maven-publish` no the `maven` plugin because the `maven` plugin inherited a bug/behavior from the maven tool where every publish adds a new artifact instance to the local maven cache, this causes TeamCity to run out of disk space
  6. It is generally a good idea to include the gradle wrapper task definition, even though it isn't required, becuase it documents which version of gradle the build expects
  7. The eclipse configuration is to show that while Gradle provides rational defaults, if you need to change them you can
4. run `gradlew` twice to show the `UP-TO-DATE` meesages, then show `gradlew --rerun-tasks` to override
5. show how to use `gradlew --refresh-dependencies` to force check for snapshots
6. show how to use `gradlew tasks` and `gradlew tasks --all` to find available tasks

# thirdPartyPlugin
Show the build.gradle, explain that buildscript run during initialization time, so that its artifacts are available to the build at configuration time


