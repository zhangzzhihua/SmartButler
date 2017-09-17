



- 1开发环境

    - Gradle 版本:com.android.tools.build:gradle:2.2.2
    - JDK 版本: 1.8.0_101
    - Android Studio：2.2.2
    - minSdkVersion：21
    - targetSdkVersion 24


- 2.Android6.0的模拟器上运行会报错
这是因为Android6.0权限需要动态获取，和RxVolley的缓存策略有一定的冲突，只需要把app/build.gradle里的

```java
compile'com.kymjs.rxvolley:rxvolley:1.1.0'
``版本更改为1.1.2即可解决

- 3.归属地查询不出现图片
这是因为聚合数据官方API的改动所导致的,归属地查询API地址:

    - https://www.juhe.cn/docs/api/id/11

我们解析api获取json数据的时候可以发现这么一段代码

```java
{
    "resultcode":"200",
    "reason":"Return Successd!",
    "result":{
        "province":"浙江",
        "city":"杭州",
        "areacode":"0571",
        "zip":"310000",
        "company":"中国移动",
        "card":"移动动感地带卡"
    }
}
```

而我们是根据"company":"中国移动"这个字段来显示图片的，所以你在代码中一定可以看到这样的一段代码

```java
   switch (company) {
       case "中国移动":
           iv_company.setBackgroundResource(R.drawable.china_mobile);
           break;
        case "中国联通":
           iv_company.setBackgroundResource(R.drawable.china_unicom);
            break;
         case "中国电信":
            iv_company.setBackgroundResource(R.drawable.china_telecom);
            break;
      }
```

而在最新的API中，company中已经没有中国两个字了，所以你只要去掉这三个中国，就可以了

- 4.

- 5.百度地图没有显示原因

    - -1.key无效
    - -2.模拟器

第二种情况是模拟器，因为硬件需要，所以模拟器不会显示地图，使用真机就可以避免

```