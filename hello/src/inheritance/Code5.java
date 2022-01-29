// package inheritance;

// class Person{
//     private String name;
//     private String email;

//     Person(){}
//     Person(String name){
//         this.name = name; //퍼슨 생성자를 밑에서 부르면 이쪽으로 이름이 들어가고
//     }

//     Person(String name, String email){
//         this(name);
//         this.email = email;  // 여기서 인스턴스를 새로만든 곳에서의 디스이기 떄문에 그쪽에서 들어운 이름과 이메일 을 변수에 등록
//     }
// }

// class Student extends Person{
//     private int score;
//     private int year;

//     Student(){}
//     Student(String name, String email){
        
//         super(name, email); // 부모의 등록된 네임과 이메일을 호출

//     }
//     Student(String name, String email, int score){
//         super(name, email); // 디스의 이메일과 들어온 스코어를 사용
//         this.score = score;

//     }

//     Student(String name, String email, int score, int year){
//         // this(name, email); // this()s는 다른 생성자를 의미 합니다. // 네임과 이메일이 만 들어간 콘스트럭터를 호출한 값을 가져온다.
//         // super(name,email)
        
//         this.score = score;
//         this.year= year;
//     }
// }


// public class Code5 {
    
// }
// //필요에따라 결국 슈퍼를 써서 부모에서 가져올것인지 새로 자식 인스탄스를 이용한 this를 쓸것인지 작성자가 결정할 문제