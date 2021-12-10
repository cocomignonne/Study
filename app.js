let a = 4;
const b = 2;
const myName = "chloe";
// 값을 선언할 때 var, const, let을 사용할 수 있다.
// const는 상수로 값이 바뀌지 않는 수를 의미
// let은 값을 바꿀 수 있는 변수이다.

console.log(a + b);
console.log(a * b);
console.log(a / b);
console.log("hello " + myName + "!");



const amIFat = true;
let something;
let nothing = null;
console.log(amIFat, nothing, something);



// const mon = "mon";
// const tue = "tue";
// const wed = "wed";
// const thu = "thu";
// const fri = "fri";
// const sat = "sat";
// const sun = "sun";

// const daysOfWeek = mon + tue + wed + thu + fri + sat + sun;
// const daysOfWeek = [mon, tue, wed, thu, fri, sat, sun];   //array형식

const daysOfWeek = ["mon", "tue", "wed", "thu", "fri", "sat", "sun"]; 
console.log(daysOfWeek);

// array에서 값을 가져오기
console.log(daysOfWeek[4]);
// array에 값을 하나 추가하기
daysOfWeek.push("-End-");

console.log(daysOfWeek);



const playerName = "chloe";
const playerPoints = 121212;
const playerHandsome = true;
const playerFat = "little bit";

const player1 = ["chloe", 121212, true, "little bit"];


// object만들기 (property를 가진 데이터를 저장하는 것)
// object만들 때 {}안에는 =을 쓰지않는다

const player2 = {
    name: "chloe",
    points: 12,
    fat: true,
}
console.log(player2);
console.log(player2.name);
console.log(player2["points"]);

player2.fat = false;  // object의 값 갱신하기
console.log(player2);

player2.gender = "F";  // object에 값 추가하기
console.log(player2);

player2.points += 15;
console.log(player2);

function sayHello(name, age) {
    console.log("hello, " + name);
    console.log(name + "은 " + age + "세 입니다.");
}

sayHello("chloe");
sayHello("chloe", 27);


function plus() {
    console.log(2 + 2);
}
plus();

const calculator = {
    plus: function(a, b) {
        return a + b;
    },
    minus: function(a, b) {
        return a - b;
    },
    divide: function(a, b) {
        return a / b;
    },
    multiply: function(a, b) {
        return a * b;
    },
    power: function(a, b) {
        return a ** b;
    },
}

const plusResult = calculator.plus(397, 234);
const minusResult = calculator.minus(plusResult, 10);
const divideResult = calculator.divide(minusResult, 234);
const multiplyResult = calculator.multiply(divideResult, 2);
const powerResult1 = calculator.power(3, 2);
const powerResult2 = calculator.power(3, 3);

// console.log(plusResult);
// console.log(minusResult);
// console.log(divideResult);
// console.log(multiplyResult);
// console.log(powerResult1);
// console.log(powerResult2);


const myAge = 27;
function calculateFrAge(ageOfKorean) {
    return ageOfKorean - 2;
}
const foreignerAge = calculateFrAge(myAge);
console.log(foreignerAge);

console.log(calculateFrAge(myAge));


// 나이물어보고 숫자입력 시 콘솔 창에 출력 다른 문자 입력 시 알림문구 출력 후 다시 입력 반복

while(true){
    const age = parseInt(prompt("How old are you?")); 
    if(isNaN(age) || age < 0){
        alert("plz write a number(not '-').");  // a real positive number.
    } else {
        alert("thank you for writing ur age.");
        console.log(age);
        if (age >= 18 && age <= 50 ){
            alert("You can drink!!");
        } else if (age < 18) {
            alert("You are too young to drink.");
        } else {
            alert("It is better not to drink.");
        }
        break;
    }
}








