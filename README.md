# Login-Servlet-JSP
Software Pattern &amp; Architecture Course Project

#### แบบบ้านๆ ใน Terminal

```
mvn clean install
mvn tomcat7:run
```

#### Eclipse Java EE

##### Import project
```
File > Import > Maven > Existing Maven Projects
```

ปล. ติ๊ก `Add project(s) to working set ด้วย

##### compile

```
คลิกขวา > Run As > Maven build...
```

ตรง `goals` ให้ใส่ `clean install`

กดรันทีนึงจนขึ้น `success`

##### run

```
คลิกขวา > Run As > Maven build...
```

ตรง `goals` ให้ใส่ `tomcat7:run`

ถ้าไม่ error จะเข้า `localhost:8080/app` ได้
