# TDD @Gilded Rose


## 开发环境
 - JDK1.8+
 
## 业务需求

"镶金玫瑰"！这是一家魔兽世界里的小商店。出售的商品也都是高质量的。但不妙的是，随着商品逐渐接近保质期，它们的质量也不断下滑。我们用一个IT系统来更新库存信息。

首先，简单介绍一下我们的系统：

- 所有商品都有一个`SellIn`值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个`Quality`值，代表商品的价值
- 商品的`SellIn`值和`Quality`值，它们每天会发生变化，但是会有特例


商品的价格规则说明如下：

- 商品的价值永远不会小于0，也永远不会超过50
- 一旦过了保质期，`Quality`就以双倍的速度下滑
- 陈年干酪（`Aged Brie`）是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯（`Sulfuras`）是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票（`Backstage pass`）和陈年干酪（`Aged Brie`）有相似之处：
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0

## Tasking

**常规商品**
```text
GIVEN：普通商品, Sellin 10，Quality 10
WHEN: 经过1天
THEN: Sellin为9，Quality 为 9
```


```text
GIVEN：普通商品, Sellin 0，Quality 10
WHEN: 经过1天
THEN: Sellin为-1，Quality 为 8
```

```text
GIVEN：普通商品, Sellin 10，Quality 60
WHEN: 创建商品
THEN: 抛出异常"over max quality"
```

**萨弗拉斯**
```text
GIVEN: 萨弗拉斯, Sellin为10, Quality为30
WHEN: 经过1天
THEN: Sellin为10, Quality为30
```

```text
GIVEN: 萨弗拉斯, Sellin为1, Quality为30
WHEN: 经过1天
THEN: Selling为1, Quality为30
```

```text
GIVEN: 萨弗拉斯, Sellin为1, Quality为30
WHEN: 经过2天
THEN: Selling为1, Quality为30
```

**陈年干酪**
```text
GIVEN: 陈年奶酪，Selling为11，Quality 为30
WEHN: 经过1天
THEN: Selling为10，Qualitry为31
```

```text
GIVEN: 陈年奶酪，Selling为10，Quality 为30
WEHN: 经过1天
THEN: Selling为9，Qualitry为32
```

```text
GIVEN: 陈年奶酪，Selling为6，Quality 为30
WEHN: 经过1天
THEN: Selling为5，Qualitry为32
```

```text
GIVEN: 陈年奶酪，Selling为5，Quality 为30
WEHN: 经过1天
THEN: Selling为4，Qualitry为33
```

```text
GIVEN: 陈年奶酪，Selling为1，Quality 为30
WEHN: 经过1天
THEN: Selling为0，Qualitry为33
```

```text
GIVEN: 陈年奶酪，Selling为0，Quality 为30
WEHN: 经过1天
THEN: Selling为-1，Qualitry为0
```
**后台门票**
```text
GIVEN: 后台门票，Selling为11，Quality 为30
WEHN: 经过1天
THEN: Selling为10，Qualitry为31
```

```text
GIVEN: 后台门票，Selling为10，Quality 为30
WEHN: 经过1天
THEN: Selling为9，Qualitry为32
```

```text
GIVEN: 后台门票，Selling为6，Quality 为30
WEHN: 经过1天
THEN: Selling为5，Qualitry为32
```

```text
GIVEN: 后台门票，Selling为5，Quality 为30
WEHN: 经过1天
THEN: Selling为4，Qualitry为33
```

```text
GIVEN: 后台门票，Selling为1，Quality 为30
WEHN: 经过1天
THEN: Selling为0，Qualitry为33
```

```text
GIVEN: 后台门票，Selling为0，Quality 为30
WEHN: 经过1天
THEN: Selling为-1，Qualitry为0
```
