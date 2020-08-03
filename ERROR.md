# Grails-practice

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
**対策**
2020年8月3日現在、Grails4.0.4は、JDK14に対応していないとのこと。
Java11をダウンロードして環境パスに設定して再起動することにより解決した。

1<br>https://www.oracle.com/java/technologies/javase-jdk11-downloads.html より<br>Windows x64 Compressed Archive　をダウンロードする。<br>
2<br>ライセンスに同意したあとにログイン<br>
3<br>ダウンロードが開始されるので任意の場所にダウンロード<br>
4<br>ZIPを展開する<br>
5<br>展開したフォルダの名前をJAVA_HOMEに変更する<br>
6<br>JAVA_HOME内のbinフォルダのパスを取得する　例えば　C:\Users\user\Documents\DevelopParts\JAVA_HOEM\bin　とか。<br>
7<br>画面左下のウインドウズボタンを左クリック、歯車（設定）を左クリック、システム＞バージョン情報＞システム情報＞システムの詳細設定<br>
8<br>環境変数ボタンを押下、ユーザー環境変数のPathを選択し、編集ボタンを押下、新規ボタンを押して対策手順【6】のパスを登録<br>
9<br>この際、他にJAVAのパスを登録してあれば、それより上に設定されるようにする<br>
10<br>再起動すればOK<br>

* Grailsの今後のバージョンアップでJDK14に対応する可能性あり。
