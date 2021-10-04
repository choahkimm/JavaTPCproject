# 📙 JavaTPCproject 

인프런 javaTPC 강의 정리


## [ part 1 ] 

### class
- DataType 측면 : 새로운 자료형을 만드는(설계하는) 도구 = 모델링 도구
- OOP(객체지향) 측면 : 객체의 상태정보와 행위정보를 추출하여 캡슐화 하는 도구 

### Model 
class를 Model이라고도 부른다. **역할**이 정해지기 때문 

- 우리가 만드는 Model의 종류 
  1. '데이터를 담는 그릇'
    - DTO (Data Transfer Object) : 데이터 구조, 데이터를 담는 역할, 이동하기 위해서 데이터를 담음 
    - VO (Value Object) : 객체를 담아서 하나의 값(덩어리)으로 취급한다는 의미
    
  2. '비즈니스 로직을 가지고 있는 객체'
    - DAO (Data Access Object) : 데이터를 처리하는 역할(비즈니스 로직), 데이터베이스와 CRUD하는 역할
    
  3. Utility(Helper Object) : 도움을 주는 기능을 제공하는 역할 (날짜, 시간, 통화, 인코딩 등) 
  
- 앞으로 사용하게 될 class들 : API(Application Programming Interface) 
  1) Java에서 제공해주는 class들 - ex) String, System, Integer, ArrayList, Map 등
  2) 만들어 사용하는 class들 (DTO, DAO, Utility) 
  3) 1,2번이 아닌 다른 사람이 만들어서 제공해주는 class들 - ex) Gson, Jsoup, POI, iText 등 
  
  
  
  
## [ part 2 ] 
