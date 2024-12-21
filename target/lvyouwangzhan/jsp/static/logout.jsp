<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 function logout() {
			$.ajax({ 
                type: "GET",
                url: baseUrl + "users/logout",
                beforeSend: function(xhr) {
                    xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));
                },
               /*发送请求 请求成功回调函数*/
                success: function(res){               	
                	if(res.code == 0 || res.code == 401){
    					window.sessionStorage.clear();
						window.location.href="${pageContext.request.contextPath}/jsp/login.jsp"
                /*没有成功则弹出错误页面*/
					}else{
						alert(res.msg);	
					}
                },
            });
        }
        /* 跳转到前端*/
        function toFront() {
window.location.assign(baseUrl+'front');
}