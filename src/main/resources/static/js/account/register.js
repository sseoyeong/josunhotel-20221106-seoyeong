const registerButton = document.querySelector(".active");

registerButton.onclick = () => {
    const accountInputs = document.querySelectorAll(".account-input");
    
    let user = {
        familyName: accountInputs[0].value,
        firstName: accountInputs[1].value,
        email: accountInputs[2].value,
        password: accountInputs[3].value,
        cfPassword: accountInputs[4].value
    }

    $.ajax({
        async: false,                      
        type: "post",                       
        url: "/api/account/register",       
        contentType: "application/json",  
        data: JSON.stringify(user),        
        dataType: "json",                  
        success: (response) => {                                                   
            alert("회원가입 요청 성공");
            console.log(response);
        },
        error: (error) => {                 
            alert("회원가입 요청 실패");
            console.log(error.responseJSON);
        }
    });

    
}
