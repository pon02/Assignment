# Assignment
## 目的
・ Serviceを利用したRead処理の実装  
・ 例外処理の実装

## データベース概要
・ データベース名: taxi_order  
・ デーブル数: 4  
・ テーブル名: taxi_orders,taxi_companies,car_types,staff_sections  
```
mysql> show tables;
+----------------------+
| Tables_in_taxi_order |
+----------------------+
| car_types            |
| staff_sections       |
| taxi_companies       |
| taxi_orders          |
+----------------------+
4 rows in set (0.02 sec)
```
## 動作確認
1. レコードの全件取得  
* taxi_ordersテーブル  
    - URL : http://localhost:8080/taxiorder  
    - メソッド : GET  
    - レスポンス : taxi_ordersの全レコード  
 <img width="400" alt="スクリーンショット 2024-03-24 13 39 41" src="https://github.com/pon02/Assignment/assets/140311845/5ab5995c-a926-48f1-85db-6ea925a45af8">

```sh
makiba@PonBook Assignment % curl --location 'http://localhost:8080/taxiorder' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /taxiorder HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/8.1.2
> Accept: */*
> 
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Sun, 24 Mar 2024 04:49:02 GMT
< 
* Connection #0 to host localhost left intact
[{"id":1,"taxi_company_id":1,"car_type_id":4,"staff_section_id":1,"number_of_people":20},{"id":2,"taxi_company_id":1,"car_type_id":1,"staff_section_id":4,"number_of_people":4},{"id":3,"taxi_company_id":2,"car_type_id":3,"staff_section_id":2,"number_of_people":8},{"id":4,"taxi_company_id":3,"car_type_id":2,"staff_section_id":3,"number_of_people":7}]%
```

他、３テーブルも問題なく全件取得  


2. クエリ文字列から条件を指定してレコード取得、レコードがない場合例外処理を行う
* taxi_ordersテーブルからtaxi_company_idを指定してレコードを取得
    - URL : http://localhost:8080/taxiorder/company?taxi_company_id=1
    - メソッド : GET  
    - レスポンス : 500 Internal Server Error
