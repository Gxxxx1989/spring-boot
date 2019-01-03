
function load(){

	name=$("#username").val();

	password=$("#userpwd").val();

	var s ={

			"name":name,

			"pwd":password

			};

 	$.ajax({

 		type:"post",

 		url:"http://localhost/HBUweb/Login",

 		data:s,

 		cache: false,

 	    async : false,

 	    success: function (data ,textStatus, jqXHR)

         {

 	    	var x = Number(data);

 	    	if(x>=1){

 	    		window.location.href="./success.html";

 	    	}

 	    	else{

 	    		alert("error");

 	    	}

         },

	error:function (XMLHttpRequest, textStatus, errorThrown) {

	alert("failed");

         }

 	})

 }
