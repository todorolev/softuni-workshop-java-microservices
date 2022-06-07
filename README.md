Файлът [microservices.md](./microservices.md) съдържа цялата информация от семинара. Файлът [microservices-short.md](./microservices-short.md) съдържа само основните неща и диаграми.

[cart-service](./cart-service/) и [order-service](./order-service/) са микросървисите, използвани за примера по време на семинара

**Пример:** онлайн магазин с микросървисна архитектура с два отделни микросървиса - cart-service и order-service

### [cart-service](./cart-service/)
*Build:* ``mvn clean install`` <br/>
*Start:* Стартирайте ``main()`` метода в IDE или с ``java -jar ./cart-service/target/cart-service-0.0.1-SNAPSHOT.jar``

**Endpoints**<br/>
*Add To Cart*<br/>
``curl --request POST \
  --url http://localhost:8080/cart \
  --header 'Content-Type: application/json' \
  --data '{
	"id": "book",
	"qty": 5
}'``
<br/>
*Empty Cart*<br/>
``curl --request DELETE \
  --url http://localhost:8080/cart``

### [order-service](./order-service/)
*Build:* ``./gradlew clean build`` или (Windows) ``.\gradlew clean build``<br/>
*Start:* Стартирайте ``main()`` метода в IDE или с ``java -jar ./order-service/build/libs/order-service-0.0.1-SNAPSHOT.jar``

**Endpoints**<br/>
*Make Order*<br/>
``curl --request POST \
  --url http://localhost:8081/order``

При заявка към *Make Order*, order-service ще направи заявка към *Empty Cart* на cart-service. Заявките могат да бъдат проследени с output съобщения.
