# Project to show a bug on coverage on quarkus


This is a project to show how the coverage of a quarkus project fails.

This is based on the [MEASURING THE COVERAGE OF YOUR TESTS](https://quarkus.io/guides/tests-with-coverage)


## Reproduce error

```
mvn clean verify
```

Error:

```
 Build step io.quarkus.arc.deployment.configproperties.ConfigPropertiesBuildStep#setup threw an exception: java.lang.IllegalArgumentException: Configuration properties class org.acme.quickstart.GreetingsConfiguration does not have a setter for field boolean[] org.acme.quickstart.GreetingsConfiguration.$jacocoData nor is the field a public non-final field
	at io.quarkus.arc.deployment.configproperties.ClassConfigPropertiesUtil.populateConfigObject(ClassConfigPropertiesUtil.java:221)
	at io.quarkus.arc.deployment.configproperties.ClassConfigPropertiesUtil.addProducerMethodForClassConfigProperties(ClassConfigPropertiesUtil.java:172)
	at io.quarkus.arc.deployment.configproperties.ConfigPropertiesBuildStep.setup(ConfigPropertiesBuildStep.java:89)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:915)
	at io.quarkus.builder.BuildContext.run(BuildContext.java:279)
	at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2011)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1535)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1426)
	at java.base/java.lang.Thread.run(Thread.java:834)
	at org.jboss.threads.JBossThread.run(JBossThread.java:479)
```

