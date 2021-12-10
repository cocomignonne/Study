// // document는 이미 브라우저에 존재하는 객체로, 우리가 접근하는 HTML을 가리키는 객체이다. = 우리가 HTML로 접근할 수 있는 방법
// // document.title = "Hi!! JS!!";

// console.log(title);
// console.dir(title);

// title.innerText = "got u";

// console.log(title.id);
// console.log(title.className);

// const hellos = document.getElementsByClassName("hello");

// console.log(hellos);

// const bye = document.getElementsByClassName('Bye');

// console.log(bye);


// // querySelector(), querySelectorAll()
// // querySelector() : 요소를 css방식으로 검색할 수 있다  (결과값이 배열이 아님 여러개의 경우 첫번째 값만 나옴)
// // querySelectorAll() : 요소를 css방식으로 검색할 수 있다 (결과값이 배열이다)

// const title1 = document.querySelector(".Bye>h1");
// console.log(title1);
// const title2 = document.querySelector(".Bye h1");
// console.log(title2);
// const title3 = document.querySelector(".Bye h1:first-child");
// console.log(title3);
// const title4 = document.querySelectorAll(".Bye h1");
// console.log(title4);

const title5 = document.querySelector('div.Bye h1');
console.log(title5);
function handleTitleClick() {
    // console.log(title5.style.color);  //getter
    // title5.style.color = 'blue';   // setter
    // console.log(title5.style.color);   //getter

    // const currentColor = title5.style.color;
    // let newColor;
    // if(currentColor === 'blue') {
    //     newColor = 'rosybrown';
    // } else {
    //     newColor = 'blue';
    // }
    // title5.style.color = newColor;

    // 니꼬 3-8강의 듣기

    title5.className = 'active';
}
// function handleMouseEnter(){
//     title5.innerText = 'Mouse is here'; 
// }
// function handleOnMouseLeave(){
//     title5.innerText = 'Mouse is gone'; 
// }
// function handleWindowResize(){
//     document.body.style.backgroundColor = 'rosybrown';
// }
// function handleWindowCopy(){
//     alert('copier!');
// }
// function handleWindowOnline(){
//     alert('ALL GOOD');
// }
// function handleWindowOffline(){
//     alert('SOS no WIFI');
// }

title5.addEventListener('click', handleTitleClick);
// // title5.onclick = handleTitleClick;
// title5.addEventListener('mouseenter', handleMouseEnter);
// title5.addEventListener('mouseleave', handleOnMouseLeave);

// window.addEventListener('resize', handleWindowResize);
// window.addEventListener('copy', handleWindowCopy);
// window.addEventListener('online', handleWindowOnline);
// window.addEventListener('offline', handleWindowOffline);




















