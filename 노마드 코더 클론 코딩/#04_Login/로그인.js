// const loginForm = document.getElementById('login-form');

// querySelector로는 classname, tagname 모두 검색이 가능하니까 id라는걸 명시해줘야 한다.
const loginForm = document.querySelector('#login-form');
const loginInput = document.querySelector('#login-form input');
// const loginButton = document.querySelector('#login-form button');

function onLoginBtnSubmit(tomato) {
    // let userName = loginInput.value;
    // if(userName === '') {
    //     alert('Please write ur name!') 
    // } else if(userName.length > 15 ) {
    //     alert('Ur name is too long!')
    // }
    // console.log(userName);  
    //form태그 안에 있는 button이나 type이 submit인 input을 클릭하면 내가작성한 데이터가 넘어가기 때문에 콘솔에 찍히지 않음!!!!!!!

    tomato.preventDefault();  // window의 기본동작을 막아주는 역할을 한다.
    console.log(tomato);
};

// loginButton.addEventListener('click', onLoginBtnClick);
loginForm.addEventListener('submit', onLoginBtnSubmit); // 제출되고 새로고침되는 상태


const link = document.querySelector('a');

function handleLinkClick(event){
    event.preventDefault();
    console.dir(event);
    // alert('clicked!!!');   // alert가 일시적으로 브라우저의 기본 동작을 못하게 막고 있음
}

link.addEventListener('click', handleLinkClick);










