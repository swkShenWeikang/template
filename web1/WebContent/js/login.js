$(function() {
	$("#login").unbind("click").click(function() {
		var account = $("#account").val();
		var password = $("#password").val();
		
		alert("111");
		
		$.ajax({
		    url:'http://localhost:8080/web1/login',
		    data:{
		    	"account":account,
		    	"password":password
		    },
		    type:'get',
		    dataType:'json',
		    async:false,
		    success:function(data, status){
		    	if(data.code == 0) {
					alert(data.msg);
				} else { 
					alert(data.msg);
				}
		    },
		    error:function(data, status, e){
		      console.log(data);
		    }
		  })
		
		
	});
});