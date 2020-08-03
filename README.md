# Grails-practice

## Grails（グレイルズ）

プログラミング言語Groovyを使用するオープンソースのWebアプリケーションフレームワーク<br>
GrailsやGroovyはJavaプラットフォーム上で動作する

## 導入（Windows向け）

* Githubから、grails-4.0.4.zipをダウンロード<br>
https://github.com/grails/grails-core/releases

## コマンド

* **アプリ「hoge」の生成**
```
grails create-app hoge
```
* **コントローラー「hoge」の生成**
```
grails> create-controller hoge
```

## エラー解消
```
$ grails create-app app_name
```
```
java.lang.NoClassDefFoundError: Could not initialize class org.codehaus.groovy.vmplugin.v7.Java7
        at org.codehaus.groovy.vmplugin.VMPluginFactory.<clinit>(VMPluginFactory.java:43)
        at org.codehaus.groovy.reflection.GroovyClassValueFactory.<clinit>(GroovyClassValueFactory.java:35)
        at org.codehaus.groovy.reflection.ClassInfo.<clinit>(ClassInfo.java:107)
        at org.codehaus.groovy.reflection.ReflectionCache.getCachedClass(ReflectionCache.java:95)
        at org.codehaus.groovy.reflection.ReflectionCache.<clinit>(ReflectionCache.java:39)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.registerMethods(MetaClassRegistryImpl.java:209)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java:107)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java:85)
        at groovy.lang.GroovySystem.<clinit>(GroovySystem.java:36)
        at org.codehaus.groovy.runtime.InvokerHelper.<clinit>(InvokerHelper.java:86)
        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.bitwiseNegate(ScriptBytecodeAdapter.java:842)
        at org.grails.config.NavigableMap.<clinit>(NavigableMap.groovy)
        at org.grails.cli.GrailsCli.<clinit>(GrailsCli.groovy:77)
Exception in thread "main" java.lang.NoClassDefFoundError: Could not initialize class org.codehaus.groovy.reflection.ReflectionCache
        at org.codehaus.groovy.runtime.dgmimpl.NumberNumberMetaMethod.<clinit>(NumberNumberMetaMethod.java:33)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)
        at java.base/java.lang.reflect.ReflectAccess.newInstance(ReflectAccess.java:124)
        at java.base/jdk.internal.reflect.ReflectionFactory.newInstance(ReflectionFactory.java:346)
        at java.base/java.lang.Class.newInstance(Class.java:604)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.createMetaMethodFromClass(MetaClassRegistryImpl.java:257)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java:110)
        at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java:85)
        at groovy.lang.GroovySystem.<clinit>(GroovySystem.java:36)
        at org.codehaus.groovy.runtime.InvokerHelper.<clinit>(InvokerHelper.java:86)
        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.bitwiseNegate(ScriptBytecodeAdapter.java:842)
        at org.grails.config.NavigableMap.<clinit>(NavigableMap.groovy)
        at org.grails.cli.GrailsCli.<clinit>(GrailsCli.groovy:77)
```
```
java.lang.NoClassDefFoundError：クラスorg.codehaus.groovy.vmplugin.v7.Java7を初期化できませんでした
```
