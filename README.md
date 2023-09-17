# android前端开发

## 1. 项目结构
    
    ```
    ├── app
    │   ├── build.gradle
    │   ├── libs
    │   ├── proguard-rules.pro
    │   └── src
    │       ├── androidTest
    │       ├── main
    │       │   ├── AndroidManifest.xml 
    │       │   ├── java
    │       │   │   └── com
    │       │   │       └── example
    │       │   │           └── app
    │       │   │               ├── App.java
    │       │   │               ├── base
    ```

## 2. 命名规范

### 2.1 包名

包名全部小写，连续的单词只是简单地连接起来，不使用下划线，采用反域名命名规则，全部使用小写字母。
res包名：以模块名开头，如：main，login.


## 3. 代码实现过程问题

1. ConstraintLayout布局
2. bias属性:0.5表示居中,0表示左边,1表示右边
3. layout_constraintHorizontal_bias:水平方向的偏移量
4. layout_constraintVertical_bias:垂直方向的偏移量
5. ratio:宽高比
6. menu无法修改颜色
7. 图片太大会导致内存溢出,注意把图片放在drawable-xxhdpi目录下

