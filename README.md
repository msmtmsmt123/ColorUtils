# ColorUtils
![version：1.0.0](https://img.shields.io/badge/version%20-1.0.0-brightgreen.svg)
![API：15+](https://img.shields.io/badge/API-15%2B-brightgreen.svg)
![QQ：779754469](https://img.shields.io/badge/QQ-779754469-red.svg) 

Android中的颜色工具，可以实现颜色变化，颜色透明度变化，颜色格式转换，颜色格式判断等。

## 注意
- Android下的颜色为16进制的ARGB（Alpha，Red，Green，Blue），如：“#ff00ab87”
- 本工具中指的16进制颜色字符串将不包括符号“#”，如：“ff00ab87”

## 使用
- **使用场景**

    手动输入一个颜色，生成几个加深或者变浅的颜色，给Activity设置主题色。
- **判断**
```
//判断字符串是否为16进制。如“ff00ab87”,返回true
judgeColorString(String string)      
```
- **调整颜色值（加深，变浅）**
```
//颜色加深，可调度数：0~255,返回颜色值可直接使用
TranslateDark(String argbColor, int darkValue)      
TranslateDark(int colorInt, int darkValue) 

//颜色变浅，可调度数：0~255，返回颜色值可以直接使用
TranslateLight(String color, int lightValue)        
TranslateLight(int colorInt, int lightValue)

 //不透明度加强，可调度数：0~255，返回颜色值可以直接使用
DarkAlpha(int colorInt, int addValue)
DarkAlpha(String color, int addValue)

 //透明度加强，可调度数：0~255
LightAlpha(int colorInt, int darkValue)
LightAlpha(String argbColor, int darkValue)
```
- **颜色格式转换**
```
//将16进制颜色（String）转化为10进制（Int）
StringTransInt(String color)

//将10进制颜色（int）值转换成16进制(String)
intToString(int value)

//将10进制颜色（Int）转换为Drawable对象
intToDrawable(int color)
    
//将16进制颜色（String）转化为Drawable对象
stringToDrawable(String color)
```

## 引用

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Add the dependency

	dependencies {
	        compile 'com.github.QzwJuHao:ColorUtils:v1.0.0'
	}
