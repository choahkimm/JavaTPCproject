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

### 객체지향 프로그래밍의 3대 특징
  1. 정보 은닉
  2. 상속
  3. 다형성 
  
### 다형성 
상속 관계에 있는 클래스에서 상위 클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작시키는 객체지향 원리(개념)

### 다형성 이론의 전제조건
  - 상속 관계가 되어야 한다
  - 객체 생성을 upcasting으로 할 것 (상위 클래스가 하위 클래스에게 메시지를 보내야 하므로) --> upcasting이 되면 downcasting을 할 수 있다. 
  - 하위 클래스가 반드시 재정의(override) 해야 한다 = 다형성 보장 위해 
  - 동적 바인딩을 통해 실현된다 (동적 바인딩 : 실행시점에서 사용될 메서드가 결정되는 바인딩. 프로그램 속도를 떨어뜨리는 원인이 되기도 하지만 장점이 많아 사용) 

### 추상 클래스와 인터페이스의 공통점 
  - 다형성을 보장하기 위해서 등장
  - 객체를 생성할 수 없다 (new X)
  - 하위 클래스에 의해 구현되어야 한다. (override 재정의 필수)
  - 부모(상위 클래스)의 역할로 사용한다. (upcasting으로 객체를 생성)
  - 추상 메서드를 가진다. 
