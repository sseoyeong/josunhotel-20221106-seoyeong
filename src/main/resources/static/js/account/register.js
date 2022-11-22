const registerButton = document.querySelector(".active");

registerButton.onclick = () => {
    const accountInputs = document.querySelectorAll(".account-input");
    
    let user = {
        firstName: accountInputs[0].value,
        lastName: accountInputs[1].value,
        id: accountInputs[2].value,
        password: accountInputs[3].value
    }

    $.ajax({
        async: false,                       //필수
        type: "post",                       //필수
        url: "/api/account/register",       //필수
        contentType: "application/json",    //전송할 데이터가 json인 경우
        data: JSON.stringify(user),         //전송할 데이터가 있으면
        dataType: "json",                   //json외 text 등을 사용할 수 있지만 json 사용함
        success: (response, textStatus, request) => {              //성공시에 실행될 메소드
            console.log(response);
            const successURI = request.getResponseHeader("Location");
            location.replace(successURI + "?email=" + response.data);
        },
        error: (error) => {                 //실패시에 실행될 메소드
            console.log(error.responseJSON.data);
            loadErrorMessage(error.responseJSON.data);
        }
    });
}
