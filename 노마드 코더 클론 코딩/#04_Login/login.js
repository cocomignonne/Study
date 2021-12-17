// const loginForm = document.getElementById('login-form');

// querySelector로는 classname, tagname 모두 검색이 가능하니까 id라는걸 명시해줘야 한다.
const loginForm = document.querySelector('#login-form');
const loginInput = document.querySelector('#login-form input');
const greeting = document.querySelector('#greeting');
// const loginButton = document.querySelector('#login-form button');
const HIDDEN_CLASSNAME = "hidden"; // 대문자로 작성한 이유 : string만 포함된 중요하지 않은 정보를 담은 변수
const USERNAME_KEY = "username";

// function onLoginBtnSubmit(tomato) {
    // let userName = loginInput.value;
    // if(userName === '') {
    //     alert('Please write ur name!') 
    // } else if(userName.length > 15 ) {
    //     alert('Ur name is too long!')
    // }
    // console.log(userName);  
    //form태그 안에 있는 button이나 type이 submit인 input을 클릭하면 내가작성한 데이터가 넘어가기 때문에 콘솔에 찍히지 않음!!!!!!!

//     tomato.preventDefault();  // window의 기본동작을 막아주는 역할을 한다.
//     console.log(tomato);
// };

function handleLinkClick(event){
    event.preventDefault();
    // console.dir(event);
    // alert('clicked!!!');   // alert가 일시적으로 브라우저의 기본 동작을 못하게 막고 있음
    const username = loginInput.value;
    localStorage.setItem(USERNAME_KEY, username);
    loginForm.classList.add(HIDDEN_CLASSNAME);
    // greeting.innerHTML = "Hello " + username;
    paintGreetings(username);
}
// loginButton.addEventListener('click', onLoginBtnClick);
// loginForm.addEventListener('submit', handleLinkClick); // 제출되고 새로고침되는 상태

function paintGreetings(username) {
    greeting.innerHTML = `Hello ${username}`;
    greeting.classList.remove(HIDDEN_CLASSNAME);

}

const savedUsername = localStorage.getItem(USERNAME_KEY);
console.log(savedUsername);

if(savedUsername === null) {
    // form보여주기
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    loginForm.addEventListener('submit', handleLinkClick);
}else {
    // greeting 보여주기
    paintGreetings(savedUsername);
}

// const link = document.querySelector('a');


// link.addEventListener('click', handleLinkClick);


