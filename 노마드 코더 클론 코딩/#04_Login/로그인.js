// const loginForm = document.getElementById('login-form');

// querySelector로는 classname, tagname 모두 검색이 가능하니까 id라는걸 명시해줘야 한다.
const loginForm = document.querySelector('#login-form');
const loginInput = document.querySelector('#login-form input');
const loginButton = document.querySelector('#login-form button');

function onLoginBtnClick() {
    let userName = loginInput.value;
    // if(userName === '') {
    //     alert('Please write ur name!') 
    // } else if(userName.length > 15 ) {
    //     alert('Ur name is too long!')
    // }
    console.log(userName);  
    //form태그 안에 있는 button이나 type이 submit인 input을 클릭하면 내가작성한 데이터가 넘어가기 때문에 콘솔에 찍히지 않음!!!!!!!
};

loginButton.addEventListener('click', onLoginBtnClick);

















