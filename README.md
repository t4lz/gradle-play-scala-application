# gradle-play-scala-application

Trying to run a Scala Play 2 app, built with gradle, on IntelliJ with `Application` type run configuration.
Currently getting:
```
Oops, cannot start the server.
@83ohm4718: Cannot load play.application.loader[play.application.loader [play.api.inject.guice.GuiceApplicationLoader] was not loaded.]
	at play.utils.Reflect$.loadClass$1(Reflect.scala:132)
	at play.utils.Reflect$.configuredClass(Reflect.scala:145)
	at play.api.ApplicationLoader$.apply(ApplicationLoader.scala:85)
	at play.core.server.ProdServerStart$.start(ProdServerStart.scala:53)
	at play.core.server.ProdServerStart$.main(ProdServerStart.scala:28)
	at play.core.server.ProdServerStart.main(ProdServerStart.scala)
Caused by: java.lang.ClassNotFoundException: play.api.inject.guice.GuiceApplicationLoader
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at play.utils.Reflect$.loadClass$1(Reflect.scala:126)
	... 5 more
```
