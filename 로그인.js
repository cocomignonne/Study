// const loginForm = document.getElementById('login-form');

// querySelector로는 classname, tagname 모두 검색이 가능하니까 id라는걸 명시해줘야 한다.
const loginForm = document.querySelector('#login-form');
const loginInput = document.querySelector('#login-form input');
const loginButton = document.querySelector('#login-form button');

function onLoginBtnClick() {
    const userName = loginInput.value;
    console.log(userName); 
    // if(userName === '') {
    //     alert('Please write ur name!')
    // } else if(userName.length > 15 ) {
    //     alert('Ur name is too long!')
    // }
};



loginInput.addEventListener('click', onLoginBtnClick);

















