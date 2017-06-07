//这是我们的一个Js函数库


function changeStatus(obj){
	if(obj.value=='worker'){
		$(".gra_spe").css("display","none");//隐藏大学生的选项内容
		$(".worker_sep").css("display","block"); //显示出已工作的选项内容
	}else if(obj.value=='graduate'){
		$(".gra_spe").css("display","block");
		$(".worker_sep").css("display","none");
	}
				
}


